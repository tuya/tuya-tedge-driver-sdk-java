package tuya.tedge.driver.sdk.grpc.alert;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: alert.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AlertReportServiceGrpc {

  private AlertReportServiceGrpc() {}

  public static final String SERVICE_NAME = "alert.AlertReportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.alert.AlertReportReq,
      tuya.tedge.driver.sdk.grpc.alert.AlertReportResp> getAlertReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AlertReport",
      requestType = tuya.tedge.driver.sdk.grpc.alert.AlertReportReq.class,
      responseType = tuya.tedge.driver.sdk.grpc.alert.AlertReportResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.alert.AlertReportReq,
      tuya.tedge.driver.sdk.grpc.alert.AlertReportResp> getAlertReportMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.alert.AlertReportReq, tuya.tedge.driver.sdk.grpc.alert.AlertReportResp> getAlertReportMethod;
    if ((getAlertReportMethod = AlertReportServiceGrpc.getAlertReportMethod) == null) {
      synchronized (AlertReportServiceGrpc.class) {
        if ((getAlertReportMethod = AlertReportServiceGrpc.getAlertReportMethod) == null) {
          AlertReportServiceGrpc.getAlertReportMethod = getAlertReportMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.alert.AlertReportReq, tuya.tedge.driver.sdk.grpc.alert.AlertReportResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlertReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.alert.AlertReportReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.alert.AlertReportResp.getDefaultInstance()))
              .setSchemaDescriptor(new AlertReportServiceMethodDescriptorSupplier("AlertReport"))
              .build();
        }
      }
    }
    return getAlertReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlertReportServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlertReportServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlertReportServiceStub>() {
        @java.lang.Override
        public AlertReportServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlertReportServiceStub(channel, callOptions);
        }
      };
    return AlertReportServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlertReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlertReportServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlertReportServiceBlockingStub>() {
        @java.lang.Override
        public AlertReportServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlertReportServiceBlockingStub(channel, callOptions);
        }
      };
    return AlertReportServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlertReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlertReportServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlertReportServiceFutureStub>() {
        @java.lang.Override
        public AlertReportServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlertReportServiceFutureStub(channel, callOptions);
        }
      };
    return AlertReportServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AlertReportServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void alertReport(tuya.tedge.driver.sdk.grpc.alert.AlertReportReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.alert.AlertReportResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlertReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAlertReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.alert.AlertReportReq,
                tuya.tedge.driver.sdk.grpc.alert.AlertReportResp>(
                  this, METHODID_ALERT_REPORT)))
          .build();
    }
  }

  /**
   */
  public static final class AlertReportServiceStub extends io.grpc.stub.AbstractAsyncStub<AlertReportServiceStub> {
    private AlertReportServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertReportServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlertReportServiceStub(channel, callOptions);
    }

    /**
     */
    public void alertReport(tuya.tedge.driver.sdk.grpc.alert.AlertReportReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.alert.AlertReportResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlertReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlertReportServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AlertReportServiceBlockingStub> {
    private AlertReportServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertReportServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlertReportServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public tuya.tedge.driver.sdk.grpc.alert.AlertReportResp alertReport(tuya.tedge.driver.sdk.grpc.alert.AlertReportReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlertReportMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlertReportServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AlertReportServiceFutureStub> {
    private AlertReportServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertReportServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlertReportServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.alert.AlertReportResp> alertReport(
        tuya.tedge.driver.sdk.grpc.alert.AlertReportReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlertReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALERT_REPORT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlertReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlertReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALERT_REPORT:
          serviceImpl.alertReport((tuya.tedge.driver.sdk.grpc.alert.AlertReportReq) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.alert.AlertReportResp>) responseObserver);
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

  private static abstract class AlertReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlertReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.alert.AlertProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlertReportService");
    }
  }

  private static final class AlertReportServiceFileDescriptorSupplier
      extends AlertReportServiceBaseDescriptorSupplier {
    AlertReportServiceFileDescriptorSupplier() {}
  }

  private static final class AlertReportServiceMethodDescriptorSupplier
      extends AlertReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlertReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlertReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlertReportServiceFileDescriptorSupplier())
              .addMethod(getAlertReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
