// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: driverstorage.proto

package tuya.tedge.driver.sdk.grpc.driverstorage;

/**
 * Protobuf type {@code driverstorage.KVs}
 */
public final class KVs extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:driverstorage.KVs)
    KVsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KVs.newBuilder() to construct.
  private KVs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KVs() {
    kvs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KVs();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_KVs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_KVs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.driverstorage.KVs.class, tuya.tedge.driver.sdk.grpc.driverstorage.KVs.Builder.class);
  }

  public static final int KVS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV> kvs_;
  /**
   * <code>repeated .driverstorage.KV kvs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV> getKvsList() {
    return kvs_;
  }
  /**
   * <code>repeated .driverstorage.KV kvs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder> 
      getKvsOrBuilderList() {
    return kvs_;
  }
  /**
   * <code>repeated .driverstorage.KV kvs = 1;</code>
   */
  @java.lang.Override
  public int getKvsCount() {
    return kvs_.size();
  }
  /**
   * <code>repeated .driverstorage.KV kvs = 1;</code>
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.driverstorage.KV getKvs(int index) {
    return kvs_.get(index);
  }
  /**
   * <code>repeated .driverstorage.KV kvs = 1;</code>
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder getKvsOrBuilder(
      int index) {
    return kvs_.get(index);
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
    for (int i = 0; i < kvs_.size(); i++) {
      output.writeMessage(1, kvs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < kvs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, kvs_.get(i));
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.driverstorage.KVs)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.driverstorage.KVs other = (tuya.tedge.driver.sdk.grpc.driverstorage.KVs) obj;

    if (!getKvsList()
        .equals(other.getKvsList())) return false;
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
    if (getKvsCount() > 0) {
      hash = (37 * hash) + KVS_FIELD_NUMBER;
      hash = (53 * hash) + getKvsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.driverstorage.KVs prototype) {
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
   * Protobuf type {@code driverstorage.KVs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:driverstorage.KVs)
      tuya.tedge.driver.sdk.grpc.driverstorage.KVsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_KVs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_KVs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.driverstorage.KVs.class, tuya.tedge.driver.sdk.grpc.driverstorage.KVs.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.driverstorage.KVs.newBuilder()
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
      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
      } else {
        kvs_ = null;
        kvsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.internal_static_driverstorage_KVs_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.KVs getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.KVs.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.KVs build() {
      tuya.tedge.driver.sdk.grpc.driverstorage.KVs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.driverstorage.KVs buildPartial() {
      tuya.tedge.driver.sdk.grpc.driverstorage.KVs result = new tuya.tedge.driver.sdk.grpc.driverstorage.KVs(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(tuya.tedge.driver.sdk.grpc.driverstorage.KVs result) {
      if (kvsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          kvs_ = java.util.Collections.unmodifiableList(kvs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.kvs_ = kvs_;
      } else {
        result.kvs_ = kvsBuilder_.build();
      }
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.driverstorage.KVs result) {
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.driverstorage.KVs) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.driverstorage.KVs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.driverstorage.KVs other) {
      if (other == tuya.tedge.driver.sdk.grpc.driverstorage.KVs.getDefaultInstance()) return this;
      if (kvsBuilder_ == null) {
        if (!other.kvs_.isEmpty()) {
          if (kvs_.isEmpty()) {
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKvsIsMutable();
            kvs_.addAll(other.kvs_);
          }
          onChanged();
        }
      } else {
        if (!other.kvs_.isEmpty()) {
          if (kvsBuilder_.isEmpty()) {
            kvsBuilder_.dispose();
            kvsBuilder_ = null;
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            kvsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKvsFieldBuilder() : null;
          } else {
            kvsBuilder_.addAllMessages(other.kvs_);
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
              tuya.tedge.driver.sdk.grpc.driverstorage.KV m =
                  input.readMessage(
                      tuya.tedge.driver.sdk.grpc.driverstorage.KV.parser(),
                      extensionRegistry);
              if (kvsBuilder_ == null) {
                ensureKvsIsMutable();
                kvs_.add(m);
              } else {
                kvsBuilder_.addMessage(m);
              }
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

    private java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV> kvs_ =
      java.util.Collections.emptyList();
    private void ensureKvsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        kvs_ = new java.util.ArrayList<tuya.tedge.driver.sdk.grpc.driverstorage.KV>(kvs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.driverstorage.KV, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder, tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder> kvsBuilder_;

    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV> getKvsList() {
      if (kvsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(kvs_);
      } else {
        return kvsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public int getKvsCount() {
      if (kvsBuilder_ == null) {
        return kvs_.size();
      } else {
        return kvsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KV getKvs(int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);
      } else {
        return kvsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public Builder setKvs(
        int index, tuya.tedge.driver.sdk.grpc.driverstorage.KV value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.set(index, value);
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public Builder setKvs(
        int index, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.set(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public Builder addKvs(tuya.tedge.driver.sdk.grpc.driverstorage.KV value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public Builder addKvs(
        int index, tuya.tedge.driver.sdk.grpc.driverstorage.KV value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(index, value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public Builder addKvs(
        tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public Builder addKvs(
        int index, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public Builder addAllKvs(
        java.lang.Iterable<? extends tuya.tedge.driver.sdk.grpc.driverstorage.KV> values) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, kvs_);
        onChanged();
      } else {
        kvsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public Builder clearKvs() {
      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        kvsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public Builder removeKvs(int index) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.remove(index);
        onChanged();
      } else {
        kvsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder getKvsBuilder(
        int index) {
      return getKvsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder getKvsOrBuilder(
        int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);  } else {
        return kvsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public java.util.List<? extends tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder> 
         getKvsOrBuilderList() {
      if (kvsBuilder_ != null) {
        return kvsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(kvs_);
      }
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder addKvsBuilder() {
      return getKvsFieldBuilder().addBuilder(
          tuya.tedge.driver.sdk.grpc.driverstorage.KV.getDefaultInstance());
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder addKvsBuilder(
        int index) {
      return getKvsFieldBuilder().addBuilder(
          index, tuya.tedge.driver.sdk.grpc.driverstorage.KV.getDefaultInstance());
    }
    /**
     * <code>repeated .driverstorage.KV kvs = 1;</code>
     */
    public java.util.List<tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder> 
         getKvsBuilderList() {
      return getKvsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.driverstorage.KV, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder, tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder> 
        getKvsFieldBuilder() {
      if (kvsBuilder_ == null) {
        kvsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            tuya.tedge.driver.sdk.grpc.driverstorage.KV, tuya.tedge.driver.sdk.grpc.driverstorage.KV.Builder, tuya.tedge.driver.sdk.grpc.driverstorage.KVOrBuilder>(
                kvs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        kvs_ = null;
      }
      return kvsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:driverstorage.KVs)
  }

  // @@protoc_insertion_point(class_scope:driverstorage.KVs)
  private static final tuya.tedge.driver.sdk.grpc.driverstorage.KVs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.driverstorage.KVs();
  }

  public static tuya.tedge.driver.sdk.grpc.driverstorage.KVs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KVs>
      PARSER = new com.google.protobuf.AbstractParser<KVs>() {
    @java.lang.Override
    public KVs parsePartialFrom(
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

  public static com.google.protobuf.Parser<KVs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KVs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.driverstorage.KVs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

