// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package tuya.tedge.driver.sdk.grpc.device;

public interface ActiveDeviceResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:device.ActiveDeviceResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>bool process_success = 3;</code>
   * @return The processSuccess.
   */
  boolean getProcessSuccess();

  /**
   * <code>string active_status = 4;</code>
   * @return The activeStatus.
   */
  java.lang.String getActiveStatus();
  /**
   * <code>string active_status = 4;</code>
   * @return The bytes for activeStatus.
   */
  com.google.protobuf.ByteString
      getActiveStatusBytes();

  /**
   * <code>string remark = 5;</code>
   * @return The remark.
   */
  java.lang.String getRemark();
  /**
   * <code>string remark = 5;</code>
   * @return The bytes for remark.
   */
  com.google.protobuf.ByteString
      getRemarkBytes();
}
