// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thingmodel.proto

package tuya.tedge.driver.sdk.grpc.thingmodel;

/**
 * Protobuf type {@code thingmodel.InputOutput}
 */
public final class InputOutput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:thingmodel.InputOutput)
    InputOutputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InputOutput.newBuilder() to construct.
  private InputOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InputOutput() {
    code_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InputOutput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_InputOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_InputOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput.class, tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object code_ = "";
  /**
   * <code>string code = 1;</code>
   * @return The code.
   */
  @java.lang.Override
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <code>string code = 1;</code>
   * @return The bytes for code.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_SPEC_FIELD_NUMBER = 3;
  private tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec typeSpec_;
  /**
   * <code>.thingmodel.TypeSpec type_spec = 3;</code>
   * @return Whether the typeSpec field is set.
   */
  @java.lang.Override
  public boolean hasTypeSpec() {
    return typeSpec_ != null;
  }
  /**
   * <code>.thingmodel.TypeSpec type_spec = 3;</code>
   * @return The typeSpec.
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec getTypeSpec() {
    return typeSpec_ == null ? tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.getDefaultInstance() : typeSpec_;
  }
  /**
   * <code>.thingmodel.TypeSpec type_spec = 3;</code>
   */
  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpecOrBuilder getTypeSpecOrBuilder() {
    return typeSpec_ == null ? tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.getDefaultInstance() : typeSpec_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (typeSpec_ != null) {
      output.writeMessage(3, getTypeSpec());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (typeSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTypeSpec());
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput other = (tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput) obj;

    if (!getCode()
        .equals(other.getCode())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasTypeSpec() != other.hasTypeSpec()) return false;
    if (hasTypeSpec()) {
      if (!getTypeSpec()
          .equals(other.getTypeSpec())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasTypeSpec()) {
      hash = (37 * hash) + TYPE_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getTypeSpec().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput prototype) {
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
   * Protobuf type {@code thingmodel.InputOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:thingmodel.InputOutput)
      tuya.tedge.driver.sdk.grpc.thingmodel.InputOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_InputOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_InputOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput.class, tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput.newBuilder()
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
      code_ = "";
      name_ = "";
      typeSpec_ = null;
      if (typeSpecBuilder_ != null) {
        typeSpecBuilder_.dispose();
        typeSpecBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.internal_static_thingmodel_InputOutput_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput build() {
      tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput buildPartial() {
      tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput result = new tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.typeSpec_ = typeSpecBuilder_ == null
            ? typeSpec_
            : typeSpecBuilder_.build();
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput other) {
      if (other == tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput.getDefaultInstance()) return this;
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasTypeSpec()) {
        mergeTypeSpec(other.getTypeSpec());
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
              code_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTypeSpecFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object code_ = "";
    /**
     * <code>string code = 1;</code>
     * @return The code.
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string code = 1;</code>
     * @return The bytes for code.
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string code = 1;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      code_ = getDefaultInstance().getCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string code = 1;</code>
     * @param value The bytes for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec typeSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec, tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.Builder, tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpecOrBuilder> typeSpecBuilder_;
    /**
     * <code>.thingmodel.TypeSpec type_spec = 3;</code>
     * @return Whether the typeSpec field is set.
     */
    public boolean hasTypeSpec() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.thingmodel.TypeSpec type_spec = 3;</code>
     * @return The typeSpec.
     */
    public tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec getTypeSpec() {
      if (typeSpecBuilder_ == null) {
        return typeSpec_ == null ? tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.getDefaultInstance() : typeSpec_;
      } else {
        return typeSpecBuilder_.getMessage();
      }
    }
    /**
     * <code>.thingmodel.TypeSpec type_spec = 3;</code>
     */
    public Builder setTypeSpec(tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec value) {
      if (typeSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        typeSpec_ = value;
      } else {
        typeSpecBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.thingmodel.TypeSpec type_spec = 3;</code>
     */
    public Builder setTypeSpec(
        tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.Builder builderForValue) {
      if (typeSpecBuilder_ == null) {
        typeSpec_ = builderForValue.build();
      } else {
        typeSpecBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.thingmodel.TypeSpec type_spec = 3;</code>
     */
    public Builder mergeTypeSpec(tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec value) {
      if (typeSpecBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          typeSpec_ != null &&
          typeSpec_ != tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.getDefaultInstance()) {
          getTypeSpecBuilder().mergeFrom(value);
        } else {
          typeSpec_ = value;
        }
      } else {
        typeSpecBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.thingmodel.TypeSpec type_spec = 3;</code>
     */
    public Builder clearTypeSpec() {
      bitField0_ = (bitField0_ & ~0x00000004);
      typeSpec_ = null;
      if (typeSpecBuilder_ != null) {
        typeSpecBuilder_.dispose();
        typeSpecBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.thingmodel.TypeSpec type_spec = 3;</code>
     */
    public tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.Builder getTypeSpecBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTypeSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>.thingmodel.TypeSpec type_spec = 3;</code>
     */
    public tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpecOrBuilder getTypeSpecOrBuilder() {
      if (typeSpecBuilder_ != null) {
        return typeSpecBuilder_.getMessageOrBuilder();
      } else {
        return typeSpec_ == null ?
            tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.getDefaultInstance() : typeSpec_;
      }
    }
    /**
     * <code>.thingmodel.TypeSpec type_spec = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec, tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.Builder, tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpecOrBuilder> 
        getTypeSpecFieldBuilder() {
      if (typeSpecBuilder_ == null) {
        typeSpecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec, tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec.Builder, tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpecOrBuilder>(
                getTypeSpec(),
                getParentForChildren(),
                isClean());
        typeSpec_ = null;
      }
      return typeSpecBuilder_;
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


    // @@protoc_insertion_point(builder_scope:thingmodel.InputOutput)
  }

  // @@protoc_insertion_point(class_scope:thingmodel.InputOutput)
  private static final tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput();
  }

  public static tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InputOutput>
      PARSER = new com.google.protobuf.AbstractParser<InputOutput>() {
    @java.lang.Override
    public InputOutput parsePartialFrom(
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

  public static com.google.protobuf.Parser<InputOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.thingmodel.InputOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

