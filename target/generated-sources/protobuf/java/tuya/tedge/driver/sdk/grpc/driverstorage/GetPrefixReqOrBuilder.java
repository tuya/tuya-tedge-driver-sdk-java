// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: driverstorage.proto

package tuya.tedge.driver.sdk.grpc.driverstorage;

public interface GetPrefixReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:driverstorage.GetPrefixReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string driver_service_id = 1;</code>
   * @return The driverServiceId.
   */
  java.lang.String getDriverServiceId();
  /**
   * <code>string driver_service_id = 1;</code>
   * @return The bytes for driverServiceId.
   */
  com.google.protobuf.ByteString
      getDriverServiceIdBytes();

  /**
   * <pre>
   * 根据前缀获取
   * </pre>
   *
   * <code>string prefix = 2;</code>
   * @return The prefix.
   */
  java.lang.String getPrefix();
  /**
   * <pre>
   * 根据前缀获取
   * </pre>
   *
   * <code>string prefix = 2;</code>
   * @return The bytes for prefix.
   */
  com.google.protobuf.ByteString
      getPrefixBytes();
}
