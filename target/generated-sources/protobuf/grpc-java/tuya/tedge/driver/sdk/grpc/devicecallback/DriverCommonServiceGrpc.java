package tuya.tedge.driver.sdk.grpc.devicecallback;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: drivercallback.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DriverCommonServiceGrpc {

  private DriverCommonServiceGrpc() {}

  public static final String SERVICE_NAME = "drivercallback.DriverCommonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo,
      com.google.protobuf.Empty> getAddDeviceCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDeviceCallback",
      requestType = tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo,
      com.google.protobuf.Empty> getAddDeviceCallbackMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo, com.google.protobuf.Empty> getAddDeviceCallbackMethod;
    if ((getAddDeviceCallbackMethod = DriverCommonServiceGrpc.getAddDeviceCallbackMethod) == null) {
      synchronized (DriverCommonServiceGrpc.class) {
        if ((getAddDeviceCallbackMethod = DriverCommonServiceGrpc.getAddDeviceCallbackMethod) == null) {
          DriverCommonServiceGrpc.getAddDeviceCallbackMethod = getAddDeviceCallbackMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDeviceCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverCommonServiceMethodDescriptorSupplier("AddDeviceCallback"))
              .build();
        }
      }
    }
    return getAddDeviceCallbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo,
      com.google.protobuf.Empty> getUpdateDeviceCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDeviceCallback",
      requestType = tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo,
      com.google.protobuf.Empty> getUpdateDeviceCallbackMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo, com.google.protobuf.Empty> getUpdateDeviceCallbackMethod;
    if ((getUpdateDeviceCallbackMethod = DriverCommonServiceGrpc.getUpdateDeviceCallbackMethod) == null) {
      synchronized (DriverCommonServiceGrpc.class) {
        if ((getUpdateDeviceCallbackMethod = DriverCommonServiceGrpc.getUpdateDeviceCallbackMethod) == null) {
          DriverCommonServiceGrpc.getUpdateDeviceCallbackMethod = getUpdateDeviceCallbackMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDeviceCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverCommonServiceMethodDescriptorSupplier("UpdateDeviceCallback"))
              .build();
        }
      }
    }
    return getUpdateDeviceCallbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest,
      com.google.protobuf.Empty> getDeleteDeviceCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDeviceCallback",
      requestType = tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest,
      com.google.protobuf.Empty> getDeleteDeviceCallbackMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest, com.google.protobuf.Empty> getDeleteDeviceCallbackMethod;
    if ((getDeleteDeviceCallbackMethod = DriverCommonServiceGrpc.getDeleteDeviceCallbackMethod) == null) {
      synchronized (DriverCommonServiceGrpc.class) {
        if ((getDeleteDeviceCallbackMethod = DriverCommonServiceGrpc.getDeleteDeviceCallbackMethod) == null) {
          DriverCommonServiceGrpc.getDeleteDeviceCallbackMethod = getDeleteDeviceCallbackMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDeviceCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverCommonServiceMethodDescriptorSupplier("DeleteDeviceCallback"))
              .build();
        }
      }
    }
    return getDeleteDeviceCallbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.common.LogLevelRequest,
      com.google.protobuf.Empty> getChangeLogLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeLogLevel",
      requestType = tuya.tedge.driver.sdk.grpc.common.LogLevelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.common.LogLevelRequest,
      com.google.protobuf.Empty> getChangeLogLevelMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.common.LogLevelRequest, com.google.protobuf.Empty> getChangeLogLevelMethod;
    if ((getChangeLogLevelMethod = DriverCommonServiceGrpc.getChangeLogLevelMethod) == null) {
      synchronized (DriverCommonServiceGrpc.class) {
        if ((getChangeLogLevelMethod = DriverCommonServiceGrpc.getChangeLogLevelMethod) == null) {
          DriverCommonServiceGrpc.getChangeLogLevelMethod = getChangeLogLevelMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.common.LogLevelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeLogLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.common.LogLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverCommonServiceMethodDescriptorSupplier("ChangeLogLevel"))
              .build();
        }
      }
    }
    return getChangeLogLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress,
      com.google.protobuf.Empty> getAppServiceAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppServiceAddress",
      requestType = tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress,
      com.google.protobuf.Empty> getAppServiceAddressMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress, com.google.protobuf.Empty> getAppServiceAddressMethod;
    if ((getAppServiceAddressMethod = DriverCommonServiceGrpc.getAppServiceAddressMethod) == null) {
      synchronized (DriverCommonServiceGrpc.class) {
        if ((getAppServiceAddressMethod = DriverCommonServiceGrpc.getAppServiceAddressMethod) == null) {
          DriverCommonServiceGrpc.getAppServiceAddressMethod = getAppServiceAddressMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppServiceAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverCommonServiceMethodDescriptorSupplier("AppServiceAddress"))
              .build();
        }
      }
    }
    return getAppServiceAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState,
      com.google.protobuf.Empty> getGatewayStateCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GatewayStateCallback",
      requestType = tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState,
      com.google.protobuf.Empty> getGatewayStateCallbackMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState, com.google.protobuf.Empty> getGatewayStateCallbackMethod;
    if ((getGatewayStateCallbackMethod = DriverCommonServiceGrpc.getGatewayStateCallbackMethod) == null) {
      synchronized (DriverCommonServiceGrpc.class) {
        if ((getGatewayStateCallbackMethod = DriverCommonServiceGrpc.getGatewayStateCallbackMethod) == null) {
          DriverCommonServiceGrpc.getGatewayStateCallbackMethod = getGatewayStateCallbackMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GatewayStateCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverCommonServiceMethodDescriptorSupplier("GatewayStateCallback"))
              .build();
        }
      }
    }
    return getGatewayStateCallbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DriverCommonServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverCommonServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverCommonServiceStub>() {
        @java.lang.Override
        public DriverCommonServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverCommonServiceStub(channel, callOptions);
        }
      };
    return DriverCommonServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DriverCommonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverCommonServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverCommonServiceBlockingStub>() {
        @java.lang.Override
        public DriverCommonServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverCommonServiceBlockingStub(channel, callOptions);
        }
      };
    return DriverCommonServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DriverCommonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverCommonServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverCommonServiceFutureStub>() {
        @java.lang.Override
        public DriverCommonServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverCommonServiceFutureStub(channel, callOptions);
        }
      };
    return DriverCommonServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DriverCommonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addDeviceCallback(tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDeviceCallbackMethod(), responseObserver);
    }

    /**
     */
    public void updateDeviceCallback(tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDeviceCallbackMethod(), responseObserver);
    }

    /**
     */
    public void deleteDeviceCallback(tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDeviceCallbackMethod(), responseObserver);
    }

    /**
     */
    public void changeLogLevel(tuya.tedge.driver.sdk.grpc.common.LogLevelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeLogLevelMethod(), responseObserver);
    }

    /**
     */
    public void appServiceAddress(tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppServiceAddressMethod(), responseObserver);
    }

    /**
     */
    public void gatewayStateCallback(tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGatewayStateCallbackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddDeviceCallbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_DEVICE_CALLBACK)))
          .addMethod(
            getUpdateDeviceCallbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_DEVICE_CALLBACK)))
          .addMethod(
            getDeleteDeviceCallbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DEVICE_CALLBACK)))
          .addMethod(
            getChangeLogLevelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.common.LogLevelRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CHANGE_LOG_LEVEL)))
          .addMethod(
            getAppServiceAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress,
                com.google.protobuf.Empty>(
                  this, METHODID_APP_SERVICE_ADDRESS)))
          .addMethod(
            getGatewayStateCallbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState,
                com.google.protobuf.Empty>(
                  this, METHODID_GATEWAY_STATE_CALLBACK)))
          .build();
    }
  }

  /**
   */
  public static final class DriverCommonServiceStub extends io.grpc.stub.AbstractAsyncStub<DriverCommonServiceStub> {
    private DriverCommonServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverCommonServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverCommonServiceStub(channel, callOptions);
    }

    /**
     */
    public void addDeviceCallback(tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDeviceCallbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDeviceCallback(tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDeviceCallbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDeviceCallback(tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDeviceCallbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeLogLevel(tuya.tedge.driver.sdk.grpc.common.LogLevelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeLogLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appServiceAddress(tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppServiceAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void gatewayStateCallback(tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGatewayStateCallbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DriverCommonServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DriverCommonServiceBlockingStub> {
    private DriverCommonServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverCommonServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverCommonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty addDeviceCallback(tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDeviceCallbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateDeviceCallback(tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDeviceCallbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteDeviceCallback(tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDeviceCallbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty changeLogLevel(tuya.tedge.driver.sdk.grpc.common.LogLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeLogLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty appServiceAddress(tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppServiceAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty gatewayStateCallback(tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGatewayStateCallbackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DriverCommonServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DriverCommonServiceFutureStub> {
    private DriverCommonServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverCommonServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverCommonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addDeviceCallback(
        tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDeviceCallbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDeviceCallback(
        tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDeviceCallbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDeviceCallback(
        tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDeviceCallbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> changeLogLevel(
        tuya.tedge.driver.sdk.grpc.common.LogLevelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeLogLevelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> appServiceAddress(
        tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppServiceAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> gatewayStateCallback(
        tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGatewayStateCallbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_DEVICE_CALLBACK = 0;
  private static final int METHODID_UPDATE_DEVICE_CALLBACK = 1;
  private static final int METHODID_DELETE_DEVICE_CALLBACK = 2;
  private static final int METHODID_CHANGE_LOG_LEVEL = 3;
  private static final int METHODID_APP_SERVICE_ADDRESS = 4;
  private static final int METHODID_GATEWAY_STATE_CALLBACK = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DriverCommonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DriverCommonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_DEVICE_CALLBACK:
          serviceImpl.addDeviceCallback((tuya.tedge.driver.sdk.grpc.device.DeviceAddInfo) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_DEVICE_CALLBACK:
          serviceImpl.updateDeviceCallback((tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE_CALLBACK:
          serviceImpl.deleteDeviceCallback((tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHANGE_LOG_LEVEL:
          serviceImpl.changeLogLevel((tuya.tedge.driver.sdk.grpc.common.LogLevelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_APP_SERVICE_ADDRESS:
          serviceImpl.appServiceAddress((tuya.tedge.driver.sdk.grpc.devicecallback.AppBaseAddress) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GATEWAY_STATE_CALLBACK:
          serviceImpl.gatewayStateCallback((tuya.tedge.driver.sdk.grpc.devicecallback.GatewayState) request,
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

  private static abstract class DriverCommonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DriverCommonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.devicecallback.DeviceCallbackProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DriverCommonService");
    }
  }

  private static final class DriverCommonServiceFileDescriptorSupplier
      extends DriverCommonServiceBaseDescriptorSupplier {
    DriverCommonServiceFileDescriptorSupplier() {}
  }

  private static final class DriverCommonServiceMethodDescriptorSupplier
      extends DriverCommonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DriverCommonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DriverCommonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DriverCommonServiceFileDescriptorSupplier())
              .addMethod(getAddDeviceCallbackMethod())
              .addMethod(getUpdateDeviceCallbackMethod())
              .addMethod(getDeleteDeviceCallbackMethod())
              .addMethod(getChangeLogLevelMethod())
              .addMethod(getAppServiceAddressMethod())
              .addMethod(getGatewayStateCallbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
