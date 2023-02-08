package tuya.tedge.driver.sdk.grpc.thingmodel;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 物模型消息上报 driver-&gt;tedge-&gt;tuya cloud
 * sdk异步等待结果
 * resource实现
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: thingmodel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ThingModelUpServiceGrpc {

  private ThingModelUpServiceGrpc() {}

  public static final String SERVICE_NAME = "thingmodel.ThingModelUpService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg,
      com.google.protobuf.Empty> getThingModelMsgReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ThingModelMsgReport",
      requestType = tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg,
      com.google.protobuf.Empty> getThingModelMsgReportMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg, com.google.protobuf.Empty> getThingModelMsgReportMethod;
    if ((getThingModelMsgReportMethod = ThingModelUpServiceGrpc.getThingModelMsgReportMethod) == null) {
      synchronized (ThingModelUpServiceGrpc.class) {
        if ((getThingModelMsgReportMethod = ThingModelUpServiceGrpc.getThingModelMsgReportMethod) == null) {
          ThingModelUpServiceGrpc.getThingModelMsgReportMethod = getThingModelMsgReportMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ThingModelMsgReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ThingModelUpServiceMethodDescriptorSupplier("ThingModelMsgReport"))
              .build();
        }
      }
    }
    return getThingModelMsgReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam,
      tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse> getHttpRequestProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HttpRequestProxy",
      requestType = tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam.class,
      responseType = tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam,
      tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse> getHttpRequestProxyMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam, tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse> getHttpRequestProxyMethod;
    if ((getHttpRequestProxyMethod = ThingModelUpServiceGrpc.getHttpRequestProxyMethod) == null) {
      synchronized (ThingModelUpServiceGrpc.class) {
        if ((getHttpRequestProxyMethod = ThingModelUpServiceGrpc.getHttpRequestProxyMethod) == null) {
          ThingModelUpServiceGrpc.getHttpRequestProxyMethod = getHttpRequestProxyMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam, tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HttpRequestProxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ThingModelUpServiceMethodDescriptorSupplier("HttpRequestProxy"))
              .build();
        }
      }
    }
    return getHttpRequestProxyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ThingModelUpServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThingModelUpServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThingModelUpServiceStub>() {
        @java.lang.Override
        public ThingModelUpServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThingModelUpServiceStub(channel, callOptions);
        }
      };
    return ThingModelUpServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ThingModelUpServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThingModelUpServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThingModelUpServiceBlockingStub>() {
        @java.lang.Override
        public ThingModelUpServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThingModelUpServiceBlockingStub(channel, callOptions);
        }
      };
    return ThingModelUpServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ThingModelUpServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThingModelUpServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThingModelUpServiceFutureStub>() {
        @java.lang.Override
        public ThingModelUpServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThingModelUpServiceFutureStub(channel, callOptions);
        }
      };
    return ThingModelUpServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 物模型消息上报 driver-&gt;tedge-&gt;tuya cloud
   * sdk异步等待结果
   * resource实现
   * </pre>
   */
  public static abstract class ThingModelUpServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void thingModelMsgReport(tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getThingModelMsgReportMethod(), responseObserver);
    }

    /**
     * <pre>
     *d.json
     * </pre>
     */
    public void httpRequestProxy(tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHttpRequestProxyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getThingModelMsgReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg,
                com.google.protobuf.Empty>(
                  this, METHODID_THING_MODEL_MSG_REPORT)))
          .addMethod(
            getHttpRequestProxyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam,
                tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse>(
                  this, METHODID_HTTP_REQUEST_PROXY)))
          .build();
    }
  }

  /**
   * <pre>
   * 物模型消息上报 driver-&gt;tedge-&gt;tuya cloud
   * sdk异步等待结果
   * resource实现
   * </pre>
   */
  public static final class ThingModelUpServiceStub extends io.grpc.stub.AbstractAsyncStub<ThingModelUpServiceStub> {
    private ThingModelUpServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThingModelUpServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThingModelUpServiceStub(channel, callOptions);
    }

    /**
     */
    public void thingModelMsgReport(tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getThingModelMsgReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *d.json
     * </pre>
     */
    public void httpRequestProxy(tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHttpRequestProxyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 物模型消息上报 driver-&gt;tedge-&gt;tuya cloud
   * sdk异步等待结果
   * resource实现
   * </pre>
   */
  public static final class ThingModelUpServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ThingModelUpServiceBlockingStub> {
    private ThingModelUpServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThingModelUpServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThingModelUpServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty thingModelMsgReport(tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getThingModelMsgReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *d.json
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse httpRequestProxy(tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHttpRequestProxyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 物模型消息上报 driver-&gt;tedge-&gt;tuya cloud
   * sdk异步等待结果
   * resource实现
   * </pre>
   */
  public static final class ThingModelUpServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ThingModelUpServiceFutureStub> {
    private ThingModelUpServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThingModelUpServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThingModelUpServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> thingModelMsgReport(
        tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getThingModelMsgReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *d.json
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse> httpRequestProxy(
        tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHttpRequestProxyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_THING_MODEL_MSG_REPORT = 0;
  private static final int METHODID_HTTP_REQUEST_PROXY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ThingModelUpServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ThingModelUpServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_THING_MODEL_MSG_REPORT:
          serviceImpl.thingModelMsgReport((tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelMsg) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_HTTP_REQUEST_PROXY:
          serviceImpl.httpRequestProxy((tuya.tedge.driver.sdk.grpc.thingmodel.HttpRequestParam) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.thingmodel.HttpResponse>) responseObserver);
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

  private static abstract class ThingModelUpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ThingModelUpServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.thingmodel.ThingModelProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ThingModelUpService");
    }
  }

  private static final class ThingModelUpServiceFileDescriptorSupplier
      extends ThingModelUpServiceBaseDescriptorSupplier {
    ThingModelUpServiceFileDescriptorSupplier() {}
  }

  private static final class ThingModelUpServiceMethodDescriptorSupplier
      extends ThingModelUpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ThingModelUpServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ThingModelUpServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ThingModelUpServiceFileDescriptorSupplier())
              .addMethod(getThingModelMsgReportMethod())
              .addMethod(getHttpRequestProxyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
