package tuya.tedge.driver.sdk.grpc.devicecallback;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: drivercallback.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DPModelDriverServiceGrpc {

  private DPModelDriverServiceGrpc() {}

  public static final String SERVICE_NAME = "drivercallback.DPModelDriverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.Product,
      com.google.protobuf.Empty> getUpdateProductCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProductCallback",
      requestType = tuya.tedge.driver.sdk.grpc.product.Product.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.Product,
      com.google.protobuf.Empty> getUpdateProductCallbackMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.product.Product, com.google.protobuf.Empty> getUpdateProductCallbackMethod;
    if ((getUpdateProductCallbackMethod = DPModelDriverServiceGrpc.getUpdateProductCallbackMethod) == null) {
      synchronized (DPModelDriverServiceGrpc.class) {
        if ((getUpdateProductCallbackMethod = DPModelDriverServiceGrpc.getUpdateProductCallbackMethod) == null) {
          DPModelDriverServiceGrpc.getUpdateProductCallbackMethod = getUpdateProductCallbackMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.product.Product, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProductCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.product.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DPModelDriverServiceMethodDescriptorSupplier("UpdateProductCallback"))
              .build();
        }
      }
    }
    return getUpdateProductCallbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest,
      com.google.protobuf.Empty> getIssueCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IssueCommand",
      requestType = tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest,
      com.google.protobuf.Empty> getIssueCommandMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest, com.google.protobuf.Empty> getIssueCommandMethod;
    if ((getIssueCommandMethod = DPModelDriverServiceGrpc.getIssueCommandMethod) == null) {
      synchronized (DPModelDriverServiceGrpc.class) {
        if ((getIssueCommandMethod = DPModelDriverServiceGrpc.getIssueCommandMethod) == null) {
          DPModelDriverServiceGrpc.getIssueCommandMethod = getIssueCommandMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IssueCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DPModelDriverServiceMethodDescriptorSupplier("IssueCommand"))
              .build();
        }
      }
    }
    return getIssueCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DPModelDriverServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DPModelDriverServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DPModelDriverServiceStub>() {
        @java.lang.Override
        public DPModelDriverServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DPModelDriverServiceStub(channel, callOptions);
        }
      };
    return DPModelDriverServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DPModelDriverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DPModelDriverServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DPModelDriverServiceBlockingStub>() {
        @java.lang.Override
        public DPModelDriverServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DPModelDriverServiceBlockingStub(channel, callOptions);
        }
      };
    return DPModelDriverServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DPModelDriverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DPModelDriverServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DPModelDriverServiceFutureStub>() {
        @java.lang.Override
        public DPModelDriverServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DPModelDriverServiceFutureStub(channel, callOptions);
        }
      };
    return DPModelDriverServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DPModelDriverServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateProductCallback(tuya.tedge.driver.sdk.grpc.product.Product request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductCallbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * 指令下发
     * </pre>
     */
    public void issueCommand(tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIssueCommandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateProductCallbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.product.Product,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_PRODUCT_CALLBACK)))
          .addMethod(
            getIssueCommandMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ISSUE_COMMAND)))
          .build();
    }
  }

  /**
   */
  public static final class DPModelDriverServiceStub extends io.grpc.stub.AbstractAsyncStub<DPModelDriverServiceStub> {
    private DPModelDriverServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DPModelDriverServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DPModelDriverServiceStub(channel, callOptions);
    }

    /**
     */
    public void updateProductCallback(tuya.tedge.driver.sdk.grpc.product.Product request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductCallbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 指令下发
     * </pre>
     */
    public void issueCommand(tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIssueCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DPModelDriverServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DPModelDriverServiceBlockingStub> {
    private DPModelDriverServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DPModelDriverServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DPModelDriverServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty updateProductCallback(tuya.tedge.driver.sdk.grpc.product.Product request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductCallbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 指令下发
     * </pre>
     */
    public com.google.protobuf.Empty issueCommand(tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIssueCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DPModelDriverServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DPModelDriverServiceFutureStub> {
    private DPModelDriverServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DPModelDriverServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DPModelDriverServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateProductCallback(
        tuya.tedge.driver.sdk.grpc.product.Product request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductCallbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 指令下发
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> issueCommand(
        tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIssueCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_PRODUCT_CALLBACK = 0;
  private static final int METHODID_ISSUE_COMMAND = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DPModelDriverServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DPModelDriverServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_PRODUCT_CALLBACK:
          serviceImpl.updateProductCallback((tuya.tedge.driver.sdk.grpc.product.Product) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ISSUE_COMMAND:
          serviceImpl.issueCommand((tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest) request,
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

  private static abstract class DPModelDriverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DPModelDriverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.devicecallback.DeviceCallbackProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DPModelDriverService");
    }
  }

  private static final class DPModelDriverServiceFileDescriptorSupplier
      extends DPModelDriverServiceBaseDescriptorSupplier {
    DPModelDriverServiceFileDescriptorSupplier() {}
  }

  private static final class DPModelDriverServiceMethodDescriptorSupplier
      extends DPModelDriverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DPModelDriverServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DPModelDriverServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DPModelDriverServiceFileDescriptorSupplier())
              .addMethod(getUpdateProductCallbackMethod())
              .addMethod(getIssueCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
