// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package tuya.tedge.driver.sdk.grpc.device;

public interface ActiveDeviceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:device.ActiveDeviceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 process_num = 1;</code>
   * @return The processNum.
   */
  int getProcessNum();

  /**
   * <code>int32 success_num = 2;</code>
   * @return The successNum.
   */
  int getSuccessNum();

  /**
   * <code>int32 fail_num = 3;</code>
   * @return The failNum.
   */
  int getFailNum();

  /**
   * <code>repeated .device.ActiveDeviceResult active_device_results = 4;</code>
   */
  java.util.List<tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult> 
      getActiveDeviceResultsList();
  /**
   * <code>repeated .device.ActiveDeviceResult active_device_results = 4;</code>
   */
  tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResult getActiveDeviceResults(int index);
  /**
   * <code>repeated .device.ActiveDeviceResult active_device_results = 4;</code>
   */
  int getActiveDeviceResultsCount();
  /**
   * <code>repeated .device.ActiveDeviceResult active_device_results = 4;</code>
   */
  java.util.List<? extends tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResultOrBuilder> 
      getActiveDeviceResultsOrBuilderList();
  /**
   * <code>repeated .device.ActiveDeviceResult active_device_results = 4;</code>
   */
  tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResultOrBuilder getActiveDeviceResultsOrBuilder(
      int index);
}
