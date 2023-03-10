// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package tuya.tedge.driver.sdk.grpc.event;

/**
 * <pre>
 * mqtt不带dp点数据上报
 * </pre>
 *
 * Protobuf type {@code event.WithoutDpReport}
 */
public final class WithoutDpReport extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:event.WithoutDpReport)
    WithoutDpReportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithoutDpReport.newBuilder() to construct.
  private WithoutDpReport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithoutDpReport() {
    topic_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithoutDpReport();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_WithoutDpReport_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_WithoutDpReport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tuya.tedge.driver.sdk.grpc.event.WithoutDpReport.class, tuya.tedge.driver.sdk.grpc.event.WithoutDpReport.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object topic_ = "";
  /**
   * <code>string topic = 1;</code>
   * @return The topic.
   */
  @java.lang.Override
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <code>string topic = 1;</code>
   * @return The bytes for topic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROTOCOL_FIELD_NUMBER = 2;
  private int protocol_ = 0;
  /**
   * <code>int32 protocol = 2;</code>
   * @return The protocol.
   */
  @java.lang.Override
  public int getProtocol() {
    return protocol_;
  }

  public static final int S_FIELD_NUMBER = 3;
  private long s_ = 0L;
  /**
   * <code>int64 s = 3;</code>
   * @return The s.
   */
  @java.lang.Override
  public long getS() {
    return s_;
  }

  public static final int T_FIELD_NUMBER = 4;
  private long t_ = 0L;
  /**
   * <code>int64 t = 4;</code>
   * @return The t.
   */
  @java.lang.Override
  public long getT() {
    return t_;
  }

  public static final int DATA_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes data = 5;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
    }
    if (protocol_ != 0) {
      output.writeInt32(2, protocol_);
    }
    if (s_ != 0L) {
      output.writeInt64(3, s_);
    }
    if (t_ != 0L) {
      output.writeInt64(4, t_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(5, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
    }
    if (protocol_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, protocol_);
    }
    if (s_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, s_);
    }
    if (t_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, t_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, data_);
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
    if (!(obj instanceof tuya.tedge.driver.sdk.grpc.event.WithoutDpReport)) {
      return super.equals(obj);
    }
    tuya.tedge.driver.sdk.grpc.event.WithoutDpReport other = (tuya.tedge.driver.sdk.grpc.event.WithoutDpReport) obj;

    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (getProtocol()
        != other.getProtocol()) return false;
    if (getS()
        != other.getS()) return false;
    if (getT()
        != other.getT()) return false;
    if (!getData()
        .equals(other.getData())) return false;
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
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
    hash = (53 * hash) + getProtocol();
    hash = (37 * hash) + S_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getS());
    hash = (37 * hash) + T_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getT());
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport parseFrom(
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
  public static Builder newBuilder(tuya.tedge.driver.sdk.grpc.event.WithoutDpReport prototype) {
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
   * mqtt不带dp点数据上报
   * </pre>
   *
   * Protobuf type {@code event.WithoutDpReport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:event.WithoutDpReport)
      tuya.tedge.driver.sdk.grpc.event.WithoutDpReportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_WithoutDpReport_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_WithoutDpReport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tuya.tedge.driver.sdk.grpc.event.WithoutDpReport.class, tuya.tedge.driver.sdk.grpc.event.WithoutDpReport.Builder.class);
    }

    // Construct using tuya.tedge.driver.sdk.grpc.event.WithoutDpReport.newBuilder()
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
      topic_ = "";
      protocol_ = 0;
      s_ = 0L;
      t_ = 0L;
      data_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tuya.tedge.driver.sdk.grpc.event.EventProto.internal_static_event_WithoutDpReport_descriptor;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.event.WithoutDpReport getDefaultInstanceForType() {
      return tuya.tedge.driver.sdk.grpc.event.WithoutDpReport.getDefaultInstance();
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.event.WithoutDpReport build() {
      tuya.tedge.driver.sdk.grpc.event.WithoutDpReport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tuya.tedge.driver.sdk.grpc.event.WithoutDpReport buildPartial() {
      tuya.tedge.driver.sdk.grpc.event.WithoutDpReport result = new tuya.tedge.driver.sdk.grpc.event.WithoutDpReport(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tuya.tedge.driver.sdk.grpc.event.WithoutDpReport result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topic_ = topic_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.protocol_ = protocol_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.s_ = s_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.t_ = t_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.data_ = data_;
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
      if (other instanceof tuya.tedge.driver.sdk.grpc.event.WithoutDpReport) {
        return mergeFrom((tuya.tedge.driver.sdk.grpc.event.WithoutDpReport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tuya.tedge.driver.sdk.grpc.event.WithoutDpReport other) {
      if (other == tuya.tedge.driver.sdk.grpc.event.WithoutDpReport.getDefaultInstance()) return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getProtocol() != 0) {
        setProtocol(other.getProtocol());
      }
      if (other.getS() != 0L) {
        setS(other.getS());
      }
      if (other.getT() != 0L) {
        setT(other.getT());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
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
              topic_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              protocol_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              s_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              t_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              data_ = input.readBytes();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object topic_ = "";
    /**
     * <code>string topic = 1;</code>
     * @return The topic.
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string topic = 1;</code>
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topic = 1;</code>
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      topic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      topic_ = getDefaultInstance().getTopic();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 1;</code>
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      topic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int protocol_ ;
    /**
     * <code>int32 protocol = 2;</code>
     * @return The protocol.
     */
    @java.lang.Override
    public int getProtocol() {
      return protocol_;
    }
    /**
     * <code>int32 protocol = 2;</code>
     * @param value The protocol to set.
     * @return This builder for chaining.
     */
    public Builder setProtocol(int value) {
      
      protocol_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 protocol = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProtocol() {
      bitField0_ = (bitField0_ & ~0x00000002);
      protocol_ = 0;
      onChanged();
      return this;
    }

    private long s_ ;
    /**
     * <code>int64 s = 3;</code>
     * @return The s.
     */
    @java.lang.Override
    public long getS() {
      return s_;
    }
    /**
     * <code>int64 s = 3;</code>
     * @param value The s to set.
     * @return This builder for chaining.
     */
    public Builder setS(long value) {
      
      s_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 s = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearS() {
      bitField0_ = (bitField0_ & ~0x00000004);
      s_ = 0L;
      onChanged();
      return this;
    }

    private long t_ ;
    /**
     * <code>int64 t = 4;</code>
     * @return The t.
     */
    @java.lang.Override
    public long getT() {
      return t_;
    }
    /**
     * <code>int64 t = 4;</code>
     * @param value The t to set.
     * @return This builder for chaining.
     */
    public Builder setT(long value) {
      
      t_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 t = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearT() {
      bitField0_ = (bitField0_ & ~0x00000008);
      t_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 5;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 5;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000010);
      data_ = getDefaultInstance().getData();
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


    // @@protoc_insertion_point(builder_scope:event.WithoutDpReport)
  }

  // @@protoc_insertion_point(class_scope:event.WithoutDpReport)
  private static final tuya.tedge.driver.sdk.grpc.event.WithoutDpReport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tuya.tedge.driver.sdk.grpc.event.WithoutDpReport();
  }

  public static tuya.tedge.driver.sdk.grpc.event.WithoutDpReport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithoutDpReport>
      PARSER = new com.google.protobuf.AbstractParser<WithoutDpReport>() {
    @java.lang.Override
    public WithoutDpReport parsePartialFrom(
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

  public static com.google.protobuf.Parser<WithoutDpReport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithoutDpReport> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tuya.tedge.driver.sdk.grpc.event.WithoutDpReport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

