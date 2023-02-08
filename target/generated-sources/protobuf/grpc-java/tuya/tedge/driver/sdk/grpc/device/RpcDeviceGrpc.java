package tuya.tedge.driver.sdk.grpc.device;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SDK 使用
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: device.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcDeviceGrpc {

  private RpcDeviceGrpc() {}

  public static final String SERVICE_NAME = "device.RpcDevice";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest,
      com.google.protobuf.Empty> getAddDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDevice",
      requestType = tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest,
      com.google.protobuf.Empty> getAddDeviceMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest, com.google.protobuf.Empty> getAddDeviceMethod;
    if ((getAddDeviceMethod = RpcDeviceGrpc.getAddDeviceMethod) == null) {
      synchronized (RpcDeviceGrpc.class) {
        if ((getAddDeviceMethod = RpcDeviceGrpc.getAddDeviceMethod) == null) {
          RpcDeviceGrpc.getAddDeviceMethod = getAddDeviceMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceMethodDescriptorSupplier("AddDevice"))
              .build();
        }
      }
    }
    return getAddDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceActive,
      tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse> getActivateDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateDevice",
      requestType = tuya.tedge.driver.sdk.grpc.device.DeviceActive.class,
      responseType = tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceActive,
      tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse> getActivateDeviceMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceActive, tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse> getActivateDeviceMethod;
    if ((getActivateDeviceMethod = RpcDeviceGrpc.getActivateDeviceMethod) == null) {
      synchronized (RpcDeviceGrpc.class) {
        if ((getActivateDeviceMethod = RpcDeviceGrpc.getActivateDeviceMethod) == null) {
          RpcDeviceGrpc.getActivateDeviceMethod = getActivateDeviceMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.DeviceActive, tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.DeviceActive.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceMethodDescriptorSupplier("ActivateDevice"))
              .build();
        }
      }
    }
    return getActivateDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest,
      com.google.protobuf.Empty> getUpdateDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDevice",
      requestType = tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest,
      com.google.protobuf.Empty> getUpdateDeviceMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest, com.google.protobuf.Empty> getUpdateDeviceMethod;
    if ((getUpdateDeviceMethod = RpcDeviceGrpc.getUpdateDeviceMethod) == null) {
      synchronized (RpcDeviceGrpc.class) {
        if ((getUpdateDeviceMethod = RpcDeviceGrpc.getUpdateDeviceMethod) == null) {
          RpcDeviceGrpc.getUpdateDeviceMethod = getUpdateDeviceMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceMethodDescriptorSupplier("UpdateDevice"))
              .build();
        }
      }
    }
    return getUpdateDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest,
      tuya.tedge.driver.sdk.grpc.device.DeviceInfo> getDeviceByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeviceById",
      requestType = tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest.class,
      responseType = tuya.tedge.driver.sdk.grpc.device.DeviceInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest,
      tuya.tedge.driver.sdk.grpc.device.DeviceInfo> getDeviceByIdMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest, tuya.tedge.driver.sdk.grpc.device.DeviceInfo> getDeviceByIdMethod;
    if ((getDeviceByIdMethod = RpcDeviceGrpc.getDeviceByIdMethod) == null) {
      synchronized (RpcDeviceGrpc.class) {
        if ((getDeviceByIdMethod = RpcDeviceGrpc.getDeviceByIdMethod) == null) {
          RpcDeviceGrpc.getDeviceByIdMethod = getDeviceByIdMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest, tuya.tedge.driver.sdk.grpc.device.DeviceInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeviceById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.DeviceInfo.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceMethodDescriptorSupplier("DeviceById"))
              .build();
        }
      }
    }
    return getDeviceByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest,
      com.google.protobuf.Empty> getDeleteDeviceByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDeviceById",
      requestType = tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest,
      com.google.protobuf.Empty> getDeleteDeviceByIdMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest, com.google.protobuf.Empty> getDeleteDeviceByIdMethod;
    if ((getDeleteDeviceByIdMethod = RpcDeviceGrpc.getDeleteDeviceByIdMethod) == null) {
      synchronized (RpcDeviceGrpc.class) {
        if ((getDeleteDeviceByIdMethod = RpcDeviceGrpc.getDeleteDeviceByIdMethod) == null) {
          RpcDeviceGrpc.getDeleteDeviceByIdMethod = getDeleteDeviceByIdMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDeviceById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceMethodDescriptorSupplier("DeleteDeviceById"))
              .build();
        }
      }
    }
    return getDeleteDeviceByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest,
      tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse> getDevicesSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DevicesSearch",
      requestType = tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest.class,
      responseType = tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest,
      tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse> getDevicesSearchMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest, tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse> getDevicesSearchMethod;
    if ((getDevicesSearchMethod = RpcDeviceGrpc.getDevicesSearchMethod) == null) {
      synchronized (RpcDeviceGrpc.class) {
        if ((getDevicesSearchMethod = RpcDeviceGrpc.getDevicesSearchMethod) == null) {
          RpcDeviceGrpc.getDevicesSearchMethod = getDevicesSearchMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest, tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DevicesSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceMethodDescriptorSupplier("DevicesSearch"))
              .build();
        }
      }
    }
    return getDevicesSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList,
      com.google.protobuf.Empty> getReportDevicesOnlineAndOfflineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportDevicesOnlineAndOffline",
      requestType = tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList,
      com.google.protobuf.Empty> getReportDevicesOnlineAndOfflineMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList, com.google.protobuf.Empty> getReportDevicesOnlineAndOfflineMethod;
    if ((getReportDevicesOnlineAndOfflineMethod = RpcDeviceGrpc.getReportDevicesOnlineAndOfflineMethod) == null) {
      synchronized (RpcDeviceGrpc.class) {
        if ((getReportDevicesOnlineAndOfflineMethod = RpcDeviceGrpc.getReportDevicesOnlineAndOfflineMethod) == null) {
          RpcDeviceGrpc.getReportDevicesOnlineAndOfflineMethod = getReportDevicesOnlineAndOfflineMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportDevicesOnlineAndOffline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RpcDeviceMethodDescriptorSupplier("ReportDevicesOnlineAndOffline"))
              .build();
        }
      }
    }
    return getReportDevicesOnlineAndOfflineMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcDeviceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcDeviceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcDeviceStub>() {
        @java.lang.Override
        public RpcDeviceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcDeviceStub(channel, callOptions);
        }
      };
    return RpcDeviceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcDeviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcDeviceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcDeviceBlockingStub>() {
        @java.lang.Override
        public RpcDeviceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcDeviceBlockingStub(channel, callOptions);
        }
      };
    return RpcDeviceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcDeviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcDeviceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcDeviceFutureStub>() {
        @java.lang.Override
        public RpcDeviceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcDeviceFutureStub(channel, callOptions);
        }
      };
    return RpcDeviceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SDK 使用
   * </pre>
   */
  public static abstract class RpcDeviceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 添加新的设备
     * </pre>
     */
    public void addDevice(tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 激活子设备
     * </pre>
     */
    public void activateDevice(tuya.tedge.driver.sdk.grpc.device.DeviceActive request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新设备属性
     * </pre>
     */
    public void updateDevice(tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据设备ID查询设备信息
     * </pre>
     */
    public void deviceById(tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.device.DeviceInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeviceByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据设备ID删除设备
     * </pre>
     */
    public void deleteDeviceById(tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDeviceByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * 条件查询设备
     * </pre>
     */
    public void devicesSearch(tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDevicesSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 上报设备上下线状态
     * </pre>
     */
    public void reportDevicesOnlineAndOffline(tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportDevicesOnlineAndOfflineMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_DEVICE)))
          .addMethod(
            getActivateDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.DeviceActive,
                tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse>(
                  this, METHODID_ACTIVATE_DEVICE)))
          .addMethod(
            getUpdateDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_DEVICE)))
          .addMethod(
            getDeviceByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest,
                tuya.tedge.driver.sdk.grpc.device.DeviceInfo>(
                  this, METHODID_DEVICE_BY_ID)))
          .addMethod(
            getDeleteDeviceByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DEVICE_BY_ID)))
          .addMethod(
            getDevicesSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest,
                tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse>(
                  this, METHODID_DEVICES_SEARCH)))
          .addMethod(
            getReportDevicesOnlineAndOfflineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList,
                com.google.protobuf.Empty>(
                  this, METHODID_REPORT_DEVICES_ONLINE_AND_OFFLINE)))
          .build();
    }
  }

  /**
   * <pre>
   * SDK 使用
   * </pre>
   */
  public static final class RpcDeviceStub extends io.grpc.stub.AbstractAsyncStub<RpcDeviceStub> {
    private RpcDeviceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcDeviceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcDeviceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加新的设备
     * </pre>
     */
    public void addDevice(tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 激活子设备
     * </pre>
     */
    public void activateDevice(tuya.tedge.driver.sdk.grpc.device.DeviceActive request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新设备属性
     * </pre>
     */
    public void updateDevice(tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据设备ID查询设备信息
     * </pre>
     */
    public void deviceById(tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.device.DeviceInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeviceByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据设备ID删除设备
     * </pre>
     */
    public void deleteDeviceById(tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDeviceByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 条件查询设备
     * </pre>
     */
    public void devicesSearch(tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDevicesSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 上报设备上下线状态
     * </pre>
     */
    public void reportDevicesOnlineAndOffline(tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportDevicesOnlineAndOfflineMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SDK 使用
   * </pre>
   */
  public static final class RpcDeviceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcDeviceBlockingStub> {
    private RpcDeviceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcDeviceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcDeviceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加新的设备
     * </pre>
     */
    public com.google.protobuf.Empty addDevice(tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 激活子设备
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse activateDevice(tuya.tedge.driver.sdk.grpc.device.DeviceActive request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新设备属性
     * </pre>
     */
    public com.google.protobuf.Empty updateDevice(tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据设备ID查询设备信息
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.device.DeviceInfo deviceById(tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeviceByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据设备ID删除设备
     * </pre>
     */
    public com.google.protobuf.Empty deleteDeviceById(tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDeviceByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 条件查询设备
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse devicesSearch(tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDevicesSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 上报设备上下线状态
     * </pre>
     */
    public com.google.protobuf.Empty reportDevicesOnlineAndOffline(tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportDevicesOnlineAndOfflineMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SDK 使用
   * </pre>
   */
  public static final class RpcDeviceFutureStub extends io.grpc.stub.AbstractFutureStub<RpcDeviceFutureStub> {
    private RpcDeviceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcDeviceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcDeviceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加新的设备
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addDevice(
        tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 激活子设备
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse> activateDevice(
        tuya.tedge.driver.sdk.grpc.device.DeviceActive request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新设备属性
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDevice(
        tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据设备ID查询设备信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.device.DeviceInfo> deviceById(
        tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeviceByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据设备ID删除设备
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDeviceById(
        tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDeviceByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 条件查询设备
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse> devicesSearch(
        tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDevicesSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 上报设备上下线状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> reportDevicesOnlineAndOffline(
        tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportDevicesOnlineAndOfflineMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_DEVICE = 0;
  private static final int METHODID_ACTIVATE_DEVICE = 1;
  private static final int METHODID_UPDATE_DEVICE = 2;
  private static final int METHODID_DEVICE_BY_ID = 3;
  private static final int METHODID_DELETE_DEVICE_BY_ID = 4;
  private static final int METHODID_DEVICES_SEARCH = 5;
  private static final int METHODID_REPORT_DEVICES_ONLINE_AND_OFFLINE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcDeviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcDeviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_DEVICE:
          serviceImpl.addDevice((tuya.tedge.driver.sdk.grpc.device.AddDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ACTIVATE_DEVICE:
          serviceImpl.activateDevice((tuya.tedge.driver.sdk.grpc.device.DeviceActive) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.device.ActiveDeviceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEVICE:
          serviceImpl.updateDevice((tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DEVICE_BY_ID:
          serviceImpl.deviceById((tuya.tedge.driver.sdk.grpc.device.DeviceByIdRequest) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.device.DeviceInfo>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE_BY_ID:
          serviceImpl.deleteDeviceById((tuya.tedge.driver.sdk.grpc.device.DeleteDeviceByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DEVICES_SEARCH:
          serviceImpl.devicesSearch((tuya.tedge.driver.sdk.grpc.device.DeviceSearchQueryRequest) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.device.MultiDeviceResponse>) responseObserver);
          break;
        case METHODID_REPORT_DEVICES_ONLINE_AND_OFFLINE:
          serviceImpl.reportDevicesOnlineAndOffline((tuya.tedge.driver.sdk.grpc.device.DeviceOnlineAndOfflineList) request,
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

  private static abstract class RpcDeviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcDeviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.device.DeviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcDevice");
    }
  }

  private static final class RpcDeviceFileDescriptorSupplier
      extends RpcDeviceBaseDescriptorSupplier {
    RpcDeviceFileDescriptorSupplier() {}
  }

  private static final class RpcDeviceMethodDescriptorSupplier
      extends RpcDeviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcDeviceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcDeviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcDeviceFileDescriptorSupplier())
              .addMethod(getAddDeviceMethod())
              .addMethod(getActivateDeviceMethod())
              .addMethod(getUpdateDeviceMethod())
              .addMethod(getDeviceByIdMethod())
              .addMethod(getDeleteDeviceByIdMethod())
              .addMethod(getDevicesSearchMethod())
              .addMethod(getReportDevicesOnlineAndOfflineMethod())
              .build();
        }
      }
    }
    return result;
  }
}
