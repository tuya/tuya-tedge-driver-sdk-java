package tuya.tedge.driver.sdk.grpc.appservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: appservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppToDriverServiceGrpc {

  private AppToDriverServiceGrpc() {}

  public static final String SERVICE_NAME = "appService.AppToDriverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.appservice.Data,
      tuya.tedge.driver.sdk.grpc.appservice.SendResponse> getSendToDriverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendToDriver",
      requestType = tuya.tedge.driver.sdk.grpc.appservice.Data.class,
      responseType = tuya.tedge.driver.sdk.grpc.appservice.SendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.appservice.Data,
      tuya.tedge.driver.sdk.grpc.appservice.SendResponse> getSendToDriverMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.appservice.Data, tuya.tedge.driver.sdk.grpc.appservice.SendResponse> getSendToDriverMethod;
    if ((getSendToDriverMethod = AppToDriverServiceGrpc.getSendToDriverMethod) == null) {
      synchronized (AppToDriverServiceGrpc.class) {
        if ((getSendToDriverMethod = AppToDriverServiceGrpc.getSendToDriverMethod) == null) {
          AppToDriverServiceGrpc.getSendToDriverMethod = getSendToDriverMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.appservice.Data, tuya.tedge.driver.sdk.grpc.appservice.SendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendToDriver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.appservice.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.appservice.SendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppToDriverServiceMethodDescriptorSupplier("SendToDriver"))
              .build();
        }
      }
    }
    return getSendToDriverMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppToDriverServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppToDriverServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppToDriverServiceStub>() {
        @java.lang.Override
        public AppToDriverServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppToDriverServiceStub(channel, callOptions);
        }
      };
    return AppToDriverServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppToDriverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppToDriverServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppToDriverServiceBlockingStub>() {
        @java.lang.Override
        public AppToDriverServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppToDriverServiceBlockingStub(channel, callOptions);
        }
      };
    return AppToDriverServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppToDriverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppToDriverServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppToDriverServiceFutureStub>() {
        @java.lang.Override
        public AppToDriverServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppToDriverServiceFutureStub(channel, callOptions);
        }
      };
    return AppToDriverServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AppToDriverServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendToDriver(tuya.tedge.driver.sdk.grpc.appservice.Data request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.appservice.SendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendToDriverMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendToDriverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.appservice.Data,
                tuya.tedge.driver.sdk.grpc.appservice.SendResponse>(
                  this, METHODID_SEND_TO_DRIVER)))
          .build();
    }
  }

  /**
   */
  public static final class AppToDriverServiceStub extends io.grpc.stub.AbstractAsyncStub<AppToDriverServiceStub> {
    private AppToDriverServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppToDriverServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppToDriverServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendToDriver(tuya.tedge.driver.sdk.grpc.appservice.Data request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.appservice.SendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendToDriverMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AppToDriverServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AppToDriverServiceBlockingStub> {
    private AppToDriverServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppToDriverServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppToDriverServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public tuya.tedge.driver.sdk.grpc.appservice.SendResponse sendToDriver(tuya.tedge.driver.sdk.grpc.appservice.Data request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendToDriverMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppToDriverServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AppToDriverServiceFutureStub> {
    private AppToDriverServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppToDriverServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppToDriverServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.appservice.SendResponse> sendToDriver(
        tuya.tedge.driver.sdk.grpc.appservice.Data request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendToDriverMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_TO_DRIVER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppToDriverServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppToDriverServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_TO_DRIVER:
          serviceImpl.sendToDriver((tuya.tedge.driver.sdk.grpc.appservice.Data) request,
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

  private static abstract class AppToDriverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppToDriverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.appservice.AppService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppToDriverService");
    }
  }

  private static final class AppToDriverServiceFileDescriptorSupplier
      extends AppToDriverServiceBaseDescriptorSupplier {
    AppToDriverServiceFileDescriptorSupplier() {}
  }

  private static final class AppToDriverServiceMethodDescriptorSupplier
      extends AppToDriverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppToDriverServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppToDriverServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppToDriverServiceFileDescriptorSupplier())
              .addMethod(getSendToDriverMethod())
              .build();
        }
      }
    }
    return result;
  }
}
