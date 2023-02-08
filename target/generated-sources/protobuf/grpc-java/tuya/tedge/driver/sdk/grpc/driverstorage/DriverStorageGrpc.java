package tuya.tedge.driver.sdk.grpc.driverstorage;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: driverstorage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DriverStorageGrpc {

  private DriverStorageGrpc() {}

  public static final String SERVICE_NAME = "driverstorage.DriverStorage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.AllReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "All",
      requestType = tuya.tedge.driver.sdk.grpc.driverstorage.AllReq.class,
      responseType = tuya.tedge.driver.sdk.grpc.driverstorage.KVs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.AllReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getAllMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.AllReq, tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getAllMethod;
    if ((getAllMethod = DriverStorageGrpc.getAllMethod) == null) {
      synchronized (DriverStorageGrpc.class) {
        if ((getAllMethod = DriverStorageGrpc.getAllMethod) == null) {
          DriverStorageGrpc.getAllMethod = getAllMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.driverstorage.AllReq, tuya.tedge.driver.sdk.grpc.driverstorage.KVs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "All"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.AllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.KVs.getDefaultInstance()))
              .setSchemaDescriptor(new DriverStorageMethodDescriptorSupplier("All"))
              .build();
        }
      }
    }
    return getAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.Keys> getGetKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKeys",
      requestType = tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq.class,
      responseType = tuya.tedge.driver.sdk.grpc.driverstorage.Keys.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.Keys> getGetKeysMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq, tuya.tedge.driver.sdk.grpc.driverstorage.Keys> getGetKeysMethod;
    if ((getGetKeysMethod = DriverStorageGrpc.getGetKeysMethod) == null) {
      synchronized (DriverStorageGrpc.class) {
        if ((getGetKeysMethod = DriverStorageGrpc.getGetKeysMethod) == null) {
          DriverStorageGrpc.getGetKeysMethod = getGetKeysMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq, tuya.tedge.driver.sdk.grpc.driverstorage.Keys>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.Keys.getDefaultInstance()))
              .setSchemaDescriptor(new DriverStorageMethodDescriptorSupplier("GetKeys"))
              .build();
        }
      }
    }
    return getGetKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.class,
      responseType = tuya.tedge.driver.sdk.grpc.driverstorage.KVs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getGetMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetReq, tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getGetMethod;
    if ((getGetMethod = DriverStorageGrpc.getGetMethod) == null) {
      synchronized (DriverStorageGrpc.class) {
        if ((getGetMethod = DriverStorageGrpc.getGetMethod) == null) {
          DriverStorageGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.driverstorage.GetReq, tuya.tedge.driver.sdk.grpc.driverstorage.KVs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.KVs.getDefaultInstance()))
              .setSchemaDescriptor(new DriverStorageMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.PutReq,
      com.google.protobuf.Empty> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.PutReq,
      com.google.protobuf.Empty> getPutMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.PutReq, com.google.protobuf.Empty> getPutMethod;
    if ((getPutMethod = DriverStorageGrpc.getPutMethod) == null) {
      synchronized (DriverStorageGrpc.class) {
        if ((getPutMethod = DriverStorageGrpc.getPutMethod) == null) {
          DriverStorageGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.driverstorage.PutReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverStorageMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = DriverStorageGrpc.getDeleteMethod) == null) {
      synchronized (DriverStorageGrpc.class) {
        if ((getDeleteMethod = DriverStorageGrpc.getDeleteMethod) == null) {
          DriverStorageGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverStorageMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getGetV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetV2",
      requestType = tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.class,
      responseType = tuya.tedge.driver.sdk.grpc.driverstorage.KVs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getGetV2Method() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetReq, tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getGetV2Method;
    if ((getGetV2Method = DriverStorageGrpc.getGetV2Method) == null) {
      synchronized (DriverStorageGrpc.class) {
        if ((getGetV2Method = DriverStorageGrpc.getGetV2Method) == null) {
          DriverStorageGrpc.getGetV2Method = getGetV2Method =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.driverstorage.GetReq, tuya.tedge.driver.sdk.grpc.driverstorage.KVs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.GetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.KVs.getDefaultInstance()))
              .setSchemaDescriptor(new DriverStorageMethodDescriptorSupplier("GetV2"))
              .build();
        }
      }
    }
    return getGetV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.Keys> getGetKeysV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKeysV2",
      requestType = tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq.class,
      responseType = tuya.tedge.driver.sdk.grpc.driverstorage.Keys.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq,
      tuya.tedge.driver.sdk.grpc.driverstorage.Keys> getGetKeysV2Method() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq, tuya.tedge.driver.sdk.grpc.driverstorage.Keys> getGetKeysV2Method;
    if ((getGetKeysV2Method = DriverStorageGrpc.getGetKeysV2Method) == null) {
      synchronized (DriverStorageGrpc.class) {
        if ((getGetKeysV2Method = DriverStorageGrpc.getGetKeysV2Method) == null) {
          DriverStorageGrpc.getGetKeysV2Method = getGetKeysV2Method =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq, tuya.tedge.driver.sdk.grpc.driverstorage.Keys>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKeysV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.Keys.getDefaultInstance()))
              .setSchemaDescriptor(new DriverStorageMethodDescriptorSupplier("GetKeysV2"))
              .build();
        }
      }
    }
    return getGetKeysV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.PutReq,
      com.google.protobuf.Empty> getPutV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutV2",
      requestType = tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.PutReq,
      com.google.protobuf.Empty> getPutV2Method() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.PutReq, com.google.protobuf.Empty> getPutV2Method;
    if ((getPutV2Method = DriverStorageGrpc.getPutV2Method) == null) {
      synchronized (DriverStorageGrpc.class) {
        if ((getPutV2Method = DriverStorageGrpc.getPutV2Method) == null) {
          DriverStorageGrpc.getPutV2Method = getPutV2Method =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.driverstorage.PutReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.PutReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverStorageMethodDescriptorSupplier("PutV2"))
              .build();
        }
      }
    }
    return getPutV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq,
      com.google.protobuf.Empty> getDeleteV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteV2",
      requestType = tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq,
      com.google.protobuf.Empty> getDeleteV2Method() {
    io.grpc.MethodDescriptor<tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq, com.google.protobuf.Empty> getDeleteV2Method;
    if ((getDeleteV2Method = DriverStorageGrpc.getDeleteV2Method) == null) {
      synchronized (DriverStorageGrpc.class) {
        if ((getDeleteV2Method = DriverStorageGrpc.getDeleteV2Method) == null) {
          DriverStorageGrpc.getDeleteV2Method = getDeleteV2Method =
              io.grpc.MethodDescriptor.<tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DriverStorageMethodDescriptorSupplier("DeleteV2"))
              .build();
        }
      }
    }
    return getDeleteV2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DriverStorageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverStorageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverStorageStub>() {
        @java.lang.Override
        public DriverStorageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverStorageStub(channel, callOptions);
        }
      };
    return DriverStorageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DriverStorageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverStorageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverStorageBlockingStub>() {
        @java.lang.Override
        public DriverStorageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverStorageBlockingStub(channel, callOptions);
        }
      };
    return DriverStorageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DriverStorageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverStorageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverStorageFutureStub>() {
        @java.lang.Override
        public DriverStorageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverStorageFutureStub(channel, callOptions);
        }
      };
    return DriverStorageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DriverStorageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * All 获取全部本地数据(不带备份数据)
     * deprecated 存在性能问题
     * </pre>
     */
    public void all(tuya.tedge.driver.sdk.grpc.driverstorage.AllReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.KVs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetKeys 获取非备份的key
     * </pre>
     */
    public void getKeys(tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.Keys> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get 本地数据www
     * </pre>
     */
    public void get(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.KVs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put 存储在本地
     * </pre>
     */
    public void put(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete 删除本地数据
     * </pre>
     */
    public void delete(tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetV2 获取备份数据
     * </pre>
     */
    public void getV2(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.KVs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetV2Method(), responseObserver);
    }

    /**
     * <pre>
     * GetKeysV2 只获取备份数据的Key
     * </pre>
     */
    public void getKeysV2(tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.Keys> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKeysV2Method(), responseObserver);
    }

    /**
     * <pre>
     * PutV2 存储备份数据,限制大小，超过会报错
     * </pre>
     */
    public void putV2(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutV2Method(), responseObserver);
    }

    /**
     * <pre>
     * DeleteV2 删除备份数据
     * </pre>
     */
    public void deleteV2(tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteV2Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.driverstorage.AllReq,
                tuya.tedge.driver.sdk.grpc.driverstorage.KVs>(
                  this, METHODID_ALL)))
          .addMethod(
            getGetKeysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq,
                tuya.tedge.driver.sdk.grpc.driverstorage.Keys>(
                  this, METHODID_GET_KEYS)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.driverstorage.GetReq,
                tuya.tedge.driver.sdk.grpc.driverstorage.KVs>(
                  this, METHODID_GET)))
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.driverstorage.PutReq,
                com.google.protobuf.Empty>(
                  this, METHODID_PUT)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetV2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.driverstorage.GetReq,
                tuya.tedge.driver.sdk.grpc.driverstorage.KVs>(
                  this, METHODID_GET_V2)))
          .addMethod(
            getGetKeysV2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq,
                tuya.tedge.driver.sdk.grpc.driverstorage.Keys>(
                  this, METHODID_GET_KEYS_V2)))
          .addMethod(
            getPutV2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.driverstorage.PutReq,
                com.google.protobuf.Empty>(
                  this, METHODID_PUT_V2)))
          .addMethod(
            getDeleteV2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_V2)))
          .build();
    }
  }

  /**
   */
  public static final class DriverStorageStub extends io.grpc.stub.AbstractAsyncStub<DriverStorageStub> {
    private DriverStorageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverStorageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverStorageStub(channel, callOptions);
    }

    /**
     * <pre>
     * All 获取全部本地数据(不带备份数据)
     * deprecated 存在性能问题
     * </pre>
     */
    public void all(tuya.tedge.driver.sdk.grpc.driverstorage.AllReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.KVs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetKeys 获取非备份的key
     * </pre>
     */
    public void getKeys(tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.Keys> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get 本地数据www
     * </pre>
     */
    public void get(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.KVs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put 存储在本地
     * </pre>
     */
    public void put(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete 删除本地数据
     * </pre>
     */
    public void delete(tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetV2 获取备份数据
     * </pre>
     */
    public void getV2(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.KVs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetKeysV2 只获取备份数据的Key
     * </pre>
     */
    public void getKeysV2(tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq request,
        io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.Keys> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKeysV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PutV2 存储备份数据,限制大小，超过会报错
     * </pre>
     */
    public void putV2(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteV2 删除备份数据
     * </pre>
     */
    public void deleteV2(tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteV2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DriverStorageBlockingStub extends io.grpc.stub.AbstractBlockingStub<DriverStorageBlockingStub> {
    private DriverStorageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverStorageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverStorageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * All 获取全部本地数据(不带备份数据)
     * deprecated 存在性能问题
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KVs all(tuya.tedge.driver.sdk.grpc.driverstorage.AllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetKeys 获取非备份的key
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.Keys getKeys(tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get 本地数据www
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KVs get(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put 存储在本地
     * </pre>
     */
    public com.google.protobuf.Empty put(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete 删除本地数据
     * </pre>
     */
    public com.google.protobuf.Empty delete(tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetV2 获取备份数据
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.KVs getV2(tuya.tedge.driver.sdk.grpc.driverstorage.GetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetKeysV2 只获取备份数据的Key
     * </pre>
     */
    public tuya.tedge.driver.sdk.grpc.driverstorage.Keys getKeysV2(tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKeysV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PutV2 存储备份数据,限制大小，超过会报错
     * </pre>
     */
    public com.google.protobuf.Empty putV2(tuya.tedge.driver.sdk.grpc.driverstorage.PutReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteV2 删除备份数据
     * </pre>
     */
    public com.google.protobuf.Empty deleteV2(tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteV2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DriverStorageFutureStub extends io.grpc.stub.AbstractFutureStub<DriverStorageFutureStub> {
    private DriverStorageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverStorageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverStorageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * All 获取全部本地数据(不带备份数据)
     * deprecated 存在性能问题
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.driverstorage.KVs> all(
        tuya.tedge.driver.sdk.grpc.driverstorage.AllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetKeys 获取非备份的key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.driverstorage.Keys> getKeys(
        tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get 本地数据www
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.driverstorage.KVs> get(
        tuya.tedge.driver.sdk.grpc.driverstorage.GetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put 存储在本地
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> put(
        tuya.tedge.driver.sdk.grpc.driverstorage.PutReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete 删除本地数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetV2 获取备份数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.driverstorage.KVs> getV2(
        tuya.tedge.driver.sdk.grpc.driverstorage.GetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetKeysV2 只获取备份数据的Key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tuya.tedge.driver.sdk.grpc.driverstorage.Keys> getKeysV2(
        tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKeysV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PutV2 存储备份数据,限制大小，超过会报错
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> putV2(
        tuya.tedge.driver.sdk.grpc.driverstorage.PutReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteV2 删除备份数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteV2(
        tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteV2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL = 0;
  private static final int METHODID_GET_KEYS = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_PUT = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_GET_V2 = 5;
  private static final int METHODID_GET_KEYS_V2 = 6;
  private static final int METHODID_PUT_V2 = 7;
  private static final int METHODID_DELETE_V2 = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DriverStorageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DriverStorageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL:
          serviceImpl.all((tuya.tedge.driver.sdk.grpc.driverstorage.AllReq) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.KVs>) responseObserver);
          break;
        case METHODID_GET_KEYS:
          serviceImpl.getKeys((tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.Keys>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((tuya.tedge.driver.sdk.grpc.driverstorage.GetReq) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.KVs>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((tuya.tedge.driver.sdk.grpc.driverstorage.PutReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_V2:
          serviceImpl.getV2((tuya.tedge.driver.sdk.grpc.driverstorage.GetReq) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.KVs>) responseObserver);
          break;
        case METHODID_GET_KEYS_V2:
          serviceImpl.getKeysV2((tuya.tedge.driver.sdk.grpc.driverstorage.GetPrefixReq) request,
              (io.grpc.stub.StreamObserver<tuya.tedge.driver.sdk.grpc.driverstorage.Keys>) responseObserver);
          break;
        case METHODID_PUT_V2:
          serviceImpl.putV2((tuya.tedge.driver.sdk.grpc.driverstorage.PutReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_V2:
          serviceImpl.deleteV2((tuya.tedge.driver.sdk.grpc.driverstorage.DeleteReq) request,
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

  private static abstract class DriverStorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DriverStorageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tuya.tedge.driver.sdk.grpc.driverstorage.DriverStorageProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DriverStorage");
    }
  }

  private static final class DriverStorageFileDescriptorSupplier
      extends DriverStorageBaseDescriptorSupplier {
    DriverStorageFileDescriptorSupplier() {}
  }

  private static final class DriverStorageMethodDescriptorSupplier
      extends DriverStorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DriverStorageMethodDescriptorSupplier(String methodName) {
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
      synchronized (DriverStorageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DriverStorageFileDescriptorSupplier())
              .addMethod(getAllMethod())
              .addMethod(getGetKeysMethod())
              .addMethod(getGetMethod())
              .addMethod(getPutMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetV2Method())
              .addMethod(getGetKeysV2Method())
              .addMethod(getPutV2Method())
              .addMethod(getDeleteV2Method())
              .build();
        }
      }
    }
    return result;
  }
}
