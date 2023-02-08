package tuya.tedge.driver.sdk.grpc.appservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: appservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DriverToAppServiceGrpc {

  private DriverToAppServiceGrpc() {}

  public static final String SERVICE_NAME = "appService.DriverToAppService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.appservice.Data,
      tuya.tedge.driver.sdk.grpc.appservice.SendResponse> getSendToAppServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendToAppService",
      requestType = tuya.tedge.driver.sdk.grpc.appservice.Data.class,
      responseType = tuya.tedge.driver.sdk.grpc.appservice.SendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.appservice.Data,
      tuya.tedge.driver.sdk.grpc.appservice.SendResponse> getSendToAppServiceMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.appservice.Data, tuya.tedge.driver.sdk.grpc.appservice.SendResponse> getSendToAppServiceMethod;
    if ((getSendToAppServiceMethod = DriverToAppServiceGrpc.getSendToAppServiceMethod) == null) {
      synchronized (DriverToAppServiceGrpc.class) {
        if ((getSendToAppServiceMethod = DriverToAppServiceGrpc.getSendToAppServiceMethod) == null) {
          DriverToAppServiceGrpc.getSendToAppServiceMethod = getSendToAppServiceMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.appservice.Data, tuya.tedge.driver.sdk.grpc.appservice.SendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendToAppService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.appservice.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.appservice.SendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriverToAppServiceMethodDescriptorSupplier("SendToAppService"))
              .build();
        }
      }
    }
    return getSendToAppServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DriverToAppServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverToAppServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverToAppServiceStub>() {
        @java.lang.Override
        public DriverToAppServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverToAppServiceStub(channel, callOptions);
        }
      };
    return DriverToAppServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DriverToAppServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverToAppServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverToAppServiceBlockingStub>() {
        @java.lang.Override
        public DriverToAppServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverToAppServiceBlockingStub(channel, callOptions);
        }
      };
    return DriverToAppServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DriverToAppServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverToAppServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverToAppServiceFutureStub>() {
        @java.lang.Override
        public DriverToAppServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverToAppServiceFutureStub(channel, callOptions);
        }
      };
    return DriverToAppServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DriverToAppServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendToAppService(tuya.tedge.driver.sdk.grpc.appservice.Data request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.appservice.SendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendToAppServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendToAppServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.appservice.Data,
                tuya.tedge.driver.sdk.grpc.appservice.SendResponse>(
                  this, METHODID_SEND_TO_APP_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class DriverToAppServiceStub extends io.grpc.stub.AbstractAsyncStub<DriverToAppServiceStub> {
    private DriverToAppServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverToAppServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverToAppServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendToAppService(tuya.tedge.driver.sdk.grpc.appservice.Data request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.appservice.SendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendToAppServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DriverToAppServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DriverToAppServiceBlockingStub> {
    private DriverToAppServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverToAppServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverToAppServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public tuya.tedge.driver.sdk.grpc.appservice.SendResponse sendToAppService(tuya.tedge.driver.sdk.grpc.appservice.Data request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendToAppServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DriverToAppServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DriverToAppServiceFutureStub> {
    private DriverToAppServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverToAppServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverToAppServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.appservice.SendResponse> sendToAppService(
        tuya.tedge.driver.sdk.grpc.appservice.Data request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendToAppServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_TO_APP_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DriverToAppServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DriverToAppServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_TO_APP_SERVICE:
          serviceImpl.sendToAppService((tuya.tedge.driver.sdk.grpc.appservice.Data) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.appservice.SendResponse>) responseObserver);
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

  private static abstract class DriverToAppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DriverToAppServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.appservice.AppService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DriverToAppService");
    }
  }

  private static final class DriverToAppServiceFileDescriptorSupplier
      extends DriverToAppServiceBaseDescriptorSupplier {
    DriverToAppServiceFileDescriptorSupplier() {}
  }

  private static final class DriverToAppServiceMethodDescriptorSupplier
      extends DriverToAppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DriverToAppServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DriverToAppServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DriverToAppServiceFileDescriptorSupplier())
              .addMethod(getSendToAppServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
