// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package tuya.tedge.driver.sdk.grpc.common;

/**
 * Protobuf enum {@code common.EnumTUYAMQTTProtocol}
 */
public enum EnumTUYAMQTTProtocol
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_UNSPECIFIED = 0;</code>
   */
  ENUM_TUYAMQTT_PROTOCOL_UNSPECIFIED(0),
  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_5 = 5;</code>
   */
  ENUM_TUYAMQTT_PROTOCOL_5(5),
  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_64 = 64;</code>
   */
  ENUM_TUYAMQTT_PROTOCOL_64(64),
  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_302 = 302;</code>
   */
  ENUM_TUYAMQTT_PROTOCOL_302(302),
  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_312 = 312;</code>
   */
  ENUM_TUYAMQTT_PROTOCOL_312(312),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_UNSPECIFIED = 0;</code>
   */
  public static final int ENUM_TUYAMQTT_PROTOCOL_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_5 = 5;</code>
   */
  public static final int ENUM_TUYAMQTT_PROTOCOL_5_VALUE = 5;
  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_64 = 64;</code>
   */
  public static final int ENUM_TUYAMQTT_PROTOCOL_64_VALUE = 64;
  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_302 = 302;</code>
   */
  public static final int ENUM_TUYAMQTT_PROTOCOL_302_VALUE = 302;
  /**
   * <code>ENUM_TUYAMQTT_PROTOCOL_312 = 312;</code>
   */
  public static final int ENUM_TUYAMQTT_PROTOCOL_312_VALUE = 312;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EnumTUYAMQTTProtocol valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EnumTUYAMQTTProtocol forNumber(int value) {
    switch (value) {
      case 0: return ENUM_TUYAMQTT_PROTOCOL_UNSPECIFIED;
      case 5: return ENUM_TUYAMQTT_PROTOCOL_5;
      case 64: return ENUM_TUYAMQTT_PROTOCOL_64;
      case 302: return ENUM_TUYAMQTT_PROTOCOL_302;
      case 312: return ENUM_TUYAMQTT_PROTOCOL_312;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EnumTUYAMQTTProtocol>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EnumTUYAMQTTProtocol> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EnumTUYAMQTTProtocol>() {
          public EnumTUYAMQTTProtocol findValueByNumber(int number) {
            return EnumTUYAMQTTProtocol.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return tuya.tedge.driver.sdk.grpc.common.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final EnumTUYAMQTTProtocol[] VALUES = values();

  public static EnumTUYAMQTTProtocol valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EnumTUYAMQTTProtocol(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:common.EnumTUYAMQTTProtocol)
}
