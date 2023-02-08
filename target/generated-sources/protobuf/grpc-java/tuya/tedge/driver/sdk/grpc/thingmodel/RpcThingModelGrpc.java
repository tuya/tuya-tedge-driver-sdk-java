package tuya.tedge.driver.sdk.grpc.thingmodel;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *&#47;/////////////////////////////////////////////////////////////////////////////////////
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: thingmodel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcThingModelGrpc {

  private RpcThingModelGrpc() {}

  public static final String SERVICE_NAME = "thingmodel.RpcThingModel";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest,
      tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct> getProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductById",
      requestType = tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest.class,
      responseType = tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest,
      tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct> getProductByIdMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest, tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct> getProductByIdMethod;
    if ((getProductByIdMethod = RpcThingModelGrpc.getProductByIdMethod) == null) {
      synchronized (RpcThingModelGrpc.class) {
        if ((getProductByIdMethod = RpcThingModelGrpc.getProductByIdMethod) == null) {
          RpcThingModelGrpc.getProductByIdMethod = getProductByIdMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest, tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct.getDefaultInstance()))
              .setSchemaDescriptor(new RpcThingModelMethodDescriptorSupplier("ProductById"))
              .build();
        }
      }
    }
    return getProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest,
      tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse> getProductsSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductsSearch",
      requestType = tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest.class,
      responseType = tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest,
      tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse> getProductsSearchMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest, tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse> getProductsSearchMethod;
    if ((getProductsSearchMethod = RpcThingModelGrpc.getProductsSearchMethod) == null) {
      synchronized (RpcThingModelGrpc.class) {
        if ((getProductsSearchMethod = RpcThingModelGrpc.getProductsSearchMethod) == null) {
          RpcThingModelGrpc.getProductsSearchMethod = getProductsSearchMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest, tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductsSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RpcThingModelMethodDescriptorSupplier("ProductsSearch"))
              .build();
        }
      }
    }
    return getProductsSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcThingModelStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcThingModelStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcThingModelStub>() {
        @java.lang.Override
        public RpcThingModelStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcThingModelStub(channel, callOptions);
        }
      };
    return RpcThingModelStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcThingModelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcThingModelBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcThingModelBlockingStub>() {
        @java.lang.Override
        public RpcThingModelBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcThingModelBlockingStub(channel, callOptions);
        }
      };
    return RpcThingModelBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcThingModelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcThingModelFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcThingModelFutureStub>() {
        @java.lang.Override
        public RpcThingModelFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcThingModelFutureStub(channel, callOptions);
        }
      };
    return RpcThingModelFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static abstract class RpcThingModelImplBase implements io.grpc.BindableService {

    /**
     */
    public void productById(tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void productsSearch(tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductsSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProductByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest,
                tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct>(
                  this, METHODID_PRODUCT_BY_ID)))
          .addMethod(
            getProductsSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest,
                tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse>(
                  this, METHODID_PRODUCTS_SEARCH)))
          .build();
    }
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static final class RpcThingModelStub extends io.grpc.stub.AbstractAsyncStub<RpcThingModelStub> {
    private RpcThingModelStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcThingModelStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcThingModelStub(channel, callOptions);
    }

    /**
     */
    public void productById(tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void productsSearch(tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductsSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static final class RpcThingModelBlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcThingModelBlockingStub> {
    private RpcThingModelBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcThingModelBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcThingModelBlockingStub(channel, callOptions);
    }

    /**
     */
    public tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct productById(tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse productsSearch(tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductsSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static final class RpcThingModelFutureStub extends io.grpc.stub.AbstractFutureStub<RpcThingModelFutureStub> {
    private RpcThingModelFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcThingModelFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcThingModelFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct> productById(
        tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse> productsSearch(
        tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductsSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRODUCT_BY_ID = 0;
  private static final int METHODID_PRODUCTS_SEARCH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcThingModelImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcThingModelImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRODUCT_BY_ID:
          serviceImpl.productById((tuya.tedge.driver.sdk.grpc.thingmodel.TMProductByIdRequest) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct>) responseObserver);
          break;
        case METHODID_PRODUCTS_SEARCH:
          serviceImpl.productsSearch((tuya.tedge.driver.sdk.grpc.thingmodel.TMProductSearchQueryRequest) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.thingmodel.TMMultiProductsResponse>) responseObserver);
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

  private static abstract class RpcThingModelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcThingModelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcThingModel");
    }
  }

  private static final class RpcThingModelFileDescriptorSupplier
      extends RpcThingModelBaseDescriptorSupplier {
    RpcThingModelFileDescriptorSupplier() {}
  }

  private static final class RpcThingModelMethodDescriptorSupplier
      extends RpcThingModelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcThingModelMethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcThingModelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcThingModelFileDescriptorSupplier())
              .addMethod(getProductByIdMethod())
              .addMethod(getProductsSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
