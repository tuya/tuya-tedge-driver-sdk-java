// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package tuya.tedge.driver.sdk.grpc.common;

public interface PageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.PageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name_like = 1;</code>
   * @return The nameLike.
   */
  java.lang.String getNameLike();
  /**
   * <code>string name_like = 1;</code>
   * @return The bytes for nameLike.
   */
  com.google.protobuf.ByteString
      getNameLikeBytes();

  /**
   * <code>int64 page = 2;</code>
   * @return The page.
   */
  long getPage();

  /**
   * <code>int64 page_size = 3;</code>
   * @return The pageSize.
   */
  long getPageSize();
}
