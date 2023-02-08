// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package tuya.tedge.driver.sdk.grpc.product;

public interface DPOrBuilder extends
    // @@protoc_insertion_point(interface_extends:product.DP)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string description = 1;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.product.PropertyValue properties = 3;</code>
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   * <code>.product.PropertyValue properties = 3;</code>
   * @return The properties.
   */
  tuya.tedge.driver.sdk.grpc.product.PropertyValue getProperties();
  /**
   * <code>.product.PropertyValue properties = 3;</code>
   */
  tuya.tedge.driver.sdk.grpc.product.PropertyValueOrBuilder getPropertiesOrBuilder();

  /**
   * <code>map&lt;string, string&gt; attributes = 4;</code>
   */
  int getAttributesCount();
  /**
   * <code>map&lt;string, string&gt; attributes = 4;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributes();
  /**
   * <code>map&lt;string, string&gt; attributes = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributesMap();
  /**
   * <code>map&lt;string, string&gt; attributes = 4;</code>
   */
  /* nullable */
java.lang.String getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attributes = 4;</code>
   */
  java.lang.String getAttributesOrThrow(
      java.lang.String key);
}
