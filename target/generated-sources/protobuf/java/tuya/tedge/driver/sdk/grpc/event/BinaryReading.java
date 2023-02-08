// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package tuya.tedge.driver.sdk.grpc.event;

/**
 * Protobuf type {@code event.BinaryReading}
 */
public final class BinaryReading extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:event.BinaryReading)
    BinaryReadingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BinaryReading.newBuilder() to construct.
  private BinaryReading(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BinaryReading() {
    mediaType_ = "";
    binaryValue_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BinaryReading();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_BinaryReading_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_BinaryReading_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.event.BinaryReading.class, tuya.tedge.driver.sdk.grpc.event.BinaryReading.Builder.class);
  }

  public static final int MEDIA_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object mediaType_ = "";
  /**
   * <code>string media_type = 1;</code>
   * @return The mediaType.
   */
  @java.lang.Override
  public java.lang.String getMediaType() {
    java.lang.Object ref = mediaType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mediaType_ = s;
      return s;
    }
  }
  /**
   * <code>string media_type = 1;</code>
   * @return The bytes for mediaType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMediaTypeBytes() {
    java.lang.Object ref = mediaType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mediaType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BINARY_VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString binaryValue_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes binary_value = 2;</code>
   * @return The binaryValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBinaryValue() {
    return binaryValue_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mediaType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mediaType_);
    }
    if (!binaryValue_.isEmpty()) {
      output.writeBytes(2, binaryValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mediaType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mediaType_);
    }
    if (!binaryValue_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, binaryValue_);
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.event.BinaryReading)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.event.BinaryReading other = (tuya.tedge.driver.sdk.grpc.event.BinaryReading) obj;

    if (!getMediaType()
        .equals(other.getMediaType())) return false;
    if (!getBinaryValue()
        .equals(other.getBinaryValue())) return false;
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
    hash = (37 * hash) + MEDIA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMediaType().hashCode();
    hash = (37 * hash) + BINARY_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getBinaryValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.event.BinaryReading prototype) {
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
   * Protobuf type {@code event.BinaryReading}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:event.BinaryReading)
      tuya.tedge.driver.sdk.grpc.event.BinaryReadingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_BinaryReading_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_BinaryReading_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.event.BinaryReading.class, tuya.tedge.driver.sdk.grpc.event.BinaryReading.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.event.BinaryReading.newBuilder()
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
      mediaType_ = "";
      binaryValue_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_BinaryReading_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.event.BinaryReading getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.event.BinaryReading.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.event.BinaryReading build() {
      tuya.tedge.driver.sdk.grpc.event.BinaryReading result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.event.BinaryReading buildPartial() {
      tuya.tedge.driver.sdk.grpc.event.BinaryReading result = new tuya.tedge.driver.sdk.grpc.event.BinaryReading(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.event.BinaryReading result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mediaType_ = mediaType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.binaryValue_ = binaryValue_;
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.event.BinaryReading) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.event.BinaryReading)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.event.BinaryReading other) {
      if (other == tuya.tedge.driver.sdk.grpc.event.BinaryReading.getDefaultInstance()) return this;
      if (!other.getMediaType().isEmpty()) {
        mediaType_ = other.mediaType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getBinaryValue() != com.google.protobuf.ByteString.EMPTY) {
        setBinaryValue(other.getBinaryValue());
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
              mediaType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              binaryValue_ = input.readBytes();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object mediaType_ = "";
    /**
     * <code>string media_type = 1;</code>
     * @return The mediaType.
     */
    public java.lang.String getMediaType() {
      java.lang.Object ref = mediaType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mediaType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string media_type = 1;</code>
     * @return The bytes for mediaType.
     */
    public com.google.protobuf.ByteString
        getMediaTypeBytes() {
      java.lang.Object ref = mediaType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mediaType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string media_type = 1;</code>
     * @param value The mediaType to set.
     * @return This builder for chaining.
     */
    public Builder setMediaType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      mediaType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string media_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMediaType() {
      mediaType_ = getDefaultInstance().getMediaType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string media_type = 1;</code>
     * @param value The bytes for mediaType to set.
     * @return This builder for chaining.
     */
    public Builder setMediaTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      mediaType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString binaryValue_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes binary_value = 2;</code>
     * @return The binaryValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBinaryValue() {
      return binaryValue_;
    }
    /**
     * <code>bytes binary_value = 2;</code>
     * @param value The binaryValue to set.
     * @return This builder for chaining.
     */
    public Builder setBinaryValue(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      binaryValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes binary_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBinaryValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      binaryValue_ = getDefaultInstance().getBinaryValue();
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


    // @@protoc_insertion_point(builder_scope:event.BinaryReading)
  }

  // @@protoc_insertion_point(class_scope:event.BinaryReading)
  private static final tuya.tedge.driver.sdk.grpc.event.BinaryReading DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.event.BinaryReading();
  }

  public static tuya.tedge.driver.sdk.grpc.event.BinaryReading getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BinaryReading>
      PARSER = new com.google.protobuf.AbstractParser<BinaryReading>() {
    @java.lang.Override
    public BinaryReading parsePartialFrom(
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

  public static com.google.protobuf.Parser<BinaryReading> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BinaryReading> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.event.BinaryReading getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

