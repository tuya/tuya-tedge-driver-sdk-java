// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thingmodel.proto

package tuya.tedge.driver.sdk.grpc.thingmodel;

public interface ThingModelMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:thingmodel.ThingModelMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 下发的目标设备id
   * </pre>
   *
   * <code>string cid = 1;</code>
   * @return The cid.
   */
  java.lang.String getCid();
  /**
   * <pre>
   * 下发的目标设备id
   * </pre>
   *
   * <code>string cid = 1;</code>
   * @return The bytes for cid.
   */
  com.google.protobuf.ByteString
      getCidBytes();

  /**
   * <code>.thingmodel.ThingModelOperationType op_type = 2;</code>
   * @return The enum numeric value on the wire for opType.
   */
  int getOpTypeValue();
  /**
   * <code>.thingmodel.ThingModelOperationType op_type = 2;</code>
   * @return The opType.
   */
  tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelOperationType getOpType();

  /**
   * <code>string data = 3;</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 3;</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();
}