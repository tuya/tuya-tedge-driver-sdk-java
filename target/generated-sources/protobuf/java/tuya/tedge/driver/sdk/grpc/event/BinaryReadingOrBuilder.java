// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package tuya.tedge.driver.sdk.grpc.event;

public interface BinaryReadingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event.BinaryReading)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string media_type = 1;</code>
   * @return The mediaType.
   */
  java.lang.String getMediaType();
  /**
   * <code>string media_type = 1;</code>
   * @return The bytes for mediaType.
   */
  com.google.protobuf.ByteString
      getMediaTypeBytes();

  /**
   * <code>bytes binary_value = 2;</code>
   * @return The binaryValue.
   */
  com.google.protobuf.ByteString getBinaryValue();
}