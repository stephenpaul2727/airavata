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
package org.apache.airavata.model.credential.store;

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
public class CredentialSummary implements org.apache.thrift.TBase<CredentialSummary, CredentialSummary._Fields>, java.io.Serializable, Cloneable, Comparable<CredentialSummary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CredentialSummary");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField GATEWAY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PUBLIC_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("publicKey", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PERSISTED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("persistedTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CredentialSummaryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CredentialSummaryTupleSchemeFactory());
  }

  private SummaryType type; // required
  private String gatewayId; // required
  private String username; // required
  private String publicKey; // optional
  private long persistedTime; // optional
  private String token; // required
  private String description; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see SummaryType
     */
    TYPE((short)1, "type"),
    GATEWAY_ID((short)2, "gatewayId"),
    USERNAME((short)3, "username"),
    PUBLIC_KEY((short)4, "publicKey"),
    PERSISTED_TIME((short)5, "persistedTime"),
    TOKEN((short)6, "token"),
    DESCRIPTION((short)7, "description");

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
        case 1: // TYPE
          return TYPE;
        case 2: // GATEWAY_ID
          return GATEWAY_ID;
        case 3: // USERNAME
          return USERNAME;
        case 4: // PUBLIC_KEY
          return PUBLIC_KEY;
        case 5: // PERSISTED_TIME
          return PERSISTED_TIME;
        case 6: // TOKEN
          return TOKEN;
        case 7: // DESCRIPTION
          return DESCRIPTION;
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
  private static final int __PERSISTEDTIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PUBLIC_KEY,_Fields.PERSISTED_TIME,_Fields.DESCRIPTION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SummaryType.class)));
    tmpMap.put(_Fields.GATEWAY_ID, new org.apache.thrift.meta_data.FieldMetaData("gatewayId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PUBLIC_KEY, new org.apache.thrift.meta_data.FieldMetaData("publicKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERSISTED_TIME, new org.apache.thrift.meta_data.FieldMetaData("persistedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CredentialSummary.class, metaDataMap);
  }

  public CredentialSummary() {
  }

  public CredentialSummary(
    SummaryType type,
    String gatewayId,
    String username,
    String token)
  {
    this();
    this.type = type;
    this.gatewayId = gatewayId;
    this.username = username;
    this.token = token;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CredentialSummary(CredentialSummary other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetGatewayId()) {
      this.gatewayId = other.gatewayId;
    }
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetPublicKey()) {
      this.publicKey = other.publicKey;
    }
    this.persistedTime = other.persistedTime;
    if (other.isSetToken()) {
      this.token = other.token;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
  }

  public CredentialSummary deepCopy() {
    return new CredentialSummary(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.gatewayId = null;
    this.username = null;
    this.publicKey = null;
    setPersistedTimeIsSet(false);
    this.persistedTime = 0;
    this.token = null;
    this.description = null;
  }

  /**
   * 
   * @see SummaryType
   */
  public SummaryType getType() {
    return this.type;
  }

  /**
   * 
   * @see SummaryType
   */
  public void setType(SummaryType type) {
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

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public String getPublicKey() {
    return this.publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public void unsetPublicKey() {
    this.publicKey = null;
  }

  /** Returns true if field publicKey is set (has been assigned a value) and false otherwise */
  public boolean isSetPublicKey() {
    return this.publicKey != null;
  }

  public void setPublicKeyIsSet(boolean value) {
    if (!value) {
      this.publicKey = null;
    }
  }

  public long getPersistedTime() {
    return this.persistedTime;
  }

  public void setPersistedTime(long persistedTime) {
    this.persistedTime = persistedTime;
    setPersistedTimeIsSet(true);
  }

  public void unsetPersistedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERSISTEDTIME_ISSET_ID);
  }

  /** Returns true if field persistedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetPersistedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __PERSISTEDTIME_ISSET_ID);
  }

  public void setPersistedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERSISTEDTIME_ISSET_ID, value);
  }

  public String getToken() {
    return this.token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((SummaryType)value);
      }
      break;

    case GATEWAY_ID:
      if (value == null) {
        unsetGatewayId();
      } else {
        setGatewayId((String)value);
      }
      break;

    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;

    case PUBLIC_KEY:
      if (value == null) {
        unsetPublicKey();
      } else {
        setPublicKey((String)value);
      }
      break;

    case PERSISTED_TIME:
      if (value == null) {
        unsetPersistedTime();
      } else {
        setPersistedTime((Long)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case GATEWAY_ID:
      return getGatewayId();

    case USERNAME:
      return getUsername();

    case PUBLIC_KEY:
      return getPublicKey();

    case PERSISTED_TIME:
      return getPersistedTime();

    case TOKEN:
      return getToken();

    case DESCRIPTION:
      return getDescription();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case GATEWAY_ID:
      return isSetGatewayId();
    case USERNAME:
      return isSetUsername();
    case PUBLIC_KEY:
      return isSetPublicKey();
    case PERSISTED_TIME:
      return isSetPersistedTime();
    case TOKEN:
      return isSetToken();
    case DESCRIPTION:
      return isSetDescription();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CredentialSummary)
      return this.equals((CredentialSummary)that);
    return false;
  }

  public boolean equals(CredentialSummary that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
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

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_publicKey = true && this.isSetPublicKey();
    boolean that_present_publicKey = true && that.isSetPublicKey();
    if (this_present_publicKey || that_present_publicKey) {
      if (!(this_present_publicKey && that_present_publicKey))
        return false;
      if (!this.publicKey.equals(that.publicKey))
        return false;
    }

    boolean this_present_persistedTime = true && this.isSetPersistedTime();
    boolean that_present_persistedTime = true && that.isSetPersistedTime();
    if (this_present_persistedTime || that_present_persistedTime) {
      if (!(this_present_persistedTime && that_present_persistedTime))
        return false;
      if (this.persistedTime != that.persistedTime)
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_gatewayId = true && (isSetGatewayId());
    list.add(present_gatewayId);
    if (present_gatewayId)
      list.add(gatewayId);

    boolean present_username = true && (isSetUsername());
    list.add(present_username);
    if (present_username)
      list.add(username);

    boolean present_publicKey = true && (isSetPublicKey());
    list.add(present_publicKey);
    if (present_publicKey)
      list.add(publicKey);

    boolean present_persistedTime = true && (isSetPersistedTime());
    list.add(present_persistedTime);
    if (present_persistedTime)
      list.add(persistedTime);

    boolean present_token = true && (isSetToken());
    list.add(present_token);
    if (present_token)
      list.add(token);

    boolean present_description = true && (isSetDescription());
    list.add(present_description);
    if (present_description)
      list.add(description);

    return list.hashCode();
  }

  @Override
  public int compareTo(CredentialSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
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
    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPublicKey()).compareTo(other.isSetPublicKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPublicKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.publicKey, other.publicKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPersistedTime()).compareTo(other.isSetPersistedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersistedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.persistedTime, other.persistedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
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
    StringBuilder sb = new StringBuilder("CredentialSummary(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("gatewayId:");
    if (this.gatewayId == null) {
      sb.append("null");
    } else {
      sb.append(this.gatewayId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("username:");
    if (this.username == null) {
      sb.append("null");
    } else {
      sb.append(this.username);
    }
    first = false;
    if (isSetPublicKey()) {
      if (!first) sb.append(", ");
      sb.append("publicKey:");
      if (this.publicKey == null) {
        sb.append("null");
      } else {
        sb.append(this.publicKey);
      }
      first = false;
    }
    if (isSetPersistedTime()) {
      if (!first) sb.append(", ");
      sb.append("persistedTime:");
      sb.append(this.persistedTime);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      sb.append(this.token);
    }
    first = false;
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' is unset! Struct:" + toString());
    }

    if (!isSetGatewayId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gatewayId' is unset! Struct:" + toString());
    }

    if (!isSetUsername()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'username' is unset! Struct:" + toString());
    }

    if (!isSetToken()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'token' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CredentialSummaryStandardSchemeFactory implements SchemeFactory {
    public CredentialSummaryStandardScheme getScheme() {
      return new CredentialSummaryStandardScheme();
    }
  }

  private static class CredentialSummaryStandardScheme extends StandardScheme<CredentialSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CredentialSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.airavata.model.credential.store.SummaryType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GATEWAY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayId = iprot.readString();
              struct.setGatewayIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PUBLIC_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.publicKey = iprot.readString();
              struct.setPublicKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PERSISTED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.persistedTime = iprot.readI64();
              struct.setPersistedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CredentialSummary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.gatewayId != null) {
        oprot.writeFieldBegin(GATEWAY_ID_FIELD_DESC);
        oprot.writeString(struct.gatewayId);
        oprot.writeFieldEnd();
      }
      if (struct.username != null) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(struct.username);
        oprot.writeFieldEnd();
      }
      if (struct.publicKey != null) {
        if (struct.isSetPublicKey()) {
          oprot.writeFieldBegin(PUBLIC_KEY_FIELD_DESC);
          oprot.writeString(struct.publicKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPersistedTime()) {
        oprot.writeFieldBegin(PERSISTED_TIME_FIELD_DESC);
        oprot.writeI64(struct.persistedTime);
        oprot.writeFieldEnd();
      }
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeString(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CredentialSummaryTupleSchemeFactory implements SchemeFactory {
    public CredentialSummaryTupleScheme getScheme() {
      return new CredentialSummaryTupleScheme();
    }
  }

  private static class CredentialSummaryTupleScheme extends TupleScheme<CredentialSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CredentialSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      oprot.writeString(struct.gatewayId);
      oprot.writeString(struct.username);
      oprot.writeString(struct.token);
      BitSet optionals = new BitSet();
      if (struct.isSetPublicKey()) {
        optionals.set(0);
      }
      if (struct.isSetPersistedTime()) {
        optionals.set(1);
      }
      if (struct.isSetDescription()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPublicKey()) {
        oprot.writeString(struct.publicKey);
      }
      if (struct.isSetPersistedTime()) {
        oprot.writeI64(struct.persistedTime);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CredentialSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = org.apache.airavata.model.credential.store.SummaryType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.gatewayId = iprot.readString();
      struct.setGatewayIdIsSet(true);
      struct.username = iprot.readString();
      struct.setUsernameIsSet(true);
      struct.token = iprot.readString();
      struct.setTokenIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.publicKey = iprot.readString();
        struct.setPublicKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.persistedTime = iprot.readI64();
        struct.setPersistedTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
    }
  }

}

