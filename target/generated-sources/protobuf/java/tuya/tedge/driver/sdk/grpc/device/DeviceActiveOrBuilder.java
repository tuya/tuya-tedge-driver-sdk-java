// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package tuya.tedge.driver.sdk.grpc.device;

public interface DeviceActiveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:device.DeviceActive)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string id = 1;</code>
   * @return A list containing the id.
   */
  java.util.List<java.lang.String>
      getIdList();
  /**
   * <code>repeated string id = 1;</code>
   * @return The count of id.
   */
  int getIdCount();
  /**
   * <code>repeated string id = 1;</code>
   * @param index The index of the element to return.
   * @return The id at the given index.
   */
  java.lang.String getId(int index);
  /**
   * <code>repeated string id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the id at the given index.
   */
  com.google.protobuf.ByteString
      getIdBytes(int index);

  /**
   * <code>bool is_all = 2;</code>
   * @return The isAll.
   */
  boolean getIsAll();
}
