// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package tuya.tedge.driver.sdk.grpc.common;

/**
 * <pre>
 * pong
 * </pre>
 *
 * Protobuf type {@code common.Pong}
 */
public final class Pong extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.Pong)
    PongOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Pong.newBuilder() to construct.
  private Pong(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Pong() {
    timestamp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Pong();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_Pong_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_Pong_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.common.Pong.class, tuya.tedge.driver.sdk.grpc.common.Pong.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object timestamp_ = "";
  /**
   * <code>string timestamp = 2;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public java.lang.String getTimestamp() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timestamp_ = s;
      return s;
    }
  }
  /**
   * <code>string timestamp = 2;</code>
   * @return The bytes for timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimestampBytes() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timestamp_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, timestamp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, timestamp_);
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.common.Pong)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.common.Pong other = (tuya.tedge.driver.sdk.grpc.common.Pong) obj;

    if (!getTimestamp()
        .equals(other.getTimestamp())) return false;
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
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.common.Pong parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.common.Pong prototype) {
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
   * pong
   * </pre>
   *
   * Protobuf type {@code common.Pong}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.Pong)
      tuya.tedge.driver.sdk.grpc.common.PongOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_Pong_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_Pong_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.common.Pong.class, tuya.tedge.driver.sdk.grpc.common.Pong.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.common.Pong.newBuilder()
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
      timestamp_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_Pong_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.common.Pong getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.common.Pong.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.common.Pong build() {
      tuya.tedge.driver.sdk.grpc.common.Pong result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.common.Pong buildPartial() {
      tuya.tedge.driver.sdk.grpc.common.Pong result = new tuya.tedge.driver.sdk.grpc.common.Pong(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.common.Pong result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timestamp_ = timestamp_;
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.common.Pong) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.common.Pong)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.common.Pong other) {
      if (other == tuya.tedge.driver.sdk.grpc.common.Pong.getDefaultInstance()) return this;
      if (!other.getTimestamp().isEmpty()) {
        timestamp_ = other.timestamp_;
        bitField0_ |= 0x00000001;
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
            case 18: {
              timestamp_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object timestamp_ = "";
    /**
     * <code>string timestamp = 2;</code>
     * @return The timestamp.
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string timestamp = 2;</code>
     * @return The bytes for timestamp.
     */
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string timestamp = 2;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      timestamp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      timestamp_ = getDefaultInstance().getTimestamp();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 2;</code>
     * @param value The bytes for timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      timestamp_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:common.Pong)
  }

  // @@protoc_insertion_point(class_scope:common.Pong)
  private static final tuya.tedge.driver.sdk.grpc.common.Pong DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.common.Pong();
  }

  public static tuya.tedge.driver.sdk.grpc.common.Pong getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Pong>
      PARSER = new com.google.protobuf.AbstractParser<Pong>() {
    @java.lang.Override
    public Pong parsePartialFrom(
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

  public static com.google.protobuf.Parser<Pong> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Pong> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.common.Pong getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
