package tuya.tedge.driver.sdk.base.rpcclient;

import com.google.protobuf.Empty;
import tuya.tedge.driver.sdk.base.convert.DriverStorageConvert;
import tuya.tedge.driver.sdk.base.utils.TimeConst;
import tuya.tedge.driver.sdk.grpc.driverstorage.*;
import io.grpc.ManagedChannel;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

@Data
@Slf4j
public class DriverStorageClient {
    private DriverStorageGrpc.DriverStorageBlockingStub blockingStub;
    private DriverStorageConvert convert = new DriverStorageConvert();

    public DriverStorageClient() {
    }

    public DriverStorageClient(ManagedChannel channel) {
        this.blockingStub = DriverStorageGrpc.newBlockingStub(channel);
    }

    public KVs all(AllReq allReq) {
        KVs all = null;
        try {
            all = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).all(allReq);
        } catch (Exception e) {
            log.error("storageClient all fail:{}", e.getMessage());
            return null;
        }

        return all;
    }

    public Boolean delete(DeleteReq deleteReq) {
        try {
            final Empty delete = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).delete(deleteReq);
        } catch (Exception e) {
            log.error("storageClient delete fail:{}", e.getMessage());
            return false;
        }
        return true;
    }

    public Boolean put(PutReq putReq) {
        try {
            final Empty put = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).put(putReq);
        } catch (Exception e) {
            log.error("storageClient put fail:{}", e.getMessage());
            return false;
        }
        return true;
    }

    public KVs get(GetReq getReq) {
        KVs kvs = null;
        try {
            kvs = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).get(getReq);
        } catch (Exception e) {
            log.error("storageClient get fail:{}", e.getMessage());
            return null;
        }
        return kvs;
    }

    public Keys getKeys(GetPrefixReq prefixReq) {
        Keys keys = null;
        try {
            keys = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).getKeys(prefixReq);
        } catch (Exception e) {
            log.error("storageClient getKeys fail:{}", e.getMessage());
            return null;
        }
        return keys;
    }

    // GetV2 获取备份数据
    public KVs getV2(GetReq getReq) {
        KVs kvs = null;
        try {
            kvs = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).getV2(getReq);
        } catch (Exception e) {
            log.error("storageClient getV2 fail:{}", e.getMessage());
            return null;
        }
        return kvs;
    }

    // GetKeysV2 只获取备份数据的Key
    public Keys getKeysV2(GetPrefixReq prefixReq) {
        Keys keys = null;
        try {
            keys = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).getKeysV2(prefixReq);
        } catch (Exception e) {
            log.error("storageClient getKeysV2 fail:{}", e.getMessage());
            return null;
        }
        return keys;
    }

    // PutV2 存储备份数据,限制大小，超过会报错
    public Boolean putV2(PutReq putReq) {
        try {
            final Empty put = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).putV2(putReq);
        } catch (Exception e) {
            log.error("storageClient putV2 fail:{}", e.getMessage());
            return false;
        }
        return true;
    }

    // DeleteV2 删除备份数据
    public Boolean deleteV2(DeleteReq deleteReq) {
        try {
            final Empty delete = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).deleteV2(deleteReq);
        } catch (Exception e) {
            log.error("storageClient DeleteV2 fail:{}", e.getMessage());
            return false;
        }
        return true;
    }
}
