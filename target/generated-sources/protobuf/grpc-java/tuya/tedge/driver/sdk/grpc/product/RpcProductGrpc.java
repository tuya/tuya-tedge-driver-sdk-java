package tuya.tedge.driver.sdk.grpc.product;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: product.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcProductGrpc {

  private RpcProductGrpc() {}

  public static final String SERVICE_NAME = "product.RpcProduct";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest,
      tuya.tedge.driver.sdk.grpc.product.Product> getProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductById",
      requestType = tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest.class,
      responseType = tuya.tedge.driver.sdk.grpc.product.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest,
      tuya.tedge.driver.sdk.grpc.product.Product> getProductByIdMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest, tuya.tedge.driver.sdk.grpc.product.Product> getProductByIdMethod;
    if ((getProductByIdMethod = RpcProductGrpc.getProductByIdMethod) == null) {
      synchronized (RpcProductGrpc.class) {
        if ((getProductByIdMethod = RpcProductGrpc.getProductByIdMethod) == null) {
          RpcProductGrpc.getProductByIdMethod = getProductByIdMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest, tuya.tedge.driver.sdk.grpc.product.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.product.Product.getDefaultInstance()))
              .setSchemaDescriptor(new RpcProductMethodDescriptorSupplier("ProductById"))
              .build();
        }
      }
    }
    return getProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest,
      tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse> getProductsSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductsSearch",
      requestType = tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest.class,
      responseType = tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest,
      tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse> getProductsSearchMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest, tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse> getProductsSearchMethod;
    if ((getProductsSearchMethod = RpcProductGrpc.getProductsSearchMethod) == null) {
      synchronized (RpcProductGrpc.class) {
        if ((getProductsSearchMethod = RpcProductGrpc.getProductsSearchMethod) == null) {
          RpcProductGrpc.getProductsSearchMethod = getProductsSearchMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest, tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductsSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RpcProductMethodDescriptorSupplier("ProductsSearch"))
              .build();
        }
      }
    }
    return getProductsSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.Product,
      com.google.protobuf.Empty> getProductAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductAdd",
      requestType = tuya.tedge.driver.sdk.grpc.product.Product.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.Product,
      com.google.protobuf.Empty> getProductAddMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.Product, com.google.protobuf.Empty> getProductAddMethod;
    if ((getProductAddMethod = RpcProductGrpc.getProductAddMethod) == null) {
      synchronized (RpcProductGrpc.class) {
        if ((getProductAddMethod = RpcProductGrpc.getProductAddMethod) == null) {
          RpcProductGrpc.getProductAddMethod = getProductAddMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.product.Product, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.product.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RpcProductMethodDescriptorSupplier("ProductAdd"))
              .build();
        }
      }
    }
    return getProductAddMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcProductStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcProductStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcProductStub>() {
        @java.lang.Override
        public RpcProductStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcProductStub(channel, callOptions);
        }
      };
    return RpcProductStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcProductBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcProductBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcProductBlockingStub>() {
        @java.lang.Override
        public RpcProductBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcProductBlockingStub(channel, callOptions);
        }
      };
    return RpcProductBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcProductFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcProductFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcProductFutureStub>() {
        @java.lang.Override
        public RpcProductFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcProductFutureStub(channel, callOptions);
        }
      };
    return RpcProductFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcProductImplBase implements io.grpc.BindableService {

    /**
     */
    public void productById(tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.product.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void productsSearch(tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductsSearchMethod(), responseObserver);
    }

    /**
     */
    public void productAdd(tuya.tedge.driver.sdk.grpc.product.Product request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductAddMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProductByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest,
                tuya.tedge.driver.sdk.grpc.product.Product>(
                  this, METHODID_PRODUCT_BY_ID)))
          .addMethod(
            getProductsSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest,
                tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse>(
                  this, METHODID_PRODUCTS_SEARCH)))
          .addMethod(
            getProductAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.product.Product,
                com.google.protobuf.Empty>(
                  this, METHODID_PRODUCT_ADD)))
          .build();
    }
  }

  /**
   */
  public static final class RpcProductStub extends io.grpc.stub.AbstractAsyncStub<RpcProductStub> {
    private RpcProductStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcProductStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcProductStub(channel, callOptions);
    }

    /**
     */
    public void productById(tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.product.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void productsSearch(tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductsSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void productAdd(tuya.tedge.driver.sdk.grpc.product.Product request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductAddMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcProductBlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcProductBlockingStub> {
    private RpcProductBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcProductBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcProductBlockingStub(channel, callOptions);
    }

    /**
     */
    public tuya.tedge.driver.sdk.grpc.product.Product productById(tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse productsSearch(tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductsSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty productAdd(tuya.tedge.driver.sdk.grpc.product.Product request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductAddMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcProductFutureStub extends io.grpc.stub.AbstractFutureStub<RpcProductFutureStub> {
    private RpcProductFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcProductFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcProductFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.product.Product> productById(
        tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse> productsSearch(
        tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductsSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> productAdd(
        tuya.tedge.driver.sdk.grpc.product.Product request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRODUCT_BY_ID = 0;
  private static final int METHODID_PRODUCTS_SEARCH = 1;
  private static final int METHODID_PRODUCT_ADD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcProductImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcProductImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRODUCT_BY_ID:
          serviceImpl.productById((tuya.tedge.driver.sdk.grpc.product.ProductByIdRequest) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.product.Product>) responseObserver);
          break;
        case METHODID_PRODUCTS_SEARCH:
          serviceImpl.productsSearch((tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse>) responseObserver);
          break;
        case METHODID_PRODUCT_ADD:
          serviceImpl.productAdd((tuya.tedge.driver.sdk.grpc.product.Product) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RpcProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcProductBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.product.ProductProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcProduct");
    }
  }

  private static final class RpcProductFileDescriptorSupplier
      extends RpcProductBaseDescriptorSupplier {
    RpcProductFileDescriptorSupplier() {}
  }

  private static final class RpcProductMethodDescriptorSupplier
      extends RpcProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcProductMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RpcProductGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcProductFileDescriptorSupplier())
              .addMethod(getProductByIdMethod())
              .addMethod(getProductsSearchMethod())
              .addMethod(getProductAddMethod())
              .build();
        }
      }
    }
    return result;
  }
}
