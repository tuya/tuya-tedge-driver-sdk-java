package tuya.tedge.driver.sdk.grpc.deviceservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: deviceservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcDeviceServiceGrpc {

  private RpcDeviceServiceGrpc() {}

  public static final String SERVICE_NAME = "deviceservice.RpcDeviceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest,
      tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> getDeviceServiceByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeviceServiceById",
      requestType = tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest.class,
      responseType = tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest,
      tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> getDeviceServiceByIdMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest, tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> getDeviceServiceByIdMethod;
    if ((getDeviceServiceByIdMethod = RpcDeviceServiceGrpc.getDeviceServiceByIdMethod) == null) {
      synchronized (RpcDeviceServiceGrpc.class) {
        if ((getDeviceServiceByIdMethod = RpcDeviceServiceGrpc.getDeviceServiceByIdMethod) == null) {
          RpcDeviceServiceGrpc.getDeviceServiceByIdMethod = getDeviceServiceByIdMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest, tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeviceServiceById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceServiceMethodDescriptorSupplier("DeviceServiceById"))
              .build();
        }
      }
    }
    return getDeviceServiceByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq,
      tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> getGetAppRegisterNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppRegisterName",
      requestType = tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq.class,
      responseType = tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq,
      tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> getGetAppRegisterNameMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq, tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> getGetAppRegisterNameMethod;
    if ((getGetAppRegisterNameMethod = RpcDeviceServiceGrpc.getGetAppRegisterNameMethod) == null) {
      synchronized (RpcDeviceServiceGrpc.class) {
        if ((getGetAppRegisterNameMethod = RpcDeviceServiceGrpc.getGetAppRegisterNameMethod) == null) {
          RpcDeviceServiceGrpc.getGetAppRegisterNameMethod = getGetAppRegisterNameMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq, tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppRegisterName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceServiceMethodDescriptorSupplier("GetAppRegisterName"))
              .build();
        }
      }
    }
    return getGetAppRegisterNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest,
      com.google.protobuf.Empty> getDriverProxyRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DriverProxyRegister",
      requestType = tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest,
      com.google.protobuf.Empty> getDriverProxyRegisterMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest, com.google.protobuf.Empty> getDriverProxyRegisterMethod;
    if ((getDriverProxyRegisterMethod = RpcDeviceServiceGrpc.getDriverProxyRegisterMethod) == null) {
      synchronized (RpcDeviceServiceGrpc.class) {
        if ((getDriverProxyRegisterMethod = RpcDeviceServiceGrpc.getDriverProxyRegisterMethod) == null) {
          RpcDeviceServiceGrpc.getDriverProxyRegisterMethod = getDriverProxyRegisterMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DriverProxyRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceServiceMethodDescriptorSupplier("DriverProxyRegister"))
              .build();
        }
      }
    }
    return getDriverProxyRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcDeviceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcDeviceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcDeviceServiceStub>() {
        @java.lang.Override
        public RpcDeviceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcDeviceServiceStub(channel, callOptions);
        }
      };
    return RpcDeviceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcDeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcDeviceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcDeviceServiceBlockingStub>() {
        @java.lang.Override
        public RpcDeviceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcDeviceServiceBlockingStub(channel, callOptions);
        }
      };
    return RpcDeviceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcDeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcDeviceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcDeviceServiceFutureStub>() {
        @java.lang.Override
        public RpcDeviceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcDeviceServiceFutureStub(channel, callOptions);
        }
      };
    return RpcDeviceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcDeviceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deviceServiceById(tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeviceServiceByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAppRegisterName(tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppRegisterNameMethod(), responseObserver);
    }

    /**
     * <pre>
     *驱动注册代理路由信息
     * </pre>
     */
    public void driverProxyRegister(tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDriverProxyRegisterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeviceServiceByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest,
                tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService>(
                  this, METHODID_DEVICE_SERVICE_BY_ID)))
          .addMethod(
            getGetAppRegisterNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq,
                tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService>(
                  this, METHODID_GET_APP_REGISTER_NAME)))
          .addMethod(
            getDriverProxyRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DRIVER_PROXY_REGISTER)))
          .build();
    }
  }

  /**
   */
  public static final class RpcDeviceServiceStub extends io.grpc.stub.AbstractAsyncStub<RpcDeviceServiceStub> {
    private RpcDeviceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcDeviceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcDeviceServiceStub(channel, callOptions);
    }

    /**
     */
    public void deviceServiceById(tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeviceServiceByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAppRegisterName(tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppRegisterNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *驱动注册代理路由信息
     * </pre>
     */
    public void driverProxyRegister(tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDriverProxyRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcDeviceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcDeviceServiceBlockingStub> {
    private RpcDeviceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcDeviceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcDeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService deviceServiceById(tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeviceServiceByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService getAppRegisterName(tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppRegisterNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *驱动注册代理路由信息
     * </pre>
     */
    public com.google.protobuf.Empty driverProxyRegister(tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDriverProxyRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcDeviceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RpcDeviceServiceFutureStub> {
    private RpcDeviceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcDeviceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcDeviceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> deviceServiceById(
        tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeviceServiceByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService> getAppRegisterName(
        tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppRegisterNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *驱动注册代理路由信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> driverProxyRegister(
        tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDriverProxyRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEVICE_SERVICE_BY_ID = 0;
  private static final int METHODID_GET_APP_REGISTER_NAME = 1;
  private static final int METHODID_DRIVER_PROXY_REGISTER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcDeviceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcDeviceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEVICE_SERVICE_BY_ID:
          serviceImpl.deviceServiceById((tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceByIdRequest) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService>) responseObserver);
          break;
        case METHODID_GET_APP_REGISTER_NAME:
          serviceImpl.getAppRegisterName((tuya.tedge.driver.sdk.grpc.deviceservice.AppByRegisterNameReq) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.deviceservice.DeviceService>) responseObserver);
          break;
        case METHODID_DRIVER_PROXY_REGISTER:
          serviceImpl.driverProxyRegister((tuya.tedge.driver.sdk.grpc.deviceservice.DriverProxyRequest) request,
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

  private static abstract class RpcDeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcDeviceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.deviceservice.DeviceServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcDeviceService");
    }
  }

  private static final class RpcDeviceServiceFileDescriptorSupplier
      extends RpcDeviceServiceBaseDescriptorSupplier {
    RpcDeviceServiceFileDescriptorSupplier() {}
  }

  private static final class RpcDeviceServiceMethodDescriptorSupplier
      extends RpcDeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcDeviceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcDeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcDeviceServiceFileDescriptorSupplier())
              .addMethod(getDeviceServiceByIdMethod())
              .addMethod(getGetAppRegisterNameMethod())
              .addMethod(getDriverProxyRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
