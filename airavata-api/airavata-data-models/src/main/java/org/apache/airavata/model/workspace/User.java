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
package org.apache.airavata.model.workspace;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-20")
public class User implements org.apache.thrift.TBase<User, User._Fields>, java.io.Serializable, Cloneable, Comparable<User> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("User");

  private static final org.apache.thrift.protocol.TField AIRAVATA_INTERNAL_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("airavataInternalUserId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField GATEWAY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FIRST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("firstName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField LAST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastName", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserTupleSchemeFactory());
  }

  private String airavataInternalUserId; // required
  private String userName; // optional
  private String gatewayId; // required
  private String firstName; // optional
  private String lastName; // optional
  private String email; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AIRAVATA_INTERNAL_USER_ID((short)1, "airavataInternalUserId"),
    USER_NAME((short)2, "userName"),
    GATEWAY_ID((short)3, "gatewayId"),
    FIRST_NAME((short)4, "firstName"),
    LAST_NAME((short)5, "lastName"),
    EMAIL((short)6, "email");

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
        case 1: // AIRAVATA_INTERNAL_USER_ID
          return AIRAVATA_INTERNAL_USER_ID;
        case 2: // USER_NAME
          return USER_NAME;
        case 3: // GATEWAY_ID
          return GATEWAY_ID;
        case 4: // FIRST_NAME
          return FIRST_NAME;
        case 5: // LAST_NAME
          return LAST_NAME;
        case 6: // EMAIL
          return EMAIL;
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
  private static final _Fields optionals[] = {_Fields.USER_NAME,_Fields.FIRST_NAME,_Fields.LAST_NAME,_Fields.EMAIL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AIRAVATA_INTERNAL_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("airavataInternalUserId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GATEWAY_ID, new org.apache.thrift.meta_data.FieldMetaData("gatewayId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FIRST_NAME, new org.apache.thrift.meta_data.FieldMetaData("firstName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_NAME, new org.apache.thrift.meta_data.FieldMetaData("lastName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
  }

  public User() {
    this.airavataInternalUserId = "DO_NOT_SET_AT_CLIENTS";

  }

  public User(
    String airavataInternalUserId,
    String gatewayId)
  {
    this();
    this.airavataInternalUserId = airavataInternalUserId;
    this.gatewayId = gatewayId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public User(User other) {
    if (other.isSetAiravataInternalUserId()) {
      this.airavataInternalUserId = other.airavataInternalUserId;
    }
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetGatewayId()) {
      this.gatewayId = other.gatewayId;
    }
    if (other.isSetFirstName()) {
      this.firstName = other.firstName;
    }
    if (other.isSetLastName()) {
      this.lastName = other.lastName;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
  }

  public User deepCopy() {
    return new User(this);
  }

  @Override
  public void clear() {
    this.airavataInternalUserId = "DO_NOT_SET_AT_CLIENTS";

    this.userName = null;
    this.gatewayId = null;
    this.firstName = null;
    this.lastName = null;
    this.email = null;
  }

  public String getAiravataInternalUserId() {
    return this.airavataInternalUserId;
  }

  public void setAiravataInternalUserId(String airavataInternalUserId) {
    this.airavataInternalUserId = airavataInternalUserId;
  }

  public void unsetAiravataInternalUserId() {
    this.airavataInternalUserId = null;
  }

  /** Returns true if field airavataInternalUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetAiravataInternalUserId() {
    return this.airavataInternalUserId != null;
  }

  public void setAiravataInternalUserIdIsSet(boolean value) {
    if (!value) {
      this.airavataInternalUserId = null;
    }
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public String getGatewayId() {
    return this.gatewayId;
  }

  public void setGatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
  }

  public void unsetGatewayId() {
    this.gatewayId = null;
  }

  /** Returns true if field gatewayId is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayId() {
    return this.gatewayId != null;
  }

  public void setGatewayIdIsSet(boolean value) {
    if (!value) {
      this.gatewayId = null;
    }
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void unsetFirstName() {
    this.firstName = null;
  }

  /** Returns true if field firstName is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstName() {
    return this.firstName != null;
  }

  public void setFirstNameIsSet(boolean value) {
    if (!value) {
      this.firstName = null;
    }
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void unsetLastName() {
    this.lastName = null;
  }

  /** Returns true if field lastName is set (has been assigned a value) and false otherwise */
  public boolean isSetLastName() {
    return this.lastName != null;
  }

  public void setLastNameIsSet(boolean value) {
    if (!value) {
      this.lastName = null;
    }
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AIRAVATA_INTERNAL_USER_ID:
      if (value == null) {
        unsetAiravataInternalUserId();
      } else {
        setAiravataInternalUserId((String)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    case GATEWAY_ID:
      if (value == null) {
        unsetGatewayId();
      } else {
        setGatewayId((String)value);
      }
      break;

    case FIRST_NAME:
      if (value == null) {
        unsetFirstName();
      } else {
        setFirstName((String)value);
      }
      break;

    case LAST_NAME:
      if (value == null) {
        unsetLastName();
      } else {
        setLastName((String)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AIRAVATA_INTERNAL_USER_ID:
      return getAiravataInternalUserId();

    case USER_NAME:
      return getUserName();

    case GATEWAY_ID:
      return getGatewayId();

    case FIRST_NAME:
      return getFirstName();

    case LAST_NAME:
      return getLastName();

    case EMAIL:
      return getEmail();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AIRAVATA_INTERNAL_USER_ID:
      return isSetAiravataInternalUserId();
    case USER_NAME:
      return isSetUserName();
    case GATEWAY_ID:
      return isSetGatewayId();
    case FIRST_NAME:
      return isSetFirstName();
    case LAST_NAME:
      return isSetLastName();
    case EMAIL:
      return isSetEmail();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof User)
      return this.equals((User)that);
    return false;
  }

  public boolean equals(User that) {
    if (that == null)
      return false;

    boolean this_present_airavataInternalUserId = true && this.isSetAiravataInternalUserId();
    boolean that_present_airavataInternalUserId = true && that.isSetAiravataInternalUserId();
    if (this_present_airavataInternalUserId || that_present_airavataInternalUserId) {
      if (!(this_present_airavataInternalUserId && that_present_airavataInternalUserId))
        return false;
      if (!this.airavataInternalUserId.equals(that.airavataInternalUserId))
        return false;
    }

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_gatewayId = true && this.isSetGatewayId();
    boolean that_present_gatewayId = true && that.isSetGatewayId();
    if (this_present_gatewayId || that_present_gatewayId) {
      if (!(this_present_gatewayId && that_present_gatewayId))
        return false;
      if (!this.gatewayId.equals(that.gatewayId))
        return false;
    }

    boolean this_present_firstName = true && this.isSetFirstName();
    boolean that_present_firstName = true && that.isSetFirstName();
    if (this_present_firstName || that_present_firstName) {
      if (!(this_present_firstName && that_present_firstName))
        return false;
      if (!this.firstName.equals(that.firstName))
        return false;
    }

    boolean this_present_lastName = true && this.isSetLastName();
    boolean that_present_lastName = true && that.isSetLastName();
    if (this_present_lastName || that_present_lastName) {
      if (!(this_present_lastName && that_present_lastName))
        return false;
      if (!this.lastName.equals(that.lastName))
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_airavataInternalUserId = true && (isSetAiravataInternalUserId());
    list.add(present_airavataInternalUserId);
    if (present_airavataInternalUserId)
      list.add(airavataInternalUserId);

    boolean present_userName = true && (isSetUserName());
    list.add(present_userName);
    if (present_userName)
      list.add(userName);

    boolean present_gatewayId = true && (isSetGatewayId());
    list.add(present_gatewayId);
    if (present_gatewayId)
      list.add(gatewayId);

    boolean present_firstName = true && (isSetFirstName());
    list.add(present_firstName);
    if (present_firstName)
      list.add(firstName);

    boolean present_lastName = true && (isSetLastName());
    list.add(present_lastName);
    if (present_lastName)
      list.add(lastName);

    boolean present_email = true && (isSetEmail());
    list.add(present_email);
    if (present_email)
      list.add(email);

    return list.hashCode();
  }

  @Override
  public int compareTo(User other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAiravataInternalUserId()).compareTo(other.isSetAiravataInternalUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAiravataInternalUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.airavataInternalUserId, other.airavataInternalUserId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGatewayId()).compareTo(other.isSetGatewayId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayId, other.gatewayId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFirstName()).compareTo(other.isSetFirstName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstName, other.firstName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastName()).compareTo(other.isSetLastName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastName, other.lastName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
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
    StringBuilder sb = new StringBuilder("User(");
    boolean first = true;

    sb.append("airavataInternalUserId:");
    if (this.airavataInternalUserId == null) {
      sb.append("null");
    } else {
      sb.append(this.airavataInternalUserId);
    }
    first = false;
    if (isSetUserName()) {
      if (!first) sb.append(", ");
      sb.append("userName:");
      if (this.userName == null) {
        sb.append("null");
      } else {
        sb.append(this.userName);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("gatewayId:");
    if (this.gatewayId == null) {
      sb.append("null");
    } else {
      sb.append(this.gatewayId);
    }
    first = false;
    if (isSetFirstName()) {
      if (!first) sb.append(", ");
      sb.append("firstName:");
      if (this.firstName == null) {
        sb.append("null");
      } else {
        sb.append(this.firstName);
      }
      first = false;
    }
    if (isSetLastName()) {
      if (!first) sb.append(", ");
      sb.append("lastName:");
      if (this.lastName == null) {
        sb.append("null");
      } else {
        sb.append(this.lastName);
      }
      first = false;
    }
    if (isSetEmail()) {
      if (!first) sb.append(", ");
      sb.append("email:");
      if (this.email == null) {
        sb.append("null");
      } else {
        sb.append(this.email);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetAiravataInternalUserId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'airavataInternalUserId' is unset! Struct:" + toString());
    }

    if (!isSetGatewayId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gatewayId' is unset! Struct:" + toString());
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

  private static class UserStandardSchemeFactory implements SchemeFactory {
    public UserStandardScheme getScheme() {
      return new UserStandardScheme();
    }
  }

  private static class UserStandardScheme extends StandardScheme<User> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, User struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AIRAVATA_INTERNAL_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.airavataInternalUserId = iprot.readString();
              struct.setAiravataInternalUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GATEWAY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayId = iprot.readString();
              struct.setGatewayIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FIRST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.firstName = iprot.readString();
              struct.setFirstNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LAST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastName = iprot.readString();
              struct.setLastNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, User struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.airavataInternalUserId != null) {
        oprot.writeFieldBegin(AIRAVATA_INTERNAL_USER_ID_FIELD_DESC);
        oprot.writeString(struct.airavataInternalUserId);
        oprot.writeFieldEnd();
      }
      if (struct.userName != null) {
        if (struct.isSetUserName()) {
          oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
          oprot.writeString(struct.userName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.gatewayId != null) {
        oprot.writeFieldBegin(GATEWAY_ID_FIELD_DESC);
        oprot.writeString(struct.gatewayId);
        oprot.writeFieldEnd();
      }
      if (struct.firstName != null) {
        if (struct.isSetFirstName()) {
          oprot.writeFieldBegin(FIRST_NAME_FIELD_DESC);
          oprot.writeString(struct.firstName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.lastName != null) {
        if (struct.isSetLastName()) {
          oprot.writeFieldBegin(LAST_NAME_FIELD_DESC);
          oprot.writeString(struct.lastName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.email != null) {
        if (struct.isSetEmail()) {
          oprot.writeFieldBegin(EMAIL_FIELD_DESC);
          oprot.writeString(struct.email);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserTupleSchemeFactory implements SchemeFactory {
    public UserTupleScheme getScheme() {
      return new UserTupleScheme();
    }
  }

  private static class UserTupleScheme extends TupleScheme<User> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.airavataInternalUserId);
      oprot.writeString(struct.gatewayId);
      BitSet optionals = new BitSet();
      if (struct.isSetUserName()) {
        optionals.set(0);
      }
      if (struct.isSetFirstName()) {
        optionals.set(1);
      }
      if (struct.isSetLastName()) {
        optionals.set(2);
      }
      if (struct.isSetEmail()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUserName()) {
        oprot.writeString(struct.userName);
      }
      if (struct.isSetFirstName()) {
        oprot.writeString(struct.firstName);
      }
      if (struct.isSetLastName()) {
        oprot.writeString(struct.lastName);
      }
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.airavataInternalUserId = iprot.readString();
      struct.setAiravataInternalUserIdIsSet(true);
      struct.gatewayId = iprot.readString();
      struct.setGatewayIdIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.userName = iprot.readString();
        struct.setUserNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.firstName = iprot.readString();
        struct.setFirstNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastName = iprot.readString();
        struct.setLastNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
    }
  }

}

