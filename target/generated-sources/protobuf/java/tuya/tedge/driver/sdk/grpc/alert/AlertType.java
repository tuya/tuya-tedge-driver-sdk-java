// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: alert.proto

package tuya.tedge.driver.sdk.grpc.alert;

/**
 * <pre>
 * 告警类型
 * </pre>
 *
 * Protobuf enum {@code alert.AlertType}
 */
public enum AlertType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ALERT_TYPE_UNSPECIFIED = 0;</code>
   */
  ALERT_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * 内部服务告警
   * </pre>
   *
   * <code>SERVICE_ALERT = 1;</code>
   */
  SERVICE_ALERT(1),
  /**
   * <pre>
   * 驱动告警
   * </pre>
   *
   * <code>DRIVER_ALERT = 2;</code>
   */
  DRIVER_ALERT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ALERT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ALERT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 内部服务告警
   * </pre>
   *
   * <code>SERVICE_ALERT = 1;</code>
   */
  public static final int SERVICE_ALERT_VALUE = 1;
  /**
   * <pre>
   * 驱动告警
   * </pre>
   *
   * <code>DRIVER_ALERT = 2;</code>
   */
  public static final int DRIVER_ALERT_VALUE = 2;


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
  public static AlertType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AlertType forNumber(int value) {
    switch (value) {
      case 0: return ALERT_TYPE_UNSPECIFIED;
      case 1: return SERVICE_ALERT;
      case 2: return DRIVER_ALERT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AlertType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AlertType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AlertType>() {
          public AlertType findValueByNumber(int number) {
            return AlertType.forNumber(number);
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
    return tuya.tedge.driver.sdk.grpc.alert.AlertProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AlertType[] VALUES = values();

  public static AlertType valueOf(
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

  private AlertType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:alert.AlertType)
}

