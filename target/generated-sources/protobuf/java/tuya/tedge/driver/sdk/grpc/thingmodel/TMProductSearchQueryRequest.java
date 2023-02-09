// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thingmodel.proto

package tuya.tedge.driver.sdk.grpc.thingmodel;

/**
 * Protobuf type {@code thingmodel.TMProductSearchQueryRequest}
 */
public final class TMProductSearchQueryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:thingmodel.TMProductSearchQueryRequest)
    TMProductSearchQueryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TMProductSearchQueryRequest.newBuilder() to construct.
  private TMProductSearchQueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TMProductSearchQueryRequest() {
    deviceLibraryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TMProductSearchQueryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_TMProductSearchQueryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_TMProductSearchQueryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest.class, tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest.Builder.class);
  }

  public static final int BASE_SEARCH_CONDITION_QUERY_FIELD_NUMBER = 1;
  private tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery baseSearchConditionQuery_;
  /**
   * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
   * @return Whether the baseSearchConditionQuery field is set.
   */
  @java.lang.Override
  public boolean hasBaseSearchConditionQuery() {
    return baseSearchConditionQuery_ != null;
  }
  /**
   * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
   * @return The baseSearchConditionQuery.
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery getBaseSearchConditionQuery() {
    return baseSearchConditionQuery_ == null ? tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.getDefaultInstance() : baseSearchConditionQuery_;
  }
  /**
   * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQueryOrBuilder getBaseSearchConditionQueryOrBuilder() {
    return baseSearchConditionQuery_ == null ? tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.getDefaultInstance() : baseSearchConditionQuery_;
  }

  public static final int DEVICE_LIBRARY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deviceLibraryId_ = "";
  /**
   * <code>string device_library_id = 2;</code>
   * @return The deviceLibraryId.
   */
  @java.lang.Override
  public java.lang.String getDeviceLibraryId() {
    java.lang.Object ref = deviceLibraryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceLibraryId_ = s;
      return s;
    }
  }
  /**
   * <code>string device_library_id = 2;</code>
   * @return The bytes for deviceLibraryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceLibraryIdBytes() {
    java.lang.Object ref = deviceLibraryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceLibraryId_ = b;
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
    if (baseSearchConditionQuery_ != null) {
      output.writeMessage(1, getBaseSearchConditionQuery());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceLibraryId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceLibraryId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (baseSearchConditionQuery_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBaseSearchConditionQuery());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceLibraryId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceLibraryId_);
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest other = (tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest) obj;

    if (hasBaseSearchConditionQuery() != other.hasBaseSearchConditionQuery()) return false;
    if (hasBaseSearchConditionQuery()) {
      if (!getBaseSearchConditionQuery()
          .equals(other.getBaseSearchConditionQuery())) return false;
    }
    if (!getDeviceLibraryId()
        .equals(other.getDeviceLibraryId())) return false;
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
    if (hasBaseSearchConditionQuery()) {
      hash = (37 * hash) + BASE_SEARCH_CONDITION_QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getBaseSearchConditionQuery().hashCode();
    }
    hash = (37 * hash) + DEVICE_LIBRARY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceLibraryId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest prototype) {
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
   * Protobuf type {@code thingmodel.TMProductSearchQueryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:thingmodel.TMProductSearchQueryRequest)
      tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_TMProductSearchQueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_TMProductSearchQueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest.class, tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest.newBuilder()
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
      baseSearchConditionQuery_ = null;
      if (baseSearchConditionQueryBuilder_ != null) {
        baseSearchConditionQueryBuilder_.dispose();
        baseSearchConditionQueryBuilder_ = null;
      }
      deviceLibraryId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_TMProductSearchQueryRequest_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest build() {
      tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest buildPartial() {
      tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest result = new tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.baseSearchConditionQuery_ = baseSearchConditionQueryBuilder_ == null
            ? baseSearchConditionQuery_
            : baseSearchConditionQueryBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deviceLibraryId_ = deviceLibraryId_;
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest other) {
      if (other == tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest.getDefaultInstance()) return this;
      if (other.hasBaseSearchConditionQuery()) {
        mergeBaseSearchConditionQuery(other.getBaseSearchConditionQuery());
      }
      if (!other.getDeviceLibraryId().isEmpty()) {
        deviceLibraryId_ = other.deviceLibraryId_;
        bitField0_ |= 0x00000002;
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
              input.readMessage(
                  getBaseSearchConditionQueryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              deviceLibraryId_ = input.readStringRequireUtf8();
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

    private tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery baseSearchConditionQuery_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery, tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.Builder, tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQueryOrBuilder> baseSearchConditionQueryBuilder_;
    /**
     * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
     * @return Whether the baseSearchConditionQuery field is set.
     */
    public boolean hasBaseSearchConditionQuery() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
     * @return The baseSearchConditionQuery.
     */
    public tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery getBaseSearchConditionQuery() {
      if (baseSearchConditionQueryBuilder_ == null) {
        return baseSearchConditionQuery_ == null ? tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.getDefaultInstance() : baseSearchConditionQuery_;
      } else {
        return baseSearchConditionQueryBuilder_.getMessage();
      }
    }
    /**
     * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
     */
    public Builder setBaseSearchConditionQuery(tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery value) {
      if (baseSearchConditionQueryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseSearchConditionQuery_ = value;
      } else {
        baseSearchConditionQueryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
     */
    public Builder setBaseSearchConditionQuery(
        tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.Builder builderForValue) {
      if (baseSearchConditionQueryBuilder_ == null) {
        baseSearchConditionQuery_ = builderForValue.build();
      } else {
        baseSearchConditionQueryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
     */
    public Builder mergeBaseSearchConditionQuery(tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery value) {
      if (baseSearchConditionQueryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          baseSearchConditionQuery_ != null &&
          baseSearchConditionQuery_ != tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.getDefaultInstance()) {
          getBaseSearchConditionQueryBuilder().mergeFrom(value);
        } else {
          baseSearchConditionQuery_ = value;
        }
      } else {
        baseSearchConditionQueryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
     */
    public Builder clearBaseSearchConditionQuery() {
      bitField0_ = (bitField0_ & ~0x00000001);
      baseSearchConditionQuery_ = null;
      if (baseSearchConditionQueryBuilder_ != null) {
        baseSearchConditionQueryBuilder_.dispose();
        baseSearchConditionQueryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
     */
    public tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.Builder getBaseSearchConditionQueryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBaseSearchConditionQueryFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
     */
    public tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQueryOrBuilder getBaseSearchConditionQueryOrBuilder() {
      if (baseSearchConditionQueryBuilder_ != null) {
        return baseSearchConditionQueryBuilder_.getMessageOrBuilder();
      } else {
        return baseSearchConditionQuery_ == null ?
            tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.getDefaultInstance() : baseSearchConditionQuery_;
      }
    }
    /**
     * <code>.common.BaseSearchConditionQuery base_search_condition_query = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery, tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.Builder, tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQueryOrBuilder> 
        getBaseSearchConditionQueryFieldBuilder() {
      if (baseSearchConditionQueryBuilder_ == null) {
        baseSearchConditionQueryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery, tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery.Builder, tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQueryOrBuilder>(
                getBaseSearchConditionQuery(),
                getParentForChildren(),
                isClean());
        baseSearchConditionQuery_ = null;
      }
      return baseSearchConditionQueryBuilder_;
    }

    private java.lang.Object deviceLibraryId_ = "";
    /**
     * <code>string device_library_id = 2;</code>
     * @return The deviceLibraryId.
     */
    public java.lang.String getDeviceLibraryId() {
      java.lang.Object ref = deviceLibraryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceLibraryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_library_id = 2;</code>
     * @return The bytes for deviceLibraryId.
     */
    public com.google.protobuf.ByteString
        getDeviceLibraryIdBytes() {
      java.lang.Object ref = deviceLibraryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceLibraryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_library_id = 2;</code>
     * @param value The deviceLibraryId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceLibraryId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deviceLibraryId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string device_library_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceLibraryId() {
      deviceLibraryId_ = getDefaultInstance().getDeviceLibraryId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string device_library_id = 2;</code>
     * @param value The bytes for deviceLibraryId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceLibraryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deviceLibraryId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:thingmodel.TMProductSearchQueryRequest)
  }

  // @@protoc_insertion_point(class_scope:thingmodel.TMProductSearchQueryRequest)
  private static final tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest();
  }

  public static tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TMProductSearchQueryRequest>
      PARSER = new com.google.protobuf.AbstractParser<TMProductSearchQueryRequest>() {
    @java.lang.Override
    public TMProductSearchQueryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TMProductSearchQueryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TMProductSearchQueryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
