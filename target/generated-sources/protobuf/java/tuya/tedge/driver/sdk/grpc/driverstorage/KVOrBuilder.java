// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: driverstorage.proto

package tuya.tedge.driver.sdk.grpc.driverstorage;

public interface KVOrBuilder extends
    // @@protoc_insertion_point(interface_extends:driverstorage.KV)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>bytes value = 2;</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();
}
