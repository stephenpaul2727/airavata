    /*
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
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.gatewayprofile;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Gateway Profile
 * 
 * gatewayID:
 *   Unique identifier for the gateway assigned by Airavata
 * 
 * gatewayName:
 *   Name of the Gateway.
 * 
 * ipAddress:
 *   IP Addresse of the Hostname.
 * 
 * resourceDescription:
 *  A user friendly description of the hostname.
 * 
 * JobSubmissionProtocols:
 *  A computational resources may have one or more ways of submitting Jobs. This structure
 *  will hold all available mechanisms to interact with the resource.
 * 
 * DataMovementProtocol:
 *  Option to specify a prefered data movement mechanism of the available options.
 * 
 */
@SuppressWarnings("all") public class GatewayProfile implements org.apache.thrift.TBase<GatewayProfile, GatewayProfile._Fields>, java.io.Serializable, Cloneable, Comparable<GatewayProfile> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GatewayProfile");

  private static final org.apache.thrift.protocol.TField GATEWAY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GATEWAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField GATEWAY_DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayDescription", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COMPUTE_RESOURCE_PREFERENCES_FIELD_DESC = new org.apache.thrift.protocol.TField("computeResourcePreferences", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GatewayProfileStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GatewayProfileTupleSchemeFactory());
  }

  private String gatewayID; // required
  private String gatewayName; // required
  private String gatewayDescription; // optional
  private List<ComputeResourcePreference> computeResourcePreferences; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GATEWAY_ID((short)1, "gatewayID"),
    GATEWAY_NAME((short)2, "gatewayName"),
    GATEWAY_DESCRIPTION((short)3, "gatewayDescription"),
    COMPUTE_RESOURCE_PREFERENCES((short)4, "computeResourcePreferences");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GATEWAY_ID
          return GATEWAY_ID;
        case 2: // GATEWAY_NAME
          return GATEWAY_NAME;
        case 3: // GATEWAY_DESCRIPTION
          return GATEWAY_DESCRIPTION;
        case 4: // COMPUTE_RESOURCE_PREFERENCES
          return COMPUTE_RESOURCE_PREFERENCES;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.GATEWAY_DESCRIPTION,_Fields.COMPUTE_RESOURCE_PREFERENCES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GATEWAY_ID, new org.apache.thrift.meta_data.FieldMetaData("gatewayID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GATEWAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("gatewayName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GATEWAY_DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("gatewayDescription", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMPUTE_RESOURCE_PREFERENCES, new org.apache.thrift.meta_data.FieldMetaData("computeResourcePreferences", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComputeResourcePreference.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GatewayProfile.class, metaDataMap);
  }

  public GatewayProfile() {
    this.gatewayID = "DO_NOT_SET_AT_CLIENTS";

  }

  public GatewayProfile(
    String gatewayID,
    String gatewayName)
  {
    this();
    this.gatewayID = gatewayID;
    this.gatewayName = gatewayName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GatewayProfile(GatewayProfile other) {
    if (other.isSetGatewayID()) {
      this.gatewayID = other.gatewayID;
    }
    if (other.isSetGatewayName()) {
      this.gatewayName = other.gatewayName;
    }
    if (other.isSetGatewayDescription()) {
      this.gatewayDescription = other.gatewayDescription;
    }
    if (other.isSetComputeResourcePreferences()) {
      List<ComputeResourcePreference> __this__computeResourcePreferences = new ArrayList<ComputeResourcePreference>(other.computeResourcePreferences.size());
      for (ComputeResourcePreference other_element : other.computeResourcePreferences) {
        __this__computeResourcePreferences.add(new ComputeResourcePreference(other_element));
      }
      this.computeResourcePreferences = __this__computeResourcePreferences;
    }
  }

  public GatewayProfile deepCopy() {
    return new GatewayProfile(this);
  }

  @Override
  public void clear() {
    this.gatewayID = "DO_NOT_SET_AT_CLIENTS";

    this.gatewayName = null;
    this.gatewayDescription = null;
    this.computeResourcePreferences = null;
  }

  public String getGatewayID() {
    return this.gatewayID;
  }

  public void setGatewayID(String gatewayID) {
    this.gatewayID = gatewayID;
  }

  public void unsetGatewayID() {
    this.gatewayID = null;
  }

  /** Returns true if field gatewayID is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayID() {
    return this.gatewayID != null;
  }

  public void setGatewayIDIsSet(boolean value) {
    if (!value) {
      this.gatewayID = null;
    }
  }

  public String getGatewayName() {
    return this.gatewayName;
  }

  public void setGatewayName(String gatewayName) {
    this.gatewayName = gatewayName;
  }

  public void unsetGatewayName() {
    this.gatewayName = null;
  }

  /** Returns true if field gatewayName is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayName() {
    return this.gatewayName != null;
  }

  public void setGatewayNameIsSet(boolean value) {
    if (!value) {
      this.gatewayName = null;
    }
  }

  public String getGatewayDescription() {
    return this.gatewayDescription;
  }

  public void setGatewayDescription(String gatewayDescription) {
    this.gatewayDescription = gatewayDescription;
  }

  public void unsetGatewayDescription() {
    this.gatewayDescription = null;
  }

  /** Returns true if field gatewayDescription is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayDescription() {
    return this.gatewayDescription != null;
  }

  public void setGatewayDescriptionIsSet(boolean value) {
    if (!value) {
      this.gatewayDescription = null;
    }
  }

  public int getComputeResourcePreferencesSize() {
    return (this.computeResourcePreferences == null) ? 0 : this.computeResourcePreferences.size();
  }

  public java.util.Iterator<ComputeResourcePreference> getComputeResourcePreferencesIterator() {
    return (this.computeResourcePreferences == null) ? null : this.computeResourcePreferences.iterator();
  }

  public void addToComputeResourcePreferences(ComputeResourcePreference elem) {
    if (this.computeResourcePreferences == null) {
      this.computeResourcePreferences = new ArrayList<ComputeResourcePreference>();
    }
    this.computeResourcePreferences.add(elem);
  }

  public List<ComputeResourcePreference> getComputeResourcePreferences() {
    return this.computeResourcePreferences;
  }

  public void setComputeResourcePreferences(List<ComputeResourcePreference> computeResourcePreferences) {
    this.computeResourcePreferences = computeResourcePreferences;
  }

  public void unsetComputeResourcePreferences() {
    this.computeResourcePreferences = null;
  }

  /** Returns true if field computeResourcePreferences is set (has been assigned a value) and false otherwise */
  public boolean isSetComputeResourcePreferences() {
    return this.computeResourcePreferences != null;
  }

  public void setComputeResourcePreferencesIsSet(boolean value) {
    if (!value) {
      this.computeResourcePreferences = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GATEWAY_ID:
      if (value == null) {
        unsetGatewayID();
      } else {
        setGatewayID((String)value);
      }
      break;

    case GATEWAY_NAME:
      if (value == null) {
        unsetGatewayName();
      } else {
        setGatewayName((String)value);
      }
      break;

    case GATEWAY_DESCRIPTION:
      if (value == null) {
        unsetGatewayDescription();
      } else {
        setGatewayDescription((String)value);
      }
      break;

    case COMPUTE_RESOURCE_PREFERENCES:
      if (value == null) {
        unsetComputeResourcePreferences();
      } else {
        setComputeResourcePreferences((List<ComputeResourcePreference>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GATEWAY_ID:
      return getGatewayID();

    case GATEWAY_NAME:
      return getGatewayName();

    case GATEWAY_DESCRIPTION:
      return getGatewayDescription();

    case COMPUTE_RESOURCE_PREFERENCES:
      return getComputeResourcePreferences();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GATEWAY_ID:
      return isSetGatewayID();
    case GATEWAY_NAME:
      return isSetGatewayName();
    case GATEWAY_DESCRIPTION:
      return isSetGatewayDescription();
    case COMPUTE_RESOURCE_PREFERENCES:
      return isSetComputeResourcePreferences();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GatewayProfile)
      return this.equals((GatewayProfile)that);
    return false;
  }

  public boolean equals(GatewayProfile that) {
    if (that == null)
      return false;

    boolean this_present_gatewayID = true && this.isSetGatewayID();
    boolean that_present_gatewayID = true && that.isSetGatewayID();
    if (this_present_gatewayID || that_present_gatewayID) {
      if (!(this_present_gatewayID && that_present_gatewayID))
        return false;
      if (!this.gatewayID.equals(that.gatewayID))
        return false;
    }

    boolean this_present_gatewayName = true && this.isSetGatewayName();
    boolean that_present_gatewayName = true && that.isSetGatewayName();
    if (this_present_gatewayName || that_present_gatewayName) {
      if (!(this_present_gatewayName && that_present_gatewayName))
        return false;
      if (!this.gatewayName.equals(that.gatewayName))
        return false;
    }

    boolean this_present_gatewayDescription = true && this.isSetGatewayDescription();
    boolean that_present_gatewayDescription = true && that.isSetGatewayDescription();
    if (this_present_gatewayDescription || that_present_gatewayDescription) {
      if (!(this_present_gatewayDescription && that_present_gatewayDescription))
        return false;
      if (!this.gatewayDescription.equals(that.gatewayDescription))
        return false;
    }

    boolean this_present_computeResourcePreferences = true && this.isSetComputeResourcePreferences();
    boolean that_present_computeResourcePreferences = true && that.isSetComputeResourcePreferences();
    if (this_present_computeResourcePreferences || that_present_computeResourcePreferences) {
      if (!(this_present_computeResourcePreferences && that_present_computeResourcePreferences))
        return false;
      if (!this.computeResourcePreferences.equals(that.computeResourcePreferences))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(GatewayProfile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGatewayID()).compareTo(other.isSetGatewayID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayID, other.gatewayID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGatewayName()).compareTo(other.isSetGatewayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayName, other.gatewayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGatewayDescription()).compareTo(other.isSetGatewayDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayDescription, other.gatewayDescription);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComputeResourcePreferences()).compareTo(other.isSetComputeResourcePreferences());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComputeResourcePreferences()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.computeResourcePreferences, other.computeResourcePreferences);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GatewayProfile(");
    boolean first = true;

    sb.append("gatewayID:");
    if (this.gatewayID == null) {
      sb.append("null");
    } else {
      sb.append(this.gatewayID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("gatewayName:");
    if (this.gatewayName == null) {
      sb.append("null");
    } else {
      sb.append(this.gatewayName);
    }
    first = false;
    if (isSetGatewayDescription()) {
      if (!first) sb.append(", ");
      sb.append("gatewayDescription:");
      if (this.gatewayDescription == null) {
        sb.append("null");
      } else {
        sb.append(this.gatewayDescription);
      }
      first = false;
    }
    if (isSetComputeResourcePreferences()) {
      if (!first) sb.append(", ");
      sb.append("computeResourcePreferences:");
      if (this.computeResourcePreferences == null) {
        sb.append("null");
      } else {
        sb.append(this.computeResourcePreferences);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetGatewayID()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gatewayID' is unset! Struct:" + toString());
    }

    if (!isSetGatewayName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gatewayName' is unset! Struct:" + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GatewayProfileStandardSchemeFactory implements SchemeFactory {
    public GatewayProfileStandardScheme getScheme() {
      return new GatewayProfileStandardScheme();
    }
  }

  private static class GatewayProfileStandardScheme extends StandardScheme<GatewayProfile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GatewayProfile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GATEWAY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayID = iprot.readString();
              struct.setGatewayIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GATEWAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayName = iprot.readString();
              struct.setGatewayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GATEWAY_DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayDescription = iprot.readString();
              struct.setGatewayDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMPUTE_RESOURCE_PREFERENCES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.computeResourcePreferences = new ArrayList<ComputeResourcePreference>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  ComputeResourcePreference _elem2;
                  _elem2 = new ComputeResourcePreference();
                  _elem2.read(iprot);
                  struct.computeResourcePreferences.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setComputeResourcePreferencesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GatewayProfile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.gatewayID != null) {
        oprot.writeFieldBegin(GATEWAY_ID_FIELD_DESC);
        oprot.writeString(struct.gatewayID);
        oprot.writeFieldEnd();
      }
      if (struct.gatewayName != null) {
        oprot.writeFieldBegin(GATEWAY_NAME_FIELD_DESC);
        oprot.writeString(struct.gatewayName);
        oprot.writeFieldEnd();
      }
      if (struct.gatewayDescription != null) {
        if (struct.isSetGatewayDescription()) {
          oprot.writeFieldBegin(GATEWAY_DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.gatewayDescription);
          oprot.writeFieldEnd();
        }
      }
      if (struct.computeResourcePreferences != null) {
        if (struct.isSetComputeResourcePreferences()) {
          oprot.writeFieldBegin(COMPUTE_RESOURCE_PREFERENCES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.computeResourcePreferences.size()));
            for (ComputeResourcePreference _iter3 : struct.computeResourcePreferences)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GatewayProfileTupleSchemeFactory implements SchemeFactory {
    public GatewayProfileTupleScheme getScheme() {
      return new GatewayProfileTupleScheme();
    }
  }

  private static class GatewayProfileTupleScheme extends TupleScheme<GatewayProfile> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GatewayProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.gatewayID);
      oprot.writeString(struct.gatewayName);
      BitSet optionals = new BitSet();
      if (struct.isSetGatewayDescription()) {
        optionals.set(0);
      }
      if (struct.isSetComputeResourcePreferences()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetGatewayDescription()) {
        oprot.writeString(struct.gatewayDescription);
      }
      if (struct.isSetComputeResourcePreferences()) {
        {
          oprot.writeI32(struct.computeResourcePreferences.size());
          for (ComputeResourcePreference _iter4 : struct.computeResourcePreferences)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GatewayProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.gatewayID = iprot.readString();
      struct.setGatewayIDIsSet(true);
      struct.gatewayName = iprot.readString();
      struct.setGatewayNameIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.gatewayDescription = iprot.readString();
        struct.setGatewayDescriptionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.computeResourcePreferences = new ArrayList<ComputeResourcePreference>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            ComputeResourcePreference _elem7;
            _elem7 = new ComputeResourcePreference();
            _elem7.read(iprot);
            struct.computeResourcePreferences.add(_elem7);
          }
        }
        struct.setComputeResourcePreferencesIsSet(true);
      }
    }
  }

}
