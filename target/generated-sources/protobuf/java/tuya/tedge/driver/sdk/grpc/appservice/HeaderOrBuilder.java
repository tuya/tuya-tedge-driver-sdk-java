// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appservice.proto

package tuya.tedge.driver.sdk.grpc.appservice;

public interface HeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appService.Header)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <code>string from = 2;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 2;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>map&lt;string, string&gt; option = 3;</code>
   */
  int getOptionCount();
  /**
   * <code>map&lt;string, string&gt; option = 3;</code>
   */
  boolean containsOption(
      java.lang.String key);
  /**
   * Use {@link #getOptionMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getOption();
  /**
   * <code>map&lt;string, string&gt; option = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getOptionMap();
  /**
   * <code>map&lt;string, string&gt; option = 3;</code>
   */
  /* nullable */
java.lang.String getOptionOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; option = 3;</code>
   */
  java.lang.String getOptionOrThrow(
      java.lang.String key);
}