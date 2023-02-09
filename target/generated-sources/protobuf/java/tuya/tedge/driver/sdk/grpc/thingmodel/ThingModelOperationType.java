// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thingmodel.proto

package tuya.tedge.driver.sdk.grpc.thingmodel;

/**
 * <pre>
 *&#47;/////////////////////////////////////////////////////////////////////////////////////
 * 物模型resource与driver sdk交互
 * </pre>
 *
 * Protobuf enum {@code thingmodel.ThingModelOperationType}
 */
public enum ThingModelOperationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   * <pre>
   * 设备上报向云端获取物模型查询请求
   * </pre>
   *
   * <code>MODEL_GET = 1;</code>
   */
  MODEL_GET(1),
  /**
   * <pre>
   * 云端响应设备上报向云端获取物模型查询请求
   * </pre>
   *
   * <code>MODEL_GET_RESPONSE = 2;</code>
   */
  MODEL_GET_RESPONSE(2),
  /**
   * <pre>
   * 设备上报向云端上报设备属性值
   * </pre>
   *
   * <code>PROPERTY_REPORT = 3;</code>
   */
  PROPERTY_REPORT(3),
  /**
   * <pre>
   * 云端响应设备上报向云端上报设备属性值
   * </pre>
   *
   * <code>PROPERTY_REPORT_RESPONSE = 4;</code>
   */
  PROPERTY_REPORT_RESPONSE(4),
  /**
   * <pre>
   * 云端下发属性设置
   * </pre>
   *
   * <code>PROPERTY_SET = 5;</code>
   */
  PROPERTY_SET(5),
  /**
   * <pre>
   * 设备响应云端下发属性设置
   * </pre>
   *
   * <code>PROPERTY_SET_RESPONSE = 6;</code>
   */
  PROPERTY_SET_RESPONSE(6),
  /**
   * <pre>
   * 云端下发属性查询请求
   * </pre>
   *
   * <code>PROPERTY_GET = 7;</code>
   */
  PROPERTY_GET(7),
  /**
   * <pre>
   * 设备响应云端下发属性查询请求
   * </pre>
   *
   * <code>PROPERTY_GET_RESPONSE = 8;</code>
   */
  PROPERTY_GET_RESPONSE(8),
  /**
   * <pre>
   * 云端下发设备动作执行消息
   * </pre>
   *
   * <code>ACTION_EXECUTE = 9;</code>
   */
  ACTION_EXECUTE(9),
  /**
   * <pre>
   * 设备响应云端下发设备动作执行消息
   * </pre>
   *
   * <code>ACTION_EXECUTE_RESPONSE = 10;</code>
   */
  ACTION_EXECUTE_RESPONSE(10),
  /**
   * <pre>
   * 设备上报事件触发消息
   * </pre>
   *
   * <code>EVENT_TRIGGER = 11;</code>
   */
  EVENT_TRIGGER(11),
  /**
   * <pre>
   * 云端响应设备上报事件触发消息
   * </pre>
   *
   * <code>EVENT_TRIGGER_RESPONSE = 12;</code>
   */
  EVENT_TRIGGER_RESPONSE(12),
  /**
   * <pre>
   * 设备上报 批量上报属性或事件数据
   * </pre>
   *
   * <code>DATA_BATCH_REPORT = 13;</code>
   */
  DATA_BATCH_REPORT(13),
  /**
   * <pre>
   * 云端响应设备上报 批量上报属性或事件数据
   * </pre>
   *
   * <code>DATA_BATCH_REPORT_RESPONSE = 14;</code>
   */
  DATA_BATCH_REPORT_RESPONSE(14),
  /**
   * <pre>
   * 设备上报向云端获取属性期望值请求
   * </pre>
   *
   * <code>PROPERTY_DESIRED_GET = 15;</code>
   */
  PROPERTY_DESIRED_GET(15),
  /**
   * <pre>
   * 云端响应设备上报向云端获取属性期望值请求
   * </pre>
   *
   * <code>PROPERTY_DESIRED_GET_RESPONSE = 16;</code>
   */
  PROPERTY_DESIRED_GET_RESPONSE(16),
  /**
   * <pre>
   * 设备上报向云端发送清除属性期望值请求
   * </pre>
   *
   * <code>PROPERTY_DESIRED_DELETE = 17;</code>
   */
  PROPERTY_DESIRED_DELETE(17),
  /**
   * <pre>
   * 云端响应设备上报向云端发送清除属性期望值请求
   * </pre>
   *
   * <code>PROPERTY_DESIRED_DELETE_RESPONSE = 18;</code>
   */
  PROPERTY_DESIRED_DELETE_RESPONSE(18),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 设备上报向云端获取物模型查询请求
   * </pre>
   *
   * <code>MODEL_GET = 1;</code>
   */
  public static final int MODEL_GET_VALUE = 1;
  /**
   * <pre>
   * 云端响应设备上报向云端获取物模型查询请求
   * </pre>
   *
   * <code>MODEL_GET_RESPONSE = 2;</code>
   */
  public static final int MODEL_GET_RESPONSE_VALUE = 2;
  /**
   * <pre>
   * 设备上报向云端上报设备属性值
   * </pre>
   *
   * <code>PROPERTY_REPORT = 3;</code>
   */
  public static final int PROPERTY_REPORT_VALUE = 3;
  /**
   * <pre>
   * 云端响应设备上报向云端上报设备属性值
   * </pre>
   *
   * <code>PROPERTY_REPORT_RESPONSE = 4;</code>
   */
  public static final int PROPERTY_REPORT_RESPONSE_VALUE = 4;
  /**
   * <pre>
   * 云端下发属性设置
   * </pre>
   *
   * <code>PROPERTY_SET = 5;</code>
   */
  public static final int PROPERTY_SET_VALUE = 5;
  /**
   * <pre>
   * 设备响应云端下发属性设置
   * </pre>
   *
   * <code>PROPERTY_SET_RESPONSE = 6;</code>
   */
  public static final int PROPERTY_SET_RESPONSE_VALUE = 6;
  /**
   * <pre>
   * 云端下发属性查询请求
   * </pre>
   *
   * <code>PROPERTY_GET = 7;</code>
   */
  public static final int PROPERTY_GET_VALUE = 7;
  /**
   * <pre>
   * 设备响应云端下发属性查询请求
   * </pre>
   *
   * <code>PROPERTY_GET_RESPONSE = 8;</code>
   */
  public static final int PROPERTY_GET_RESPONSE_VALUE = 8;
  /**
   * <pre>
   * 云端下发设备动作执行消息
   * </pre>
   *
   * <code>ACTION_EXECUTE = 9;</code>
   */
  public static final int ACTION_EXECUTE_VALUE = 9;
  /**
   * <pre>
   * 设备响应云端下发设备动作执行消息
   * </pre>
   *
   * <code>ACTION_EXECUTE_RESPONSE = 10;</code>
   */
  public static final int ACTION_EXECUTE_RESPONSE_VALUE = 10;
  /**
   * <pre>
   * 设备上报事件触发消息
   * </pre>
   *
   * <code>EVENT_TRIGGER = 11;</code>
   */
  public static final int EVENT_TRIGGER_VALUE = 11;
  /**
   * <pre>
   * 云端响应设备上报事件触发消息
   * </pre>
   *
   * <code>EVENT_TRIGGER_RESPONSE = 12;</code>
   */
  public static final int EVENT_TRIGGER_RESPONSE_VALUE = 12;
  /**
   * <pre>
   * 设备上报 批量上报属性或事件数据
   * </pre>
   *
   * <code>DATA_BATCH_REPORT = 13;</code>
   */
  public static final int DATA_BATCH_REPORT_VALUE = 13;
  /**
   * <pre>
   * 云端响应设备上报 批量上报属性或事件数据
   * </pre>
   *
   * <code>DATA_BATCH_REPORT_RESPONSE = 14;</code>
   */
  public static final int DATA_BATCH_REPORT_RESPONSE_VALUE = 14;
  /**
   * <pre>
   * 设备上报向云端获取属性期望值请求
   * </pre>
   *
   * <code>PROPERTY_DESIRED_GET = 15;</code>
   */
  public static final int PROPERTY_DESIRED_GET_VALUE = 15;
  /**
   * <pre>
   * 云端响应设备上报向云端获取属性期望值请求
   * </pre>
   *
   * <code>PROPERTY_DESIRED_GET_RESPONSE = 16;</code>
   */
  public static final int PROPERTY_DESIRED_GET_RESPONSE_VALUE = 16;
  /**
   * <pre>
   * 设备上报向云端发送清除属性期望值请求
   * </pre>
   *
   * <code>PROPERTY_DESIRED_DELETE = 17;</code>
   */
  public static final int PROPERTY_DESIRED_DELETE_VALUE = 17;
  /**
   * <pre>
   * 云端响应设备上报向云端发送清除属性期望值请求
   * </pre>
   *
   * <code>PROPERTY_DESIRED_DELETE_RESPONSE = 18;</code>
   */
  public static final int PROPERTY_DESIRED_DELETE_RESPONSE_VALUE = 18;


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
  public static ThingModelOperationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ThingModelOperationType forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED;
      case 1: return MODEL_GET;
      case 2: return MODEL_GET_RESPONSE;
      case 3: return PROPERTY_REPORT;
      case 4: return PROPERTY_REPORT_RESPONSE;
      case 5: return PROPERTY_SET;
      case 6: return PROPERTY_SET_RESPONSE;
      case 7: return PROPERTY_GET;
      case 8: return PROPERTY_GET_RESPONSE;
      case 9: return ACTION_EXECUTE;
      case 10: return ACTION_EXECUTE_RESPONSE;
      case 11: return EVENT_TRIGGER;
      case 12: return EVENT_TRIGGER_RESPONSE;
      case 13: return DATA_BATCH_REPORT;
      case 14: return DATA_BATCH_REPORT_RESPONSE;
      case 15: return PROPERTY_DESIRED_GET;
      case 16: return PROPERTY_DESIRED_GET_RESPONSE;
      case 17: return PROPERTY_DESIRED_DELETE;
      case 18: return PROPERTY_DESIRED_DELETE_RESPONSE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ThingModelOperationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ThingModelOperationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ThingModelOperationType>() {
          public ThingModelOperationType findValueByNumber(int number) {
            return ThingModelOperationType.forNumber(number);
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
    return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ThingModelOperationType[] VALUES = values();

  public static ThingModelOperationType valueOf(
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

  private ThingModelOperationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:thingmodel.ThingModelOperationType)
}
