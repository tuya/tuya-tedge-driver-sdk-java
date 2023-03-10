// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package tuya.tedge.driver.sdk.grpc.common;

/**
 * Protobuf type {@code common.PageRequest}
 */
public final class PageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.PageRequest)
    PageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PageRequest.newBuilder() to construct.
  private PageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PageRequest() {
    nameLike_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PageRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_PageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_PageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.common.PageRequest.class, tuya.tedge.driver.sdk.grpc.common.PageRequest.Builder.class);
  }

  public static final int NAME_LIKE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nameLike_ = "";
  /**
   * <code>string name_like = 1;</code>
   * @return The nameLike.
   */
  @java.lang.Override
  public java.lang.String getNameLike() {
    java.lang.Object ref = nameLike_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nameLike_ = s;
      return s;
    }
  }
  /**
   * <code>string name_like = 1;</code>
   * @return The bytes for nameLike.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameLikeBytes() {
    java.lang.Object ref = nameLike_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nameLike_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_FIELD_NUMBER = 2;
  private long page_ = 0L;
  /**
   * <code>int64 page = 2;</code>
   * @return The page.
   */
  @java.lang.Override
  public long getPage() {
    return page_;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private long pageSize_ = 0L;
  /**
   * <code>int64 page_size = 3;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public long getPageSize() {
    return pageSize_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nameLike_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nameLike_);
    }
    if (page_ != 0L) {
      output.writeInt64(2, page_);
    }
    if (pageSize_ != 0L) {
      output.writeInt64(3, pageSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nameLike_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nameLike_);
    }
    if (page_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, page_);
    }
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, pageSize_);
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.common.PageRequest)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.common.PageRequest other = (tuya.tedge.driver.sdk.grpc.common.PageRequest) obj;

    if (!getNameLike()
        .equals(other.getNameLike())) return false;
    if (getPage()
        != other.getPage()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
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
    hash = (37 * hash) + NAME_LIKE_FIELD_NUMBER;
    hash = (53 * hash) + getNameLike().hashCode();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPage());
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.common.PageRequest parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.common.PageRequest prototype) {
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
   * Protobuf type {@code common.PageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.PageRequest)
      tuya.tedge.driver.sdk.grpc.common.PageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_PageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_PageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.common.PageRequest.class, tuya.tedge.driver.sdk.grpc.common.PageRequest.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.common.PageRequest.newBuilder()
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
      nameLike_ = "";
      page_ = 0L;
      pageSize_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.common.CommonProto.internal_static_common_PageRequest_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.common.PageRequest getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.common.PageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.common.PageRequest build() {
      tuya.tedge.driver.sdk.grpc.common.PageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.common.PageRequest buildPartial() {
      tuya.tedge.driver.sdk.grpc.common.PageRequest result = new tuya.tedge.driver.sdk.grpc.common.PageRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.common.PageRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nameLike_ = nameLike_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.page_ = page_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageSize_ = pageSize_;
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.common.PageRequest) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.common.PageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.common.PageRequest other) {
      if (other == tuya.tedge.driver.sdk.grpc.common.PageRequest.getDefaultInstance()) return this;
      if (!other.getNameLike().isEmpty()) {
        nameLike_ = other.nameLike_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPage() != 0L) {
        setPage(other.getPage());
      }
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
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
              nameLike_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              page_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              pageSize_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object nameLike_ = "";
    /**
     * <code>string name_like = 1;</code>
     * @return The nameLike.
     */
    public java.lang.String getNameLike() {
      java.lang.Object ref = nameLike_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nameLike_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name_like = 1;</code>
     * @return The bytes for nameLike.
     */
    public com.google.protobuf.ByteString
        getNameLikeBytes() {
      java.lang.Object ref = nameLike_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nameLike_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name_like = 1;</code>
     * @param value The nameLike to set.
     * @return This builder for chaining.
     */
    public Builder setNameLike(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nameLike_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name_like = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNameLike() {
      nameLike_ = getDefaultInstance().getNameLike();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name_like = 1;</code>
     * @param value The bytes for nameLike to set.
     * @return This builder for chaining.
     */
    public Builder setNameLikeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nameLike_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long page_ ;
    /**
     * <code>int64 page = 2;</code>
     * @return The page.
     */
    @java.lang.Override
    public long getPage() {
      return page_;
    }
    /**
     * <code>int64 page = 2;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(long value) {
      
      page_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 page = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      page_ = 0L;
      onChanged();
      return this;
    }

    private long pageSize_ ;
    /**
     * <code>int64 page_size = 3;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int64 page_size = 3;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(long value) {
      
      pageSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 page_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pageSize_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:common.PageRequest)
  }

  // @@protoc_insertion_point(class_scope:common.PageRequest)
  private static final tuya.tedge.driver.sdk.grpc.common.PageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.common.PageRequest();
  }

  public static tuya.tedge.driver.sdk.grpc.common.PageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PageRequest>
      PARSER = new com.google.protobuf.AbstractParser<PageRequest>() {
    @java.lang.Override
    public PageRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.common.PageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

