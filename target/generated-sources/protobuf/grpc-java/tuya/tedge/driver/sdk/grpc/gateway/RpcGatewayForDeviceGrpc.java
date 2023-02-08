package tuya.tedge.driver.sdk.grpc.gateway;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: gateway.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcGatewayForDeviceGrpc {

  private RpcGatewayForDeviceGrpc() {}

  public static final String SERVICE_NAME = "RpcGatewayForDevice";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse> getGetGatewayInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGatewayInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse> getGetGatewayInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse> getGetGatewayInfoMethod;
    if ((getGetGatewayInfoMethod = RpcGatewayForDeviceGrpc.getGetGatewayInfoMethod) == null) {
      synchronized (RpcGatewayForDeviceGrpc.class) {
        if ((getGetGatewayInfoMethod = RpcGatewayForDeviceGrpc.getGetGatewayInfoMethod) == null) {
          RpcGatewayForDeviceGrpc.getGetGatewayInfoMethod = getGetGatewayInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGatewayInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RpcGatewayForDeviceMethodDescriptorSupplier("GetGatewayInfo"))
              .build();
        }
      }
    }
    return getGetGatewayInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcGatewayForDeviceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcGatewayForDeviceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcGatewayForDeviceStub>() {
        @java.lang.Override
        public RpcGatewayForDeviceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcGatewayForDeviceStub(channel, callOptions);
        }
      };
    return RpcGatewayForDeviceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcGatewayForDeviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcGatewayForDeviceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcGatewayForDeviceBlockingStub>() {
        @java.lang.Override
        public RpcGatewayForDeviceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcGatewayForDeviceBlockingStub(channel, callOptions);
        }
      };
    return RpcGatewayForDeviceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcGatewayForDeviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcGatewayForDeviceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcGatewayForDeviceFutureStub>() {
        @java.lang.Override
        public RpcGatewayForDeviceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcGatewayForDeviceFutureStub(channel, callOptions);
        }
      };
    return RpcGatewayForDeviceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcGatewayForDeviceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取网关信息
     * </pre>
     */
    public void getGatewayInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGatewayInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGatewayInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse>(
                  this, METHODID_GET_GATEWAY_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class RpcGatewayForDeviceStub extends io.grpc.stub.AbstractAsyncStub<RpcGatewayForDeviceStub> {
    private RpcGatewayForDeviceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcGatewayForDeviceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcGatewayForDeviceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取网关信息
     * </pre>
     */
    public void getGatewayInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGatewayInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcGatewayForDeviceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcGatewayForDeviceBlockingStub> {
    private RpcGatewayForDeviceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcGatewayForDeviceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcGatewayForDeviceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取网关信息
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse getGatewayInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGatewayInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcGatewayForDeviceFutureStub extends io.grpc.stub.AbstractFutureStub<RpcGatewayForDeviceFutureStub> {
    private RpcGatewayForDeviceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcGatewayForDeviceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcGatewayForDeviceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取网关信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse> getGatewayInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGatewayInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GATEWAY_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcGatewayForDeviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcGatewayForDeviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GATEWAY_INFO:
          serviceImpl.getGatewayInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse>) responseObserver);
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

  private static abstract class RpcGatewayForDeviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcGatewayForDeviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.gateway.GatewayProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcGatewayForDevice");
    }
  }

  private static final class RpcGatewayForDeviceFileDescriptorSupplier
      extends RpcGatewayForDeviceBaseDescriptorSupplier {
    RpcGatewayForDeviceFileDescriptorSupplier() {}
  }

  private static final class RpcGatewayForDeviceMethodDescriptorSupplier
      extends RpcGatewayForDeviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcGatewayForDeviceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcGatewayForDeviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcGatewayForDeviceFileDescriptorSupplier())
              .addMethod(getGetGatewayInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
