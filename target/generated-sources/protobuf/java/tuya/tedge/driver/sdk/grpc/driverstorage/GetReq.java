// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: driverstorage.proto

package tuya.tedge.driver.sdk.grpc.driverstorage;

/**
 * Protobuf type {@code driverstorage.GetReq}
 */
public final class GetReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:driverstorage.GetReq)
    GetReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetReq.newBuilder() to construct.
  private GetReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetReq() {
    driverServiceId_ = "";
    keys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_GetReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_GetReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.class, tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.Builder.class);
  }

  public static final int DRIVER_SERVICE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object driverServiceId_ = "";
  /**
   * <code>string driver_service_id = 1;</code>
   * @return The driverServiceId.
   */
  @java.lang.Override
  public java.lang.String getDriverServiceId() {
    java.lang.Object ref = driverServiceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      driverServiceId_ = s;
      return s;
    }
  }
  /**
   * <code>string driver_service_id = 1;</code>
   * @return The bytes for driverServiceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDriverServiceIdBytes() {
    java.lang.Object ref = driverServiceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      driverServiceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEYS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList keys_;
  /**
   * <code>repeated string keys = 2;</code>
   * @return A list containing the keys.
   */
  public com.google.protobuf.ProtocolStringList
      getKeysList() {
    return keys_;
  }
  /**
   * <code>repeated string keys = 2;</code>
   * @return The count of keys.
   */
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <code>repeated string keys = 2;</code>
   * @param index The index of the element to return.
   * @return The keys at the given index.
   */
  public java.lang.String getKeys(int index) {
    return keys_.get(index);
  }
  /**
   * <code>repeated string keys = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keys at the given index.
   */
  public com.google.protobuf.ByteString
      getKeysBytes(int index) {
    return keys_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(driverServiceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, driverServiceId_);
    }
    for (int i = 0; i < keys_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keys_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(driverServiceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, driverServiceId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < keys_.size(); i++) {
        dataSize += computeStringSizeNoTag(keys_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeysList().size();
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.driverstorage.GetReq)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.driverstorage.GetReq other = (tuya.tedge.driver.sdk.grpc.driverstorage.GetReq) obj;

    if (!getDriverServiceId()
        .equals(other.getDriverServiceId())) return false;
    if (!getKeysList()
        .equals(other.getKeysList())) return false;
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
    hash = (37 * hash) + DRIVER_SERVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDriverServiceId().hashCode();
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq prototype) {
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
   * Protobuf type {@code driverstorage.GetReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:driverstorage.GetReq)
      tuya.tedge.driver.sdk.grpc.driverstorage.GetReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_GetReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_GetReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.class, tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.newBuilder()
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
      driverServiceId_ = "";
      keys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_GetReq_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.GetReq getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.GetReq build() {
      tuya.tedge.driver.sdk.grpc.driverstorage.GetReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.GetReq buildPartial() {
      tuya.tedge.driver.sdk.grpc.driverstorage.GetReq result = new tuya.tedge.driver.sdk.grpc.driverstorage.GetReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        keys_ = keys_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.keys_ = keys_;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.driverServiceId_ = driverServiceId_;
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.driverstorage.GetReq) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.driverstorage.GetReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq other) {
      if (other == tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.getDefaultInstance()) return this;
      if (!other.getDriverServiceId().isEmpty()) {
        driverServiceId_ = other.driverServiceId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.keys_.isEmpty()) {
        if (keys_.isEmpty()) {
          keys_ = other.keys_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureKeysIsMutable();
          keys_.addAll(other.keys_);
        }
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
              driverServiceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureKeysIsMutable();
              keys_.add(s);
              break;
            } // case 18
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

    private java.lang.Object driverServiceId_ = "";
    /**
     * <code>string driver_service_id = 1;</code>
     * @return The driverServiceId.
     */
    public java.lang.String getDriverServiceId() {
      java.lang.Object ref = driverServiceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        driverServiceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string driver_service_id = 1;</code>
     * @return The bytes for driverServiceId.
     */
    public com.google.protobuf.ByteString
        getDriverServiceIdBytes() {
      java.lang.Object ref = driverServiceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        driverServiceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string driver_service_id = 1;</code>
     * @param value The driverServiceId to set.
     * @return This builder for chaining.
     */
    public Builder setDriverServiceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      driverServiceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string driver_service_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDriverServiceId() {
      driverServiceId_ = getDefaultInstance().getDriverServiceId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string driver_service_id = 1;</code>
     * @param value The bytes for driverServiceId to set.
     * @return This builder for chaining.
     */
    public Builder setDriverServiceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      driverServiceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList keys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        keys_ = new com.google.protobuf.LazyStringArrayList(keys_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string keys = 2;</code>
     * @return A list containing the keys.
     */
    public com.google.protobuf.ProtocolStringList
        getKeysList() {
      return keys_.getUnmodifiableView();
    }
    /**
     * <code>repeated string keys = 2;</code>
     * @return The count of keys.
     */
    public int getKeysCount() {
      return keys_.size();
    }
    /**
     * <code>repeated string keys = 2;</code>
     * @param index The index of the element to return.
     * @return The keys at the given index.
     */
    public java.lang.String getKeys(int index) {
      return keys_.get(index);
    }
    /**
     * <code>repeated string keys = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the keys at the given index.
     */
    public com.google.protobuf.ByteString
        getKeysBytes(int index) {
      return keys_.getByteString(index);
    }
    /**
     * <code>repeated string keys = 2;</code>
     * @param index The index to set the value at.
     * @param value The keys to set.
     * @return This builder for chaining.
     */
    public Builder setKeys(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeysIsMutable();
      keys_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keys = 2;</code>
     * @param value The keys to add.
     * @return This builder for chaining.
     */
    public Builder addKeys(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeysIsMutable();
      keys_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keys = 2;</code>
     * @param values The keys to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeys(
        java.lang.Iterable<java.lang.String> values) {
      ensureKeysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keys_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keys = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeys() {
      keys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keys = 2;</code>
     * @param value The bytes of the keys to add.
     * @return This builder for chaining.
     */
    public Builder addKeysBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureKeysIsMutable();
      keys_.add(value);
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


    // @@protoc_insertion_point(builder_scope:driverstorage.GetReq)
  }

  // @@protoc_insertion_point(class_scope:driverstorage.GetReq)
  private static final tuya.tedge.driver.sdk.grpc.driverstorage.GetReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.driverstorage.GetReq();
  }

  public static tuya.tedge.driver.sdk.grpc.driverstorage.GetReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetReq>
      PARSER = new com.google.protobuf.AbstractParser<GetReq>() {
    @java.lang.Override
    public GetReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.driverstorage.GetReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

