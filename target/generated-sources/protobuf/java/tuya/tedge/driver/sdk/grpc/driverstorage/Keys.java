// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: driverstorage.proto

package tuya.tedge.driver.sdk.grpc.driverstorage;

/**
 * Protobuf type {@code driverstorage.Keys}
 */
public final class Keys extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:driverstorage.Keys)
    KeysOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Keys.newBuilder() to construct.
  private Keys(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Keys() {
    key_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Keys();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_Keys_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_Keys_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.driverstorage.Keys.class, tuya.tedge.driver.sdk.grpc.driverstorage.Keys.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList key_;
  /**
   * <code>repeated string key = 1;</code>
   * @return A list containing the key.
   */
  public com.google.protobuf.ProtocolStringList
      getKeyList() {
    return key_;
  }
  /**
   * <code>repeated string key = 1;</code>
   * @return The count of key.
   */
  public int getKeyCount() {
    return key_.size();
  }
  /**
   * <code>repeated string key = 1;</code>
   * @param index The index of the element to return.
   * @return The key at the given index.
   */
  public java.lang.String getKey(int index) {
    return key_.get(index);
  }
  /**
   * <code>repeated string key = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the key at the given index.
   */
  public com.google.protobuf.ByteString
      getKeyBytes(int index) {
    return key_.getByteString(index);
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
    for (int i = 0; i < key_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < key_.size(); i++) {
        dataSize += computeStringSizeNoTag(key_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeyList().size();
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.driverstorage.Keys)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.driverstorage.Keys other = (tuya.tedge.driver.sdk.grpc.driverstorage.Keys) obj;

    if (!getKeyList()
        .equals(other.getKeyList())) return false;
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
    if (getKeyCount() > 0) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKeyList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.driverstorage.Keys prototype) {
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
   * Protobuf type {@code driverstorage.Keys}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:driverstorage.Keys)
      tuya.tedge.driver.sdk.grpc.driverstorage.KeysOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_Keys_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_Keys_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.driverstorage.Keys.class, tuya.tedge.driver.sdk.grpc.driverstorage.Keys.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.driverstorage.Keys.newBuilder()
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
      key_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_Keys_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.Keys getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.Keys.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.Keys build() {
      tuya.tedge.driver.sdk.grpc.driverstorage.Keys result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.Keys buildPartial() {
      tuya.tedge.driver.sdk.grpc.driverstorage.Keys result = new tuya.tedge.driver.sdk.grpc.driverstorage.Keys(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(tuya.tedge.driver.sdk.grpc.driverstorage.Keys result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        key_ = key_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.key_ = key_;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.driverstorage.Keys result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.driverstorage.Keys) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.driverstorage.Keys)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.driverstorage.Keys other) {
      if (other == tuya.tedge.driver.sdk.grpc.driverstorage.Keys.getDefaultInstance()) return this;
      if (!other.key_.isEmpty()) {
        if (key_.isEmpty()) {
          key_ = other.key_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKeyIsMutable();
          key_.addAll(other.key_);
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureKeyIsMutable();
              key_.add(s);
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

    private com.google.protobuf.LazyStringList key_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureKeyIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        key_ = new com.google.protobuf.LazyStringArrayList(key_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string key = 1;</code>
     * @return A list containing the key.
     */
    public com.google.protobuf.ProtocolStringList
        getKeyList() {
      return key_.getUnmodifiableView();
    }
    /**
     * <code>repeated string key = 1;</code>
     * @return The count of key.
     */
    public int getKeyCount() {
      return key_.size();
    }
    /**
     * <code>repeated string key = 1;</code>
     * @param index The index of the element to return.
     * @return The key at the given index.
     */
    public java.lang.String getKey(int index) {
      return key_.get(index);
    }
    /**
     * <code>repeated string key = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the key at the given index.
     */
    public com.google.protobuf.ByteString
        getKeyBytes(int index) {
      return key_.getByteString(index);
    }
    /**
     * <code>repeated string key = 1;</code>
     * @param index The index to set the value at.
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeyIsMutable();
      key_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key = 1;</code>
     * @param value The key to add.
     * @return This builder for chaining.
     */
    public Builder addKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeyIsMutable();
      key_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key = 1;</code>
     * @param values The key to add.
     * @return This builder for chaining.
     */
    public Builder addAllKey(
        java.lang.Iterable<java.lang.String> values) {
      ensureKeyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, key_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key = 1;</code>
     * @param value The bytes of the key to add.
     * @return This builder for chaining.
     */
    public Builder addKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureKeyIsMutable();
      key_.add(value);
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


    // @@protoc_insertion_point(builder_scope:driverstorage.Keys)
  }

  // @@protoc_insertion_point(class_scope:driverstorage.Keys)
  private static final tuya.tedge.driver.sdk.grpc.driverstorage.Keys DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.driverstorage.Keys();
  }

  public static tuya.tedge.driver.sdk.grpc.driverstorage.Keys getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Keys>
      PARSER = new com.google.protobuf.AbstractParser<Keys>() {
    @java.lang.Override
    public Keys parsePartialFrom(
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

  public static com.google.protobuf.Parser<Keys> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Keys> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.driverstorage.Keys getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

