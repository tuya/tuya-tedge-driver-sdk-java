// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: driverstorage.proto

package tuya.tedge.driver.sdk.grpc.driverstorage;

/**
 * Protobuf type {@code driverstorage.PutReq}
 */
public final class PutReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:driverstorage.PutReq)
    PutReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PutReq.newBuilder() to construct.
  private PutReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PutReq() {
    driverServiceId_ = "";
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PutReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_PutReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_PutReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.class, tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.Builder.class);
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

  public static final int DATA_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV> data_;
  /**
   * <code>repeated .driverstorage.KV data = 2;</code>
   */
  @java.lang.Override
  public java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .driverstorage.KV data = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .driverstorage.KV data = 2;</code>
   */
  @java.lang.Override
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .driverstorage.KV data = 2;</code>
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.driverstorage.KV getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .driverstorage.KV data = 2;</code>
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
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
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(2, data_.get(i));
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
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, data_.get(i));
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.driverstorage.PutReq)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.driverstorage.PutReq other = (tuya.tedge.driver.sdk.grpc.driverstorage.PutReq) obj;

    if (!getDriverServiceId()
        .equals(other.getDriverServiceId())) return false;
    if (!getDataList()
        .equals(other.getDataList())) return false;
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
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq prototype) {
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
   * Protobuf type {@code driverstorage.PutReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:driverstorage.PutReq)
      tuya.tedge.driver.sdk.grpc.driverstorage.PutReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_PutReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_PutReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.class, tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.newBuilder()
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
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
      } else {
        data_ = null;
        dataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_PutReq_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.PutReq getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.PutReq build() {
      tuya.tedge.driver.sdk.grpc.driverstorage.PutReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.PutReq buildPartial() {
      tuya.tedge.driver.sdk.grpc.driverstorage.PutReq result = new tuya.tedge.driver.sdk.grpc.driverstorage.PutReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq result) {
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq result) {
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.driverstorage.PutReq) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.driverstorage.PutReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq other) {
      if (other == tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.getDefaultInstance()) return this;
      if (!other.getDriverServiceId().isEmpty()) {
        driverServiceId_ = other.driverServiceId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000002);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
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
              tuya.tedge.driver.sdk.grpc.driverstorage.KV m =
                  input.readMessage(
                      tuya.tedge.driver.sdk.grpc.driverstorage.KV.parser(),
                      extensionRegistry);
              if (dataBuilder_ == null) {
                ensureDataIsMutable();
                data_.add(m);
              } else {
                dataBuilder_.addMessage(m);
              }
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

    private java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        data_ = new java.util.ArrayList<tuya.tedge.driver.sdk.grpc.driverstorage.KV>(data_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.driverstorage.KV, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder, tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder> dataBuilder_;

    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KV getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public Builder setData(
        int index, tuya.tedge.driver.sdk.grpc.driverstorage.KV value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public Builder setData(
        int index, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public Builder addData(tuya.tedge.driver.sdk.grpc.driverstorage.KV value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public Builder addData(
        int index, tuya.tedge.driver.sdk.grpc.driverstorage.KV value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public Builder addData(
        tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public Builder addData(
        int index, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends tuya.tedge.driver.sdk.grpc.driverstorage.KV> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public java.util.List<? extends tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          tuya.tedge.driver.sdk.grpc.driverstorage.KV.getDefaultInstance());
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, tuya.tedge.driver.sdk.grpc.driverstorage.KV.getDefaultInstance());
    }
    /**
     * <code>repeated .driverstorage.KV data = 2;</code>
     */
    public java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.driverstorage.KV, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder, tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            tuya.tedge.driver.sdk.grpc.driverstorage.KV, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder, tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder>(
                data_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:driverstorage.PutReq)
  }

  // @@protoc_insertion_point(class_scope:driverstorage.PutReq)
  private static final tuya.tedge.driver.sdk.grpc.driverstorage.PutReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.driverstorage.PutReq();
  }

  public static tuya.tedge.driver.sdk.grpc.driverstorage.PutReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PutReq>
      PARSER = new com.google.protobuf.AbstractParser<PutReq>() {
    @java.lang.Override
    public PutReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<PutReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PutReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.driverstorage.PutReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

