// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package tuya.tedge.driver.sdk.grpc.device;

public interface MultiDeviceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:device.MultiDeviceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 total = 1;</code>
   * @return The total.
   */
  int getTotal();

  /**
   * <code>repeated .device.DeviceInfo devices = 2;</code>
   */
  java.util.List<tuya.tedge.driver.sdk.grpc.device.DeviceInfo> 
      getDevicesList();
  /**
   * <code>repeated .device.DeviceInfo devices = 2;</code>
   */
  tuya.tedge.driver.sdk.grpc.device.DeviceInfo getDevices(int index);
  /**
   * <code>repeated .device.DeviceInfo devices = 2;</code>
   */
  int getDevicesCount();
  /**
   * <code>repeated .device.DeviceInfo devices = 2;</code>
   */
  java.util.List<? extends tuya.tedge.driver.sdk.grpc.device.DeviceInfoOrBuilder> 
      getDevicesOrBuilderList();
  /**
   * <code>repeated .device.DeviceInfo devices = 2;</code>
   */
  tuya.tedge.driver.sdk.grpc.device.DeviceInfoOrBuilder getDevicesOrBuilder(
      int index);
}