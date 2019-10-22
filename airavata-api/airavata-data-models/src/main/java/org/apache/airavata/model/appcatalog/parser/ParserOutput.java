/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.parser;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class ParserOutput implements org.apache.thrift.TBase<ParserOutput, ParserOutput._Fields>, java.io.Serializable, Cloneable, Comparable<ParserOutput> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ParserOutput");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField REQUIRED_OUTPUT_FIELD_DESC = new org.apache.thrift.protocol.TField("requiredOutput", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField PARSER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parserId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ParserOutputStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ParserOutputTupleSchemeFactory();

  private java.lang.String id; // required
  private java.lang.String name; // required
  private boolean requiredOutput; // required
  private java.lang.String parserId; // required
  private IOType type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    REQUIRED_OUTPUT((short)3, "requiredOutput"),
    PARSER_ID((short)4, "parserId"),
    /**
     * 
     * @see IOType
     */
    TYPE((short)5, "type");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // REQUIRED_OUTPUT
          return REQUIRED_OUTPUT;
        case 4: // PARSER_ID
          return PARSER_ID;
        case 5: // TYPE
          return TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REQUIREDOUTPUT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUIRED_OUTPUT, new org.apache.thrift.meta_data.FieldMetaData("requiredOutput", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PARSER_ID, new org.apache.thrift.meta_data.FieldMetaData("parserId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, IOType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ParserOutput.class, metaDataMap);
  }

  public ParserOutput() {
  }

  public ParserOutput(
    java.lang.String id,
    java.lang.String name,
    boolean requiredOutput,
    java.lang.String parserId,
    IOType type)
  {
    this();
    this.id = id;
    this.name = name;
    this.requiredOutput = requiredOutput;
    setRequiredOutputIsSet(true);
    this.parserId = parserId;
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ParserOutput(ParserOutput other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.requiredOutput = other.requiredOutput;
    if (other.isSetParserId()) {
      this.parserId = other.parserId;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
  }

  public ParserOutput deepCopy() {
    return new ParserOutput(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.name = null;
    setRequiredOutputIsSet(false);
    this.requiredOutput = false;
    this.parserId = null;
    this.type = null;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public boolean isRequiredOutput() {
    return this.requiredOutput;
  }

  public void setRequiredOutput(boolean requiredOutput) {
    this.requiredOutput = requiredOutput;
    setRequiredOutputIsSet(true);
  }

  public void unsetRequiredOutput() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REQUIREDOUTPUT_ISSET_ID);
  }

  /** Returns true if field requiredOutput is set (has been assigned a value) and false otherwise */
  public boolean isSetRequiredOutput() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REQUIREDOUTPUT_ISSET_ID);
  }

  public void setRequiredOutputIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REQUIREDOUTPUT_ISSET_ID, value);
  }

  public java.lang.String getParserId() {
    return this.parserId;
  }

  public void setParserId(java.lang.String parserId) {
    this.parserId = parserId;
  }

  public void unsetParserId() {
    this.parserId = null;
  }

  /** Returns true if field parserId is set (has been assigned a value) and false otherwise */
  public boolean isSetParserId() {
    return this.parserId != null;
  }

  public void setParserIdIsSet(boolean value) {
    if (!value) {
      this.parserId = null;
    }
  }

  /**
   * 
   * @see IOType
   */
  public IOType getType() {
    return this.type;
  }

  /**
   * 
   * @see IOType
   */
  public void setType(IOType type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case REQUIRED_OUTPUT:
      if (value == null) {
        unsetRequiredOutput();
      } else {
        setRequiredOutput((java.lang.Boolean)value);
      }
      break;

    case PARSER_ID:
      if (value == null) {
        unsetParserId();
      } else {
        setParserId((java.lang.String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((IOType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case REQUIRED_OUTPUT:
      return isRequiredOutput();

    case PARSER_ID:
      return getParserId();

    case TYPE:
      return getType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case REQUIRED_OUTPUT:
      return isSetRequiredOutput();
    case PARSER_ID:
      return isSetParserId();
    case TYPE:
      return isSetType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ParserOutput)
      return this.equals((ParserOutput)that);
    return false;
  }

  public boolean equals(ParserOutput that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_requiredOutput = true;
    boolean that_present_requiredOutput = true;
    if (this_present_requiredOutput || that_present_requiredOutput) {
      if (!(this_present_requiredOutput && that_present_requiredOutput))
        return false;
      if (this.requiredOutput != that.requiredOutput)
        return false;
    }

    boolean this_present_parserId = true && this.isSetParserId();
    boolean that_present_parserId = true && that.isSetParserId();
    if (this_present_parserId || that_present_parserId) {
      if (!(this_present_parserId && that_present_parserId))
        return false;
      if (!this.parserId.equals(that.parserId))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((requiredOutput) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetParserId()) ? 131071 : 524287);
    if (isSetParserId())
      hashCode = hashCode * 8191 + parserId.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(ParserOutput other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRequiredOutput()).compareTo(other.isSetRequiredOutput());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequiredOutput()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requiredOutput, other.requiredOutput);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetParserId()).compareTo(other.isSetParserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parserId, other.parserId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ParserOutput(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requiredOutput:");
    sb.append(this.requiredOutput);
    first = false;
    if (!first) sb.append(", ");
    sb.append("parserId:");
    if (this.parserId == null) {
      sb.append("null");
    } else {
      sb.append(this.parserId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' is unset! Struct:" + toString());
    }

    if (!isSetName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    if (!isSetRequiredOutput()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requiredOutput' is unset! Struct:" + toString());
    }

    if (!isSetParserId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'parserId' is unset! Struct:" + toString());
    }

    if (!isSetType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ParserOutputStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ParserOutputStandardScheme getScheme() {
      return new ParserOutputStandardScheme();
    }
  }

  private static class ParserOutputStandardScheme extends org.apache.thrift.scheme.StandardScheme<ParserOutput> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ParserOutput struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REQUIRED_OUTPUT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.requiredOutput = iprot.readBool();
              struct.setRequiredOutputIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARSER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parserId = iprot.readString();
              struct.setParserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.airavata.model.appcatalog.parser.IOType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ParserOutput struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REQUIRED_OUTPUT_FIELD_DESC);
      oprot.writeBool(struct.requiredOutput);
      oprot.writeFieldEnd();
      if (struct.parserId != null) {
        oprot.writeFieldBegin(PARSER_ID_FIELD_DESC);
        oprot.writeString(struct.parserId);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ParserOutputTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ParserOutputTupleScheme getScheme() {
      return new ParserOutputTupleScheme();
    }
  }

  private static class ParserOutputTupleScheme extends org.apache.thrift.scheme.TupleScheme<ParserOutput> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ParserOutput struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.id);
      oprot.writeString(struct.name);
      oprot.writeBool(struct.requiredOutput);
      oprot.writeString(struct.parserId);
      oprot.writeI32(struct.type.getValue());
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ParserOutput struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.id = iprot.readString();
      struct.setIdIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.requiredOutput = iprot.readBool();
      struct.setRequiredOutputIsSet(true);
      struct.parserId = iprot.readString();
      struct.setParserIdIsSet(true);
      struct.type = org.apache.airavata.model.appcatalog.parser.IOType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

