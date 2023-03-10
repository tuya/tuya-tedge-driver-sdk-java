// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package tuya.tedge.driver.sdk.grpc.device;

/**
 * Protobuf type {@code device.AddDeviceRequest}
 */
public final class AddDeviceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:device.AddDeviceRequest)
    AddDeviceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddDeviceRequest.newBuilder() to construct.
  private AddDeviceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddDeviceRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddDeviceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_AddDeviceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_AddDeviceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest.class, tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest.Builder.class);
  }

  public static final int DEVICE_FIELD_NUMBER = 1;
  private tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo device_;
  /**
   * <code>.device.DeviceAddInfo device = 1;</code>
   * @return Whether the device field is set.
   */
  @java.lang.Override
  public boolean hasDevice() {
    return device_ != null;
  }
  /**
   * <code>.device.DeviceAddInfo device = 1;</code>
   * @return The device.
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo getDevice() {
    return device_ == null ? tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.getDefaultInstance() : device_;
  }
  /**
   * <code>.device.DeviceAddInfo device = 1;</code>
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.device.DeviceAddInfoOrBuilder getDeviceOrBuilder() {
    return device_ == null ? tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.getDefaultInstance() : device_;
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
    if (device_ != null) {
      output.writeMessage(1, getDevice());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (device_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDevice());
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest other = (tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest) obj;

    if (hasDevice() != other.hasDevice()) return false;
    if (hasDevice()) {
      if (!getDevice()
          .equals(other.getDevice())) return false;
    }
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
    if (hasDevice()) {
      hash = (37 * hash) + DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getDevice().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest prototype) {
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
   * Protobuf type {@code device.AddDeviceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:device.AddDeviceRequest)
      tuya.tedge.driver.sdk.grpc.device.AddDeviceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_AddDeviceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_AddDeviceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest.class, tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest.newBuilder()
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
      device_ = null;
      if (deviceBuilder_ != null) {
        deviceBuilder_.dispose();
        deviceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.device.DeviceProto.internal_static_device_AddDeviceRequest_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest build() {
      tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest buildPartial() {
      tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest result = new tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.device_ = deviceBuilder_ == null
            ? device_
            : deviceBuilder_.build();
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest other) {
      if (other == tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest.getDefaultInstance()) return this;
      if (other.hasDevice()) {
        mergeDevice(other.getDevice());
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
              input.readMessage(
                  getDeviceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo device_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo, tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.Builder, tuya.tedge.driver.sdk.grpc.device.DeviceAddInfoOrBuilder> deviceBuilder_;
    /**
     * <code>.device.DeviceAddInfo device = 1;</code>
     * @return Whether the device field is set.
     */
    public boolean hasDevice() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.device.DeviceAddInfo device = 1;</code>
     * @return The device.
     */
    public tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo getDevice() {
      if (deviceBuilder_ == null) {
        return device_ == null ? tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.getDefaultInstance() : device_;
      } else {
        return deviceBuilder_.getMessage();
      }
    }
    /**
     * <code>.device.DeviceAddInfo device = 1;</code>
     */
    public Builder setDevice(tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        device_ = value;
      } else {
        deviceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.device.DeviceAddInfo device = 1;</code>
     */
    public Builder setDevice(
        tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        device_ = builderForValue.build();
      } else {
        deviceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.device.DeviceAddInfo device = 1;</code>
     */
    public Builder mergeDevice(tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo value) {
      if (deviceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          device_ != null &&
          device_ != tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.getDefaultInstance()) {
          getDeviceBuilder().mergeFrom(value);
        } else {
          device_ = value;
        }
      } else {
        deviceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.device.DeviceAddInfo device = 1;</code>
     */
    public Builder clearDevice() {
      bitField0_ = (bitField0_ & ~0x00000001);
      device_ = null;
      if (deviceBuilder_ != null) {
        deviceBuilder_.dispose();
        deviceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.device.DeviceAddInfo device = 1;</code>
     */
    public tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.Builder getDeviceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeviceFieldBuilder().getBuilder();
    }
    /**
     * <code>.device.DeviceAddInfo device = 1;</code>
     */
    public tuya.tedge.driver.sdk.grpc.device.DeviceAddInfoOrBuilder getDeviceOrBuilder() {
      if (deviceBuilder_ != null) {
        return deviceBuilder_.getMessageOrBuilder();
      } else {
        return device_ == null ?
            tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.getDefaultInstance() : device_;
      }
    }
    /**
     * <code>.device.DeviceAddInfo device = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo, tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.Builder, tuya.tedge.driver.sdk.grpc.device.DeviceAddInfoOrBuilder> 
        getDeviceFieldBuilder() {
      if (deviceBuilder_ == null) {
        deviceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo, tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.Builder, tuya.tedge.driver.sdk.grpc.device.DeviceAddInfoOrBuilder>(
                getDevice(),
                getParentForChildren(),
                isClean());
        device_ = null;
      }
      return deviceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:device.AddDeviceRequest)
  }

  // @@protoc_insertion_point(class_scope:device.AddDeviceRequest)
  private static final tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest();
  }

  public static tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddDeviceRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddDeviceRequest>() {
    @java.lang.Override
    public AddDeviceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddDeviceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddDeviceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

