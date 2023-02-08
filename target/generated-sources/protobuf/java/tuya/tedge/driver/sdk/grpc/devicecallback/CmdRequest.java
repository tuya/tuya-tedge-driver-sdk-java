// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: drivercallback.proto

package tuya.tedge.driver.sdk.grpc.devicecallback;

/**
 * Protobuf type {@code drivercallback.CmdRequest}
 */
public final class CmdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:drivercallback.CmdRequest)
    CmdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CmdRequest.newBuilder() to construct.
  private CmdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CmdRequest() {
    cid_ = "";
    protocol_ = 0;
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CmdRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.devicecallback.DeviceCallbackProto.internal_static_drivercallback_CmdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.devicecallback.DeviceCallbackProto.internal_static_drivercallback_CmdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest.class, tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest.Builder.class);
  }

  public static final int CID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cid_ = "";
  /**
   * <pre>
   * 子设备ID
   * </pre>
   *
   * <code>string cid = 1;</code>
   * @return The cid.
   */
  @java.lang.Override
  public java.lang.String getCid() {
    java.lang.Object ref = cid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 子设备ID
   * </pre>
   *
   * <code>string cid = 1;</code>
   * @return The bytes for cid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCidBytes() {
    java.lang.Object ref = cid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROTOCOL_FIELD_NUMBER = 2;
  private int protocol_ = 0;
  /**
   * <pre>
   * 指令协议
   * </pre>
   *
   * <code>.common.EnumTUYAMQTTProtocol protocol = 2;</code>
   * @return The enum numeric value on the wire for protocol.
   */
  @java.lang.Override public int getProtocolValue() {
    return protocol_;
  }
  /**
   * <pre>
   * 指令协议
   * </pre>
   *
   * <code>.common.EnumTUYAMQTTProtocol protocol = 2;</code>
   * @return The protocol.
   */
  @java.lang.Override public tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol getProtocol() {
    tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol result = tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol.forNumber(protocol_);
    return result == null ? tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol.UNRECOGNIZED : result;
  }

  public static final int T_FIELD_NUMBER = 3;
  private long t_ = 0L;
  /**
   * <code>int64 t = 3;</code>
   * @return The t.
   */
  @java.lang.Override
  public long getT() {
    return t_;
  }

  public static final int S_FIELD_NUMBER = 4;
  private long s_ = 0L;
  /**
   * <code>int64 s = 4;</code>
   * @return The s.
   */
  @java.lang.Override
  public long getS() {
    return s_;
  }

  public static final int DATA_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * 指令内容，透传
   * </pre>
   *
   * <code>bytes data = 5;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cid_);
    }
    if (protocol_ != tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol.ENUM_TUYAMQTT_PROTOCOL_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, protocol_);
    }
    if (t_ != 0L) {
      output.writeInt64(3, t_);
    }
    if (s_ != 0L) {
      output.writeInt64(4, s_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(5, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cid_);
    }
    if (protocol_ != tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol.ENUM_TUYAMQTT_PROTOCOL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, protocol_);
    }
    if (t_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, t_);
    }
    if (s_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, s_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, data_);
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest other = (tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest) obj;

    if (!getCid()
        .equals(other.getCid())) return false;
    if (protocol_ != other.protocol_) return false;
    if (getT()
        != other.getT()) return false;
    if (getS()
        != other.getS()) return false;
    if (!getData()
        .equals(other.getData())) return false;
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
    hash = (37 * hash) + CID_FIELD_NUMBER;
    hash = (53 * hash) + getCid().hashCode();
    hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
    hash = (53 * hash) + protocol_;
    hash = (37 * hash) + T_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getT());
    hash = (37 * hash) + S_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getS());
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest prototype) {
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
   * Protobuf type {@code drivercallback.CmdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:drivercallback.CmdRequest)
      tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.devicecallback.DeviceCallbackProto.internal_static_drivercallback_CmdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.devicecallback.DeviceCallbackProto.internal_static_drivercallback_CmdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest.class, tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest.newBuilder()
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
      cid_ = "";
      protocol_ = 0;
      t_ = 0L;
      s_ = 0L;
      data_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.devicecallback.DeviceCallbackProto.internal_static_drivercallback_CmdRequest_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest build() {
      tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest buildPartial() {
      tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest result = new tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cid_ = cid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.protocol_ = protocol_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.t_ = t_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.s_ = s_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.data_ = data_;
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest other) {
      if (other == tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest.getDefaultInstance()) return this;
      if (!other.getCid().isEmpty()) {
        cid_ = other.cid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.protocol_ != 0) {
        setProtocolValue(other.getProtocolValue());
      }
      if (other.getT() != 0L) {
        setT(other.getT());
      }
      if (other.getS() != 0L) {
        setS(other.getS());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
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
              cid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              protocol_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              t_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              s_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              data_ = input.readBytes();
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

    private java.lang.Object cid_ = "";
    /**
     * <pre>
     * 子设备ID
     * </pre>
     *
     * <code>string cid = 1;</code>
     * @return The cid.
     */
    public java.lang.String getCid() {
      java.lang.Object ref = cid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 子设备ID
     * </pre>
     *
     * <code>string cid = 1;</code>
     * @return The bytes for cid.
     */
    public com.google.protobuf.ByteString
        getCidBytes() {
      java.lang.Object ref = cid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 子设备ID
     * </pre>
     *
     * <code>string cid = 1;</code>
     * @param value The cid to set.
     * @return This builder for chaining.
     */
    public Builder setCid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 子设备ID
     * </pre>
     *
     * <code>string cid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCid() {
      cid_ = getDefaultInstance().getCid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 子设备ID
     * </pre>
     *
     * <code>string cid = 1;</code>
     * @param value The bytes for cid to set.
     * @return This builder for chaining.
     */
    public Builder setCidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int protocol_ = 0;
    /**
     * <pre>
     * 指令协议
     * </pre>
     *
     * <code>.common.EnumTUYAMQTTProtocol protocol = 2;</code>
     * @return The enum numeric value on the wire for protocol.
     */
    @java.lang.Override public int getProtocolValue() {
      return protocol_;
    }
    /**
     * <pre>
     * 指令协议
     * </pre>
     *
     * <code>.common.EnumTUYAMQTTProtocol protocol = 2;</code>
     * @param value The enum numeric value on the wire for protocol to set.
     * @return This builder for chaining.
     */
    public Builder setProtocolValue(int value) {
      protocol_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 指令协议
     * </pre>
     *
     * <code>.common.EnumTUYAMQTTProtocol protocol = 2;</code>
     * @return The protocol.
     */
    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol getProtocol() {
      tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol result = tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol.forNumber(protocol_);
      return result == null ? tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 指令协议
     * </pre>
     *
     * <code>.common.EnumTUYAMQTTProtocol protocol = 2;</code>
     * @param value The protocol to set.
     * @return This builder for chaining.
     */
    public Builder setProtocol(tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      protocol_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 指令协议
     * </pre>
     *
     * <code>.common.EnumTUYAMQTTProtocol protocol = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProtocol() {
      bitField0_ = (bitField0_ & ~0x00000002);
      protocol_ = 0;
      onChanged();
      return this;
    }

    private long t_ ;
    /**
     * <code>int64 t = 3;</code>
     * @return The t.
     */
    @java.lang.Override
    public long getT() {
      return t_;
    }
    /**
     * <code>int64 t = 3;</code>
     * @param value The t to set.
     * @return This builder for chaining.
     */
    public Builder setT(long value) {
      
      t_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 t = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearT() {
      bitField0_ = (bitField0_ & ~0x00000004);
      t_ = 0L;
      onChanged();
      return this;
    }

    private long s_ ;
    /**
     * <code>int64 s = 4;</code>
     * @return The s.
     */
    @java.lang.Override
    public long getS() {
      return s_;
    }
    /**
     * <code>int64 s = 4;</code>
     * @param value The s to set.
     * @return This builder for chaining.
     */
    public Builder setS(long value) {
      
      s_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 s = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearS() {
      bitField0_ = (bitField0_ & ~0x00000008);
      s_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 指令内容，透传
     * </pre>
     *
     * <code>bytes data = 5;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * 指令内容，透传
     * </pre>
     *
     * <code>bytes data = 5;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 指令内容，透传
     * </pre>
     *
     * <code>bytes data = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000010);
      data_ = getDefaultInstance().getData();
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


    // @@protoc_insertion_point(builder_scope:drivercallback.CmdRequest)
  }

  // @@protoc_insertion_point(class_scope:drivercallback.CmdRequest)
  private static final tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest();
  }

  public static tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CmdRequest>
      PARSER = new com.google.protobuf.AbstractParser<CmdRequest>() {
    @java.lang.Override
    public CmdRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CmdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CmdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

