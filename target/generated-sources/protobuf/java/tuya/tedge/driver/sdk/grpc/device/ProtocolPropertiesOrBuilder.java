// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package tuya.tedge.driver.sdk.grpc.device;

public interface ProtocolPropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:device.ProtocolProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; pp = 1;</code>
   */
  int getPpCount();
  /**
   * <code>map&lt;string, string&gt; pp = 1;</code>
   */
  boolean containsPp(
      java.lang.String key);
  /**
   * Use {@link #getPpMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getPp();
  /**
   * <code>map&lt;string, string&gt; pp = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPpMap();
  /**
   * <code>map&lt;string, string&gt; pp = 1;</code>
   */
  /* nullable */
java.lang.String getPpOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; pp = 1;</code>
   */
  java.lang.String getPpOrThrow(
      java.lang.String key);
}