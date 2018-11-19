--
--
-- Licensed to the Apache Software Foundation (ASF) under one
-- or more contributor license agreements.  See the NOTICE file
-- distributed with this work for additional information
-- regarding copyright ownership.  The ASF licenses this file
-- to you under the Apache License, Version 2.0 (the
-- "License"); you may not use this file except in compliance
-- with the License.  You may obtain a copy of the License at
--
--   http://www.apache.org/licenses/LICENSE-2.0
--
-- Unless required by applicable law or agreed to in writing,
-- software distributed under the License is distributed on an
-- "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
-- KIND, either express or implied.  See the License for the
-- specific language governing permissions and limitations
-- under the License.
--

-- AIRAVATA-2768
alter table EXPERIMENT_INPUT modify METADATA VARCHAR(4096);

-- AIRAVATA-2820
alter table TASK drop column TASK_INTERNAL_STORE;

-- AIRAVATA-2827: OpenJPA 2.4.3 upgrade, convert BIT -> TINYINT(1)
alter table PROCESS modify column USE_USER_CR_PREF tinyint(1);
alter table QUEUE_STATUS modify column QUEUE_UP tinyint(1);
alter table USER_CONFIGURATION_DATA modify column IS_USE_USER_CR_PREF tinyint(1);

-- AIRAVATA-2899
alter table PROCESS_STATUS modify column TIME_OF_STATE_CHANGE TIMESTAMP(6) DEFAULT NOW(6) ON UPDATE NOW(6);
alter table TASK_STATUS modify column TIME_OF_STATE_CHANGE TIMESTAMP(6) DEFAULT NOW(6) ON UPDATE NOW(6);
alter table JOB_STATUS modify column TIME_OF_STATE_CHANGE TIMESTAMP(6) DEFAULT NOW(6) ON UPDATE NOW(6);

-- AIRAVATA-2872: NOT NULL foreign key columsn
set FOREIGN_KEY_CHECKS=0;
alter table USERS modify column GATEWAY_ID VARCHAR(255) NOT NULL;
alter table GATEWAY_WORKER modify column GATEWAY_ID VARCHAR(255) NOT NULL;
alter table PROJECT modify column GATEWAY_ID VARCHAR(255) NOT NULL;
alter table PROJECT_USER modify column PROJECT_ID VARCHAR(255) NOT NULL;
alter table PROJECT_USER modify column USER_NAME VARCHAR(255) NOT NULL;
alter table EXPERIMENT modify column PROJECT_ID VARCHAR(255) NOT NULL;
alter table EXPERIMENT_INPUT modify column EXPERIMENT_ID VARCHAR(255) NOT NULL;
alter table EXPERIMENT_OUTPUT modify column EXPERIMENT_ID VARCHAR(255) NOT NULL;
alter table EXPERIMENT_STATUS modify column EXPERIMENT_ID VARCHAR(255) NOT NULL;
alter table EXPERIMENT_ERROR modify column EXPERIMENT_ID VARCHAR(255) NOT NULL;
alter table USER_CONFIGURATION_DATA modify column EXPERIMENT_ID VARCHAR(255) NOT NULL;
alter table PROCESS modify column EXPERIMENT_ID VARCHAR(255) NOT NULL;
alter table PROCESS_INPUT modify column PROCESS_ID VARCHAR(255) NOT NULL;
alter table PROCESS_OUTPUT modify column PROCESS_ID VARCHAR(255) NOT NULL;
alter table PROCESS_STATUS modify column PROCESS_ID VARCHAR(255) NOT NULL;
alter table PROCESS_ERROR modify column PROCESS_ID VARCHAR(255) NOT NULL;
alter table PROCESS_RESOURCE_SCHEDULE modify column PROCESS_ID VARCHAR(255) NOT NULL;
alter table TASK modify column PARENT_PROCESS_ID VARCHAR(255) NOT NULL;
alter table TASK_STATUS modify column TASK_ID VARCHAR(255) NOT NULL;
alter table TASK_ERROR modify column TASK_ID VARCHAR(255) NOT NULL;
alter table JOB modify column TASK_ID VARCHAR(255) NOT NULL;
alter table JOB_STATUS modify column TASK_ID VARCHAR(255) NOT NULL;
alter table JOB_STATUS modify column JOB_ID VARCHAR(255) NOT NULL;
set FOREIGN_KEY_CHECKS=1;