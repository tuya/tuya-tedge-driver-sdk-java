// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package tuya.tedge.driver.sdk.grpc.product;

public interface ProductsAddRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:product.ProductsAddRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  java.util.List<tuya.tedge.driver.sdk.grpc.product.Product> 
      getProductsList();
  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  tuya.tedge.driver.sdk.grpc.product.Product getProducts(int index);
  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  int getProductsCount();
  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  java.util.List<? extends tuya.tedge.driver.sdk.grpc.product.ProductOrBuilder> 
      getProductsOrBuilderList();
  /**
   * <code>repeated .product.Product products = 1;</code>
   */
  tuya.tedge.driver.sdk.grpc.product.ProductOrBuilder getProductsOrBuilder(
      int index);
}
