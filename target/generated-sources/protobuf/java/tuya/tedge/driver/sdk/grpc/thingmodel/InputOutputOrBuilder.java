// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thingmodel.proto

package tuya.tedge.driver.sdk.grpc.thingmodel;

public interface InputOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:thingmodel.InputOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string code = 1;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <code>string code = 1;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

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
   * <code>.thingmodel.TypeSpec type_spec = 3;</code>
   * @return Whether the typeSpec field is set.
   */
  boolean hasTypeSpec();
  /**
   * <code>.thingmodel.TypeSpec type_spec = 3;</code>
   * @return The typeSpec.
   */
  tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpec getTypeSpec();
  /**
   * <code>.thingmodel.TypeSpec type_spec = 3;</code>
   */
  tuya.tedge.driver.sdk.grpc.thingmodel.TypeSpecOrBuilder getTypeSpecOrBuilder();
}
