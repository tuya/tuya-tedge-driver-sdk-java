package tuya.tedge.driver.sdk.grpc.thingmodel;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 物模型消息下发 tuya cloud-&gt;tedge-&gt;driver
 * sdk实现
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: thingmodel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ThingModelDownServiceGrpc {

  private ThingModelDownServiceGrpc() {}

  public static final String SERVICE_NAME = "thingmodel.ThingModelDownService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg,
      com.google.protobuf.Empty> getThingModelMsgIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ThingModelMsgIssue",
      requestType = tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg,
      com.google.protobuf.Empty> getThingModelMsgIssueMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg, com.google.protobuf.Empty> getThingModelMsgIssueMethod;
    if ((getThingModelMsgIssueMethod = ThingModelDownServiceGrpc.getThingModelMsgIssueMethod) == null) {
      synchronized (ThingModelDownServiceGrpc.class) {
        if ((getThingModelMsgIssueMethod = ThingModelDownServiceGrpc.getThingModelMsgIssueMethod) == null) {
          ThingModelDownServiceGrpc.getThingModelMsgIssueMethod = getThingModelMsgIssueMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ThingModelMsgIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ThingModelDownServiceMethodDescriptorSupplier("ThingModelMsgIssue"))
              .build();
        }
      }
    }
    return getThingModelMsgIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct,
      com.google.protobuf.Empty> getTMUpdateProductCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TMUpdateProductCallback",
      requestType = tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct,
      com.google.protobuf.Empty> getTMUpdateProductCallbackMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct, com.google.protobuf.Empty> getTMUpdateProductCallbackMethod;
    if ((getTMUpdateProductCallbackMethod = ThingModelDownServiceGrpc.getTMUpdateProductCallbackMethod) == null) {
      synchronized (ThingModelDownServiceGrpc.class) {
        if ((getTMUpdateProductCallbackMethod = ThingModelDownServiceGrpc.getTMUpdateProductCallbackMethod) == null) {
          ThingModelDownServiceGrpc.getTMUpdateProductCallbackMethod = getTMUpdateProductCallbackMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TMUpdateProductCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ThingModelDownServiceMethodDescriptorSupplier("TMUpdateProductCallback"))
              .build();
        }
      }
    }
    return getTMUpdateProductCallbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ThingModelDownServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThingModelDownServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThingModelDownServiceStub>() {
        @java.lang.Override
        public ThingModelDownServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThingModelDownServiceStub(channel, callOptions);
        }
      };
    return ThingModelDownServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ThingModelDownServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThingModelDownServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThingModelDownServiceBlockingStub>() {
        @java.lang.Override
        public ThingModelDownServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThingModelDownServiceBlockingStub(channel, callOptions);
        }
      };
    return ThingModelDownServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ThingModelDownServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThingModelDownServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThingModelDownServiceFutureStub>() {
        @java.lang.Override
        public ThingModelDownServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThingModelDownServiceFutureStub(channel, callOptions);
        }
      };
    return ThingModelDownServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 物模型消息下发 tuya cloud-&gt;tedge-&gt;driver
   * sdk实现
   * </pre>
   */
  public static abstract class ThingModelDownServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void thingModelMsgIssue(tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getThingModelMsgIssueMethod(), responseObserver);
    }

    /**
     */
    public void tMUpdateProductCallback(tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTMUpdateProductCallbackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getThingModelMsgIssueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg,
                com.google.protobuf.Empty>(
                  this, METHODID_THING_MODEL_MSG_ISSUE)))
          .addMethod(
            getTMUpdateProductCallbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct,
                com.google.protobuf.Empty>(
                  this, METHODID_TMUPDATE_PRODUCT_CALLBACK)))
          .build();
    }
  }

  /**
   * <pre>
   * 物模型消息下发 tuya cloud-&gt;tedge-&gt;driver
   * sdk实现
   * </pre>
   */
  public static final class ThingModelDownServiceStub extends io.grpc.stub.AbstractAsyncStub<ThingModelDownServiceStub> {
    private ThingModelDownServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThingModelDownServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThingModelDownServiceStub(channel, callOptions);
    }

    /**
     */
    public void thingModelMsgIssue(tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getThingModelMsgIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tMUpdateProductCallback(tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTMUpdateProductCallbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 物模型消息下发 tuya cloud-&gt;tedge-&gt;driver
   * sdk实现
   * </pre>
   */
  public static final class ThingModelDownServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ThingModelDownServiceBlockingStub> {
    private ThingModelDownServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThingModelDownServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThingModelDownServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty thingModelMsgIssue(tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getThingModelMsgIssueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty tMUpdateProductCallback(tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTMUpdateProductCallbackMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 物模型消息下发 tuya cloud-&gt;tedge-&gt;driver
   * sdk实现
   * </pre>
   */
  public static final class ThingModelDownServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ThingModelDownServiceFutureStub> {
    private ThingModelDownServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThingModelDownServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThingModelDownServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> thingModelMsgIssue(
        tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getThingModelMsgIssueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> tMUpdateProductCallback(
        tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTMUpdateProductCallbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_THING_MODEL_MSG_ISSUE = 0;
  private static final int METHODID_TMUPDATE_PRODUCT_CALLBACK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ThingModelDownServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ThingModelDownServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_THING_MODEL_MSG_ISSUE:
          serviceImpl.thingModelMsgIssue((tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TMUPDATE_PRODUCT_CALLBACK:
          serviceImpl.tMUpdateProductCallback((tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProduct) request,
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

  private static abstract class ThingModelDownServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ThingModelDownServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ThingModelDownService");
    }
  }

  private static final class ThingModelDownServiceFileDescriptorSupplier
      extends ThingModelDownServiceBaseDescriptorSupplier {
    ThingModelDownServiceFileDescriptorSupplier() {}
  }

  private static final class ThingModelDownServiceMethodDescriptorSupplier
      extends ThingModelDownServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ThingModelDownServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ThingModelDownServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ThingModelDownServiceFileDescriptorSupplier())
              .addMethod(getThingModelMsgIssueMethod())
              .addMethod(getTMUpdateProductCallbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
