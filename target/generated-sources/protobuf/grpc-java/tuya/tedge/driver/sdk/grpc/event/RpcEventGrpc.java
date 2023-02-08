package tuya.tedge.driver.sdk.grpc.event;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: event.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcEventGrpc {

  private RpcEventGrpc() {}

  public static final String SERVICE_NAME = "event.RpcEvent";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.event.Events,
      tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = tuya.tedge.driver.sdk.grpc.event.Events.class,
      responseType = tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.event.Events,
      tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse> getAddMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.event.Events, tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse> getAddMethod;
    if ((getAddMethod = RpcEventGrpc.getAddMethod) == null) {
      synchronized (RpcEventGrpc.class) {
        if ((getAddMethod = RpcEventGrpc.getAddMethod) == null) {
          RpcEventGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.event.Events, tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.event.Events.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RpcEventMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.event.WithoutDpReport,
      com.google.protobuf.Empty> getWithoutDpReportDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithoutDpReportData",
      requestType = tuya.tedge.driver.sdk.grpc.event.WithoutDpReport.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.event.WithoutDpReport,
      com.google.protobuf.Empty> getWithoutDpReportDataMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.event.WithoutDpReport, com.google.protobuf.Empty> getWithoutDpReportDataMethod;
    if ((getWithoutDpReportDataMethod = RpcEventGrpc.getWithoutDpReportDataMethod) == null) {
      synchronized (RpcEventGrpc.class) {
        if ((getWithoutDpReportDataMethod = RpcEventGrpc.getWithoutDpReportDataMethod) == null) {
          RpcEventGrpc.getWithoutDpReportDataMethod = getWithoutDpReportDataMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.event.WithoutDpReport, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithoutDpReportData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.event.WithoutDpReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RpcEventMethodDescriptorSupplier("WithoutDpReportData"))
              .build();
        }
      }
    }
    return getWithoutDpReportDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.event.HttpReport,
      tuya.tedge.driver.sdk.grpc.event.Response> getHttpReportDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HttpReportData",
      requestType = tuya.tedge.driver.sdk.grpc.event.HttpReport.class,
      responseType = tuya.tedge.driver.sdk.grpc.event.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.event.HttpReport,
      tuya.tedge.driver.sdk.grpc.event.Response> getHttpReportDataMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.event.HttpReport, tuya.tedge.driver.sdk.grpc.event.Response> getHttpReportDataMethod;
    if ((getHttpReportDataMethod = RpcEventGrpc.getHttpReportDataMethod) == null) {
      synchronized (RpcEventGrpc.class) {
        if ((getHttpReportDataMethod = RpcEventGrpc.getHttpReportDataMethod) == null) {
          RpcEventGrpc.getHttpReportDataMethod = getHttpReportDataMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.event.HttpReport, tuya.tedge.driver.sdk.grpc.event.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HttpReportData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.event.HttpReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.event.Response.getDefaultInstance()))
              .setSchemaDescriptor(new RpcEventMethodDescriptorSupplier("HttpReportData"))
              .build();
        }
      }
    }
    return getHttpReportDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcEventStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcEventStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcEventStub>() {
        @java.lang.Override
        public RpcEventStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcEventStub(channel, callOptions);
        }
      };
    return RpcEventStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcEventBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcEventBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcEventBlockingStub>() {
        @java.lang.Override
        public RpcEventBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcEventBlockingStub(channel, callOptions);
        }
      };
    return RpcEventBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcEventFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcEventFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcEventFutureStub>() {
        @java.lang.Override
        public RpcEventFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcEventFutureStub(channel, callOptions);
        }
      };
    return RpcEventFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcEventImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 添加多个Event
     * </pre>
     */
    public void add(tuya.tedge.driver.sdk.grpc.event.Events request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * mqtt不带dp点数据上报
     * </pre>
     */
    public void withoutDpReportData(tuya.tedge.driver.sdk.grpc.event.WithoutDpReport request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithoutDpReportDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * 数据上报
     * </pre>
     */
    public void httpReportData(tuya.tedge.driver.sdk.grpc.event.HttpReport request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.event.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHttpReportDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.event.Events,
                tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getWithoutDpReportDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.event.WithoutDpReport,
                com.google.protobuf.Empty>(
                  this, METHODID_WITHOUT_DP_REPORT_DATA)))
          .addMethod(
            getHttpReportDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.event.HttpReport,
                tuya.tedge.driver.sdk.grpc.event.Response>(
                  this, METHODID_HTTP_REPORT_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class RpcEventStub extends io.grpc.stub.AbstractAsyncStub<RpcEventStub> {
    private RpcEventStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcEventStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcEventStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加多个Event
     * </pre>
     */
    public void add(tuya.tedge.driver.sdk.grpc.event.Events request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * mqtt不带dp点数据上报
     * </pre>
     */
    public void withoutDpReportData(tuya.tedge.driver.sdk.grpc.event.WithoutDpReport request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithoutDpReportDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 数据上报
     * </pre>
     */
    public void httpReportData(tuya.tedge.driver.sdk.grpc.event.HttpReport request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.event.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHttpReportDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcEventBlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcEventBlockingStub> {
    private RpcEventBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcEventBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcEventBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加多个Event
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse add(tuya.tedge.driver.sdk.grpc.event.Events request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * mqtt不带dp点数据上报
     * </pre>
     */
    public com.google.protobuf.Empty withoutDpReportData(tuya.tedge.driver.sdk.grpc.event.WithoutDpReport request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithoutDpReportDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 数据上报
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.event.Response httpReportData(tuya.tedge.driver.sdk.grpc.event.HttpReport request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHttpReportDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcEventFutureStub extends io.grpc.stub.AbstractFutureStub<RpcEventFutureStub> {
    private RpcEventFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcEventFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcEventFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加多个Event
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse> add(
        tuya.tedge.driver.sdk.grpc.event.Events request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * mqtt不带dp点数据上报
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> withoutDpReportData(
        tuya.tedge.driver.sdk.grpc.event.WithoutDpReport request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithoutDpReportDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 数据上报
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.event.Response> httpReportData(
        tuya.tedge.driver.sdk.grpc.event.HttpReport request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHttpReportDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_WITHOUT_DP_REPORT_DATA = 1;
  private static final int METHODID_HTTP_REPORT_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcEventImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcEventImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((tuya.tedge.driver.sdk.grpc.event.Events) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse>) responseObserver);
          break;
        case METHODID_WITHOUT_DP_REPORT_DATA:
          serviceImpl.withoutDpReportData((tuya.tedge.driver.sdk.grpc.event.WithoutDpReport) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_HTTP_REPORT_DATA:
          serviceImpl.httpReportData((tuya.tedge.driver.sdk.grpc.event.HttpReport) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.event.Response>) responseObserver);
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

  private static abstract class RpcEventBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcEventBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.event.EventProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcEvent");
    }
  }

  private static final class RpcEventFileDescriptorSupplier
      extends RpcEventBaseDescriptorSupplier {
    RpcEventFileDescriptorSupplier() {}
  }

  private static final class RpcEventMethodDescriptorSupplier
      extends RpcEventBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcEventMethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcEventGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcEventFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getWithoutDpReportDataMethod())
              .addMethod(getHttpReportDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
