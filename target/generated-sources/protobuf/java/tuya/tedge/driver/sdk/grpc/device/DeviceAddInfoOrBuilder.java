// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package tuya.tedge.driver.sdk.grpc.device;

public interface DeviceAddInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:device.DeviceAddInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *不可更改，必填
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   *不可更改，必填
   * </pre>
   *
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
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string product_id = 4;</code>
   * @return The productId.
   */
  java.lang.String getProductId();
  /**
   * <code>string product_id = 4;</code>
   * @return The bytes for productId.
   */
  com.google.protobuf.ByteString
      getProductIdBytes();

  /**
   * <code>string ip = 5;</code>
   * @return The ip.
   */
  java.lang.String getIp();
  /**
   * <code>string ip = 5;</code>
   * @return The bytes for ip.
   */
  com.google.protobuf.ByteString
      getIpBytes();

  /**
   * <code>string lat = 6;</code>
   * @return The lat.
   */
  java.lang.String getLat();
  /**
   * <code>string lat = 6;</code>
   * @return The bytes for lat.
   */
  com.google.protobuf.ByteString
      getLatBytes();

  /**
   * <code>string lon = 7;</code>
   * @return The lon.
   */
  java.lang.String getLon();
  /**
   * <code>string lon = 7;</code>
   * @return The bytes for lon.
   */
  com.google.protobuf.ByteString
      getLonBytes();

  /**
   * <code>string vendorCode = 8;</code>
   * @return The vendorCode.
   */
  java.lang.String getVendorCode();
  /**
   * <code>string vendorCode = 8;</code>
   * @return The bytes for vendorCode.
   */
  com.google.protobuf.ByteString
      getVendorCodeBytes();

  /**
   * <code>string installLocation = 9;</code>
   * @return The installLocation.
   */
  java.lang.String getInstallLocation();
  /**
   * <code>string installLocation = 9;</code>
   * @return The bytes for installLocation.
   */
  com.google.protobuf.ByteString
      getInstallLocationBytes();

  /**
   * <code>string extend_data = 10;</code>
   * @return The extendData.
   */
  java.lang.String getExtendData();
  /**
   * <code>string extend_data = 10;</code>
   * @return The bytes for extendData.
   */
  com.google.protobuf.ByteString
      getExtendDataBytes();

  /**
   * <pre>
   *设备增加后不可更改，默认为false
   * </pre>
   *
   * <code>bool is_ipc_dev = 11;</code>
   * @return The isIpcDev.
   */
  boolean getIsIpcDev();

  /**
   * <code>map&lt;string, .device.ProtocolProperties&gt; protocols = 12;</code>
   */
  int getProtocolsCount();
  /**
   * <code>map&lt;string, .device.ProtocolProperties&gt; protocols = 12;</code>
   */
  boolean containsProtocols(
      java.lang.String key);
  /**
   * Use {@link #getProtocolsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, tuya.tedge.driver.sdk.grpc.device.ProtocolProperties>
  getProtocols();
  /**
   * <code>map&lt;string, .device.ProtocolProperties&gt; protocols = 12;</code>
   */
  java.util.Map<java.lang.String, tuya.tedge.driver.sdk.grpc.device.ProtocolProperties>
  getProtocolsMap();
  /**
   * <code>map&lt;string, .device.ProtocolProperties&gt; protocols = 12;</code>
   */
  /* nullable */
tuya.tedge.driver.sdk.grpc.device.ProtocolProperties getProtocolsOrDefault(
      java.lang.String key,
      /* nullable */
tuya.tedge.driver.sdk.grpc.device.ProtocolProperties defaultValue);
  /**
   * <code>map&lt;string, .device.ProtocolProperties&gt; protocols = 12;</code>
   */
  tuya.tedge.driver.sdk.grpc.device.ProtocolProperties getProtocolsOrThrow(
      java.lang.String key);

  /**
   * <code>string service_id = 13;</code>
   * @return The serviceId.
   */
  java.lang.String getServiceId();
  /**
   * <code>string service_id = 13;</code>
   * @return The bytes for serviceId.
   */
  com.google.protobuf.ByteString
      getServiceIdBytes();

  /**
   * <code>string online_status = 14;</code>
   * @return The onlineStatus.
   */
  java.lang.String getOnlineStatus();
  /**
   * <code>string online_status = 14;</code>
   * @return The bytes for onlineStatus.
   */
  com.google.protobuf.ByteString
      getOnlineStatusBytes();

  /**
   * <code>string active_status = 15;</code>
   * @return The activeStatus.
   */
  java.lang.String getActiveStatus();
  /**
   * <code>string active_status = 15;</code>
   * @return The bytes for activeStatus.
   */
  com.google.protobuf.ByteString
      getActiveStatusBytes();

  /**
   * <code>string cloud_device_id = 16;</code>
   * @return The cloudDeviceId.
   */
  java.lang.String getCloudDeviceId();
  /**
   * <code>string cloud_device_id = 16;</code>
   * @return The bytes for cloudDeviceId.
   */
  com.google.protobuf.ByteString
      getCloudDeviceIdBytes();

  /**
   * <code>repeated string screen_type = 17;</code>
   * @return A list containing the screenType.
   */
  java.util.List<java.lang.String>
      getScreenTypeList();
  /**
   * <code>repeated string screen_type = 17;</code>
   * @return The count of screenType.
   */
  int getScreenTypeCount();
  /**
   * <code>repeated string screen_type = 17;</code>
   * @param index The index of the element to return.
   * @return The screenType at the given index.
   */
  java.lang.String getScreenType(int index);
  /**
   * <code>repeated string screen_type = 17;</code>
   * @param index The index of the value to return.
   * @return The bytes of the screenType at the given index.
   */
  com.google.protobuf.ByteString
      getScreenTypeBytes(int index);

  /**
   * <pre>
   * 父级id
   * </pre>
   *
   * <code>string parent_cloud_id = 18;</code>
   * @return The parentCloudId.
   */
  java.lang.String getParentCloudId();
  /**
   * <pre>
   * 父级id
   * </pre>
   *
   * <code>string parent_cloud_id = 18;</code>
   * @return The bytes for parentCloudId.
   */
  com.google.protobuf.ByteString
      getParentCloudIdBytes();

  /**
   * <pre>
   * 是否为中控设备
   * </pre>
   *
   * <code>bool is_screen_device = 19;</code>
   * @return The isScreenDevice.
   */
  boolean getIsScreenDevice();

  /**
   * <pre>
   * 设备添加请求来源
   * </pre>
   *
   * <code>.device.EnumDeviceSource source = 20;</code>
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   * <pre>
   * 设备添加请求来源
   * </pre>
   *
   * <code>.device.EnumDeviceSource source = 20;</code>
   * @return The source.
   */
  tuya.tedge.driver.sdk.grpc.device.EnumDeviceSource getSource();
}
