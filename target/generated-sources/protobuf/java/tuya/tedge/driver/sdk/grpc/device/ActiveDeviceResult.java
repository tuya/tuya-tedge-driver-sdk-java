// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package tuya.tedge.driver.sdk.grpc.device;

/**
 * <pre>
 *子设备激活结果
 * </pre>
 *
 * Protobuf type {@code device.ActiveDeviceResult}
 */
public final class ActiveDeviceResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:device.ActiveDeviceResult)
    ActiveDeviceResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActiveDeviceResult.newBuilder() to construct.
  private ActiveDeviceResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActiveDeviceResult() {
    id_ = "";
    name_ = "";
    activeStatus_ = "";
    remark_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ActiveDeviceResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_ActiveDeviceResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_ActiveDeviceResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult.class, tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROCESS_SUCCESS_FIELD_NUMBER = 3;
  private boolean processSuccess_ = false;
  /**
   * <code>bool process_success = 3;</code>
   * @return The processSuccess.
   */
  @java.lang.Override
  public boolean getProcessSuccess() {
    return processSuccess_;
  }

  public static final int ACTIVE_STATUS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object activeStatus_ = "";
  /**
   * <code>string active_status = 4;</code>
   * @return The activeStatus.
   */
  @java.lang.Override
  public java.lang.String getActiveStatus() {
    java.lang.Object ref = activeStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      activeStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string active_status = 4;</code>
   * @return The bytes for activeStatus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActiveStatusBytes() {
    java.lang.Object ref = activeStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      activeStatus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REMARK_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object remark_ = "";
  /**
   * <code>string remark = 5;</code>
   * @return The remark.
   */
  @java.lang.Override
  public java.lang.String getRemark() {
    java.lang.Object ref = remark_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remark_ = s;
      return s;
    }
  }
  /**
   * <code>string remark = 5;</code>
   * @return The bytes for remark.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRemarkBytes() {
    java.lang.Object ref = remark_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remark_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (processSuccess_ != false) {
      output.writeBool(3, processSuccess_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(activeStatus_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, activeStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remark_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, remark_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (processSuccess_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, processSuccess_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(activeStatus_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, activeStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remark_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, remark_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult other = (tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getProcessSuccess()
        != other.getProcessSuccess()) return false;
    if (!getActiveStatus()
        .equals(other.getActiveStatus())) return false;
    if (!getRemark()
        .equals(other.getRemark())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PROCESS_SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getProcessSuccess());
    hash = (37 * hash) + ACTIVE_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getActiveStatus().hashCode();
    hash = (37 * hash) + REMARK_FIELD_NUMBER;
    hash = (53 * hash) + getRemark().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *子设备激活结果
   * </pre>
   *
   * Protobuf type {@code device.ActiveDeviceResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:device.ActiveDeviceResult)
      tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_ActiveDeviceResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_ActiveDeviceResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult.class, tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      name_ = "";
      processSuccess_ = false;
      activeStatus_ = "";
      remark_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_ActiveDeviceResult_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult build() {
      tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult buildPartial() {
      tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult result = new tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.processSuccess_ = processSuccess_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.activeStatus_ = activeStatus_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.remark_ = remark_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult other) {
      if (other == tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getProcessSuccess() != false) {
        setProcessSuccess(other.getProcessSuccess());
      }
      if (!other.getActiveStatus().isEmpty()) {
        activeStatus_ = other.activeStatus_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getRemark().isEmpty()) {
        remark_ = other.remark_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              processSuccess_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              activeStatus_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              remark_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean processSuccess_ ;
    /**
     * <code>bool process_success = 3;</code>
     * @return The processSuccess.
     */
    @java.lang.Override
    public boolean getProcessSuccess() {
      return processSuccess_;
    }
    /**
     * <code>bool process_success = 3;</code>
     * @param value The processSuccess to set.
     * @return This builder for chaining.
     */
    public Builder setProcessSuccess(boolean value) {
      
      processSuccess_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool process_success = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProcessSuccess() {
      bitField0_ = (bitField0_ & ~0x00000004);
      processSuccess_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object activeStatus_ = "";
    /**
     * <code>string active_status = 4;</code>
     * @return The activeStatus.
     */
    public java.lang.String getActiveStatus() {
      java.lang.Object ref = activeStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        activeStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string active_status = 4;</code>
     * @return The bytes for activeStatus.
     */
    public com.google.protobuf.ByteString
        getActiveStatusBytes() {
      java.lang.Object ref = activeStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        activeStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string active_status = 4;</code>
     * @param value The activeStatus to set.
     * @return This builder for chaining.
     */
    public Builder setActiveStatus(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      activeStatus_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string active_status = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveStatus() {
      activeStatus_ = getDefaultInstance().getActiveStatus();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string active_status = 4;</code>
     * @param value The bytes for activeStatus to set.
     * @return This builder for chaining.
     */
    public Builder setActiveStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      activeStatus_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object remark_ = "";
    /**
     * <code>string remark = 5;</code>
     * @return The remark.
     */
    public java.lang.String getRemark() {
      java.lang.Object ref = remark_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remark_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string remark = 5;</code>
     * @return The bytes for remark.
     */
    public com.google.protobuf.ByteString
        getRemarkBytes() {
      java.lang.Object ref = remark_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string remark = 5;</code>
     * @param value The remark to set.
     * @return This builder for chaining.
     */
    public Builder setRemark(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      remark_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string remark = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearRemark() {
      remark_ = getDefaultInstance().getRemark();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string remark = 5;</code>
     * @param value The bytes for remark to set.
     * @return This builder for chaining.
     */
    public Builder setRemarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      remark_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:device.ActiveDeviceResult)
  }

  // @@protoc_insertion_point(class_scope:device.ActiveDeviceResult)
  private static final tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult();
  }

  public static tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActiveDeviceResult>
      PARSER = new com.google.protobuf.AbstractParser<ActiveDeviceResult>() {
    @java.lang.Override
    public ActiveDeviceResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ActiveDeviceResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActiveDeviceResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

