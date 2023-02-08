package tuya.tedge.driver.sdk.grpc.common;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: common.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommonGrpc {

  private CommonGrpc() {}

  public static final String SERVICE_NAME = "common.Common";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      tuya.tedge.driver.sdk.grpc.common.Pong> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.google.protobuf.Empty.class,
      responseType = tuya.tedge.driver.sdk.grpc.common.Pong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      tuya.tedge.driver.sdk.grpc.common.Pong> getPingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, tuya.tedge.driver.sdk.grpc.common.Pong> getPingMethod;
    if ((getPingMethod = CommonGrpc.getPingMethod) == null) {
      synchronized (CommonGrpc.class) {
        if ((getPingMethod = CommonGrpc.getPingMethod) == null) {
          CommonGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, tuya.tedge.driver.sdk.grpc.common.Pong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.common.Pong.getDefaultInstance()))
              .setSchemaDescriptor(new CommonMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      tuya.tedge.driver.sdk.grpc.common.VersionResponse> getVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Version",
      requestType = com.google.protobuf.Empty.class,
      responseType = tuya.tedge.driver.sdk.grpc.common.VersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      tuya.tedge.driver.sdk.grpc.common.VersionResponse> getVersionMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, tuya.tedge.driver.sdk.grpc.common.VersionResponse> getVersionMethod;
    if ((getVersionMethod = CommonGrpc.getVersionMethod) == null) {
      synchronized (CommonGrpc.class) {
        if ((getVersionMethod = CommonGrpc.getVersionMethod) == null) {
          CommonGrpc.getVersionMethod = getVersionMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, tuya.tedge.driver.sdk.grpc.common.VersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Version"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.common.VersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommonMethodDescriptorSupplier("Version"))
              .build();
        }
      }
    }
    return getVersionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommonStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommonStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommonStub>() {
        @java.lang.Override
        public CommonStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommonStub(channel, callOptions);
        }
      };
    return CommonStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommonBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommonBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommonBlockingStub>() {
        @java.lang.Override
        public CommonBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommonBlockingStub(channel, callOptions);
        }
      };
    return CommonBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommonFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommonFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommonFutureStub>() {
        @java.lang.Override
        public CommonFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommonFutureStub(channel, callOptions);
        }
      };
    return CommonFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CommonImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping tests whether the service is working
     * </pre>
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.common.Pong> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Version obtains version information from the target service.
     * </pre>
     */
    public void version(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.common.VersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVersionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                tuya.tedge.driver.sdk.grpc.common.Pong>(
                  this, METHODID_PING)))
          .addMethod(
            getVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                tuya.tedge.driver.sdk.grpc.common.VersionResponse>(
                  this, METHODID_VERSION)))
          .build();
    }
  }

  /**
   */
  public static final class CommonStub extends io.grpc.stub.AbstractAsyncStub<CommonStub> {
    private CommonStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommonStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping tests whether the service is working
     * </pre>
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.common.Pong> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Version obtains version information from the target service.
     * </pre>
     */
    public void version(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.common.VersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVersionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommonBlockingStub extends io.grpc.stub.AbstractBlockingStub<CommonBlockingStub> {
    private CommonBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommonBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping tests whether the service is working
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.common.Pong ping(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Version obtains version information from the target service.
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.common.VersionResponse version(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommonFutureStub extends io.grpc.stub.AbstractFutureStub<CommonFutureStub> {
    private CommonFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommonFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommonFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping tests whether the service is working
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.common.Pong> ping(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Version obtains version information from the target service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.common.VersionResponse> version(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_VERSION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommonImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommonImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.common.Pong>) responseObserver);
          break;
        case METHODID_VERSION:
          serviceImpl.version((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.common.VersionResponse>) responseObserver);
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

  private static abstract class CommonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommonBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.common.CommonProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Common");
    }
  }

  private static final class CommonFileDescriptorSupplier
      extends CommonBaseDescriptorSupplier {
    CommonFileDescriptorSupplier() {}
  }

  private static final class CommonMethodDescriptorSupplier
      extends CommonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommonMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommonGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommonFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getVersionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
