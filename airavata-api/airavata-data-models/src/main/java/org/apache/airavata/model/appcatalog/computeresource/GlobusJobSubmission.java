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
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.computeresource;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-18")
public class GlobusJobSubmission implements org.apache.thrift.TBase<GlobusJobSubmission, GlobusJobSubmission._Fields>, java.io.Serializable, Cloneable, Comparable<GlobusJobSubmission> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GlobusJobSubmission");

  private static final org.apache.thrift.protocol.TField JOB_SUBMISSION_INTERFACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobSubmissionInterfaceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SECURITY_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("securityProtocol", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField GLOBUS_GATE_KEEPER_END_POINT_FIELD_DESC = new org.apache.thrift.protocol.TField("globusGateKeeperEndPoint", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GlobusJobSubmissionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GlobusJobSubmissionTupleSchemeFactory());
  }

  private String jobSubmissionInterfaceId; // required
  private org.apache.airavata.model.data.movement.SecurityProtocol securityProtocol; // required
  private List<String> globusGateKeeperEndPoint; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_SUBMISSION_INTERFACE_ID((short)1, "jobSubmissionInterfaceId"),
    /**
     * 
     * @see org.apache.airavata.model.data.movement.SecurityProtocol
     */
    SECURITY_PROTOCOL((short)2, "securityProtocol"),
    GLOBUS_GATE_KEEPER_END_POINT((short)3, "globusGateKeeperEndPoint");

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
        case 1: // JOB_SUBMISSION_INTERFACE_ID
          return JOB_SUBMISSION_INTERFACE_ID;
        case 2: // SECURITY_PROTOCOL
          return SECURITY_PROTOCOL;
        case 3: // GLOBUS_GATE_KEEPER_END_POINT
          return GLOBUS_GATE_KEEPER_END_POINT;
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
  private static final _Fields optionals[] = {_Fields.GLOBUS_GATE_KEEPER_END_POINT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_SUBMISSION_INTERFACE_ID, new org.apache.thrift.meta_data.FieldMetaData("jobSubmissionInterfaceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECURITY_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("securityProtocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.airavata.model.data.movement.SecurityProtocol.class)));
    tmpMap.put(_Fields.GLOBUS_GATE_KEEPER_END_POINT, new org.apache.thrift.meta_data.FieldMetaData("globusGateKeeperEndPoint", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GlobusJobSubmission.class, metaDataMap);
  }

  public GlobusJobSubmission() {
    this.jobSubmissionInterfaceId = "DO_NOT_SET_AT_CLIENTS";

  }

  public GlobusJobSubmission(
    String jobSubmissionInterfaceId,
    org.apache.airavata.model.data.movement.SecurityProtocol securityProtocol)
  {
    this();
    this.jobSubmissionInterfaceId = jobSubmissionInterfaceId;
    this.securityProtocol = securityProtocol;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GlobusJobSubmission(GlobusJobSubmission other) {
    if (other.isSetJobSubmissionInterfaceId()) {
      this.jobSubmissionInterfaceId = other.jobSubmissionInterfaceId;
    }
    if (other.isSetSecurityProtocol()) {
      this.securityProtocol = other.securityProtocol;
    }
    if (other.isSetGlobusGateKeeperEndPoint()) {
      List<String> __this__globusGateKeeperEndPoint = new ArrayList<String>(other.globusGateKeeperEndPoint);
      this.globusGateKeeperEndPoint = __this__globusGateKeeperEndPoint;
    }
  }

  public GlobusJobSubmission deepCopy() {
    return new GlobusJobSubmission(this);
  }

  @Override
  public void clear() {
    this.jobSubmissionInterfaceId = "DO_NOT_SET_AT_CLIENTS";

    this.securityProtocol = null;
    this.globusGateKeeperEndPoint = null;
  }

  public String getJobSubmissionInterfaceId() {
    return this.jobSubmissionInterfaceId;
  }

  public void setJobSubmissionInterfaceId(String jobSubmissionInterfaceId) {
    this.jobSubmissionInterfaceId = jobSubmissionInterfaceId;
  }

  public void unsetJobSubmissionInterfaceId() {
    this.jobSubmissionInterfaceId = null;
  }

  /** Returns true if field jobSubmissionInterfaceId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobSubmissionInterfaceId() {
    return this.jobSubmissionInterfaceId != null;
  }

  public void setJobSubmissionInterfaceIdIsSet(boolean value) {
    if (!value) {
      this.jobSubmissionInterfaceId = null;
    }
  }

  /**
   * 
   * @see org.apache.airavata.model.data.movement.SecurityProtocol
   */
  public org.apache.airavata.model.data.movement.SecurityProtocol getSecurityProtocol() {
    return this.securityProtocol;
  }

  /**
   * 
   * @see org.apache.airavata.model.data.movement.SecurityProtocol
   */
  public void setSecurityProtocol(org.apache.airavata.model.data.movement.SecurityProtocol securityProtocol) {
    this.securityProtocol = securityProtocol;
  }

  public void unsetSecurityProtocol() {
    this.securityProtocol = null;
  }

  /** Returns true if field securityProtocol is set (has been assigned a value) and false otherwise */
  public boolean isSetSecurityProtocol() {
    return this.securityProtocol != null;
  }

  public void setSecurityProtocolIsSet(boolean value) {
    if (!value) {
      this.securityProtocol = null;
    }
  }

  public int getGlobusGateKeeperEndPointSize() {
    return (this.globusGateKeeperEndPoint == null) ? 0 : this.globusGateKeeperEndPoint.size();
  }

  public java.util.Iterator<String> getGlobusGateKeeperEndPointIterator() {
    return (this.globusGateKeeperEndPoint == null) ? null : this.globusGateKeeperEndPoint.iterator();
  }

  public void addToGlobusGateKeeperEndPoint(String elem) {
    if (this.globusGateKeeperEndPoint == null) {
      this.globusGateKeeperEndPoint = new ArrayList<String>();
    }
    this.globusGateKeeperEndPoint.add(elem);
  }

  public List<String> getGlobusGateKeeperEndPoint() {
    return this.globusGateKeeperEndPoint;
  }

  public void setGlobusGateKeeperEndPoint(List<String> globusGateKeeperEndPoint) {
    this.globusGateKeeperEndPoint = globusGateKeeperEndPoint;
  }

  public void unsetGlobusGateKeeperEndPoint() {
    this.globusGateKeeperEndPoint = null;
  }

  /** Returns true if field globusGateKeeperEndPoint is set (has been assigned a value) and false otherwise */
  public boolean isSetGlobusGateKeeperEndPoint() {
    return this.globusGateKeeperEndPoint != null;
  }

  public void setGlobusGateKeeperEndPointIsSet(boolean value) {
    if (!value) {
      this.globusGateKeeperEndPoint = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      if (value == null) {
        unsetJobSubmissionInterfaceId();
      } else {
        setJobSubmissionInterfaceId((String)value);
      }
      break;

    case SECURITY_PROTOCOL:
      if (value == null) {
        unsetSecurityProtocol();
      } else {
        setSecurityProtocol((org.apache.airavata.model.data.movement.SecurityProtocol)value);
      }
      break;

    case GLOBUS_GATE_KEEPER_END_POINT:
      if (value == null) {
        unsetGlobusGateKeeperEndPoint();
      } else {
        setGlobusGateKeeperEndPoint((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      return getJobSubmissionInterfaceId();

    case SECURITY_PROTOCOL:
      return getSecurityProtocol();

    case GLOBUS_GATE_KEEPER_END_POINT:
      return getGlobusGateKeeperEndPoint();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      return isSetJobSubmissionInterfaceId();
    case SECURITY_PROTOCOL:
      return isSetSecurityProtocol();
    case GLOBUS_GATE_KEEPER_END_POINT:
      return isSetGlobusGateKeeperEndPoint();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GlobusJobSubmission)
      return this.equals((GlobusJobSubmission)that);
    return false;
  }

  public boolean equals(GlobusJobSubmission that) {
    if (that == null)
      return false;

    boolean this_present_jobSubmissionInterfaceId = true && this.isSetJobSubmissionInterfaceId();
    boolean that_present_jobSubmissionInterfaceId = true && that.isSetJobSubmissionInterfaceId();
    if (this_present_jobSubmissionInterfaceId || that_present_jobSubmissionInterfaceId) {
      if (!(this_present_jobSubmissionInterfaceId && that_present_jobSubmissionInterfaceId))
        return false;
      if (!this.jobSubmissionInterfaceId.equals(that.jobSubmissionInterfaceId))
        return false;
    }

    boolean this_present_securityProtocol = true && this.isSetSecurityProtocol();
    boolean that_present_securityProtocol = true && that.isSetSecurityProtocol();
    if (this_present_securityProtocol || that_present_securityProtocol) {
      if (!(this_present_securityProtocol && that_present_securityProtocol))
        return false;
      if (!this.securityProtocol.equals(that.securityProtocol))
        return false;
    }

    boolean this_present_globusGateKeeperEndPoint = true && this.isSetGlobusGateKeeperEndPoint();
    boolean that_present_globusGateKeeperEndPoint = true && that.isSetGlobusGateKeeperEndPoint();
    if (this_present_globusGateKeeperEndPoint || that_present_globusGateKeeperEndPoint) {
      if (!(this_present_globusGateKeeperEndPoint && that_present_globusGateKeeperEndPoint))
        return false;
      if (!this.globusGateKeeperEndPoint.equals(that.globusGateKeeperEndPoint))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_jobSubmissionInterfaceId = true && (isSetJobSubmissionInterfaceId());
    list.add(present_jobSubmissionInterfaceId);
    if (present_jobSubmissionInterfaceId)
      list.add(jobSubmissionInterfaceId);

    boolean present_securityProtocol = true && (isSetSecurityProtocol());
    list.add(present_securityProtocol);
    if (present_securityProtocol)
      list.add(securityProtocol.getValue());

    boolean present_globusGateKeeperEndPoint = true && (isSetGlobusGateKeeperEndPoint());
    list.add(present_globusGateKeeperEndPoint);
    if (present_globusGateKeeperEndPoint)
      list.add(globusGateKeeperEndPoint);

    return list.hashCode();
  }

  @Override
  public int compareTo(GlobusJobSubmission other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobSubmissionInterfaceId()).compareTo(other.isSetJobSubmissionInterfaceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobSubmissionInterfaceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobSubmissionInterfaceId, other.jobSubmissionInterfaceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecurityProtocol()).compareTo(other.isSetSecurityProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecurityProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.securityProtocol, other.securityProtocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGlobusGateKeeperEndPoint()).compareTo(other.isSetGlobusGateKeeperEndPoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGlobusGateKeeperEndPoint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.globusGateKeeperEndPoint, other.globusGateKeeperEndPoint);
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
    StringBuilder sb = new StringBuilder("GlobusJobSubmission(");
    boolean first = true;

    sb.append("jobSubmissionInterfaceId:");
    if (this.jobSubmissionInterfaceId == null) {
      sb.append("null");
    } else {
      sb.append(this.jobSubmissionInterfaceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("securityProtocol:");
    if (this.securityProtocol == null) {
      sb.append("null");
    } else {
      sb.append(this.securityProtocol);
    }
    first = false;
    if (isSetGlobusGateKeeperEndPoint()) {
      if (!first) sb.append(", ");
      sb.append("globusGateKeeperEndPoint:");
      if (this.globusGateKeeperEndPoint == null) {
        sb.append("null");
      } else {
        sb.append(this.globusGateKeeperEndPoint);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJobSubmissionInterfaceId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobSubmissionInterfaceId' is unset! Struct:" + toString());
    }

    if (!isSetSecurityProtocol()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'securityProtocol' is unset! Struct:" + toString());
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

  private static class GlobusJobSubmissionStandardSchemeFactory implements SchemeFactory {
    public GlobusJobSubmissionStandardScheme getScheme() {
      return new GlobusJobSubmissionStandardScheme();
    }
  }

  private static class GlobusJobSubmissionStandardScheme extends StandardScheme<GlobusJobSubmission> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GlobusJobSubmission struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_SUBMISSION_INTERFACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobSubmissionInterfaceId = iprot.readString();
              struct.setJobSubmissionInterfaceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SECURITY_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.securityProtocol = org.apache.airavata.model.data.movement.SecurityProtocol.findByValue(iprot.readI32());
              struct.setSecurityProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GLOBUS_GATE_KEEPER_END_POINT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.globusGateKeeperEndPoint = new ArrayList<String>(_list18.size);
                String _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = iprot.readString();
                  struct.globusGateKeeperEndPoint.add(_elem19);
                }
                iprot.readListEnd();
              }
              struct.setGlobusGateKeeperEndPointIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GlobusJobSubmission struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobSubmissionInterfaceId != null) {
        oprot.writeFieldBegin(JOB_SUBMISSION_INTERFACE_ID_FIELD_DESC);
        oprot.writeString(struct.jobSubmissionInterfaceId);
        oprot.writeFieldEnd();
      }
      if (struct.securityProtocol != null) {
        oprot.writeFieldBegin(SECURITY_PROTOCOL_FIELD_DESC);
        oprot.writeI32(struct.securityProtocol.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.globusGateKeeperEndPoint != null) {
        if (struct.isSetGlobusGateKeeperEndPoint()) {
          oprot.writeFieldBegin(GLOBUS_GATE_KEEPER_END_POINT_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.globusGateKeeperEndPoint.size()));
            for (String _iter21 : struct.globusGateKeeperEndPoint)
            {
              oprot.writeString(_iter21);
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

  private static class GlobusJobSubmissionTupleSchemeFactory implements SchemeFactory {
    public GlobusJobSubmissionTupleScheme getScheme() {
      return new GlobusJobSubmissionTupleScheme();
    }
  }

  private static class GlobusJobSubmissionTupleScheme extends TupleScheme<GlobusJobSubmission> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GlobusJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.jobSubmissionInterfaceId);
      oprot.writeI32(struct.securityProtocol.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetGlobusGateKeeperEndPoint()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetGlobusGateKeeperEndPoint()) {
        {
          oprot.writeI32(struct.globusGateKeeperEndPoint.size());
          for (String _iter22 : struct.globusGateKeeperEndPoint)
          {
            oprot.writeString(_iter22);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GlobusJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobSubmissionInterfaceId = iprot.readString();
      struct.setJobSubmissionInterfaceIdIsSet(true);
      struct.securityProtocol = org.apache.airavata.model.data.movement.SecurityProtocol.findByValue(iprot.readI32());
      struct.setSecurityProtocolIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.globusGateKeeperEndPoint = new ArrayList<String>(_list23.size);
          String _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = iprot.readString();
            struct.globusGateKeeperEndPoint.add(_elem24);
          }
        }
        struct.setGlobusGateKeeperEndPointIsSet(true);
      }
    }
  }

}

