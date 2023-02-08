package tuya.tedge.driver.sdk.base.convert;

import tuya.tedge.driver.sdk.grpc.driverstorage.KV;
import tuya.tedge.driver.sdk.grpc.driverstorage.KVs;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Data
public class DriverStorageConvert {
    public DriverStorageConvert() {
    }

    public Map<String, byte[]> convertKVs2Map(KVs kvs) {
        Map<String, byte[]> m = new ConcurrentHashMap<>();
        if (kvs == null) {
            return m;
        }
        for (KV kv : kvs.getKvsList()) {
            String key = kv.getKey();
            byte[] value = kv.getValue().toByteArray();
            if (value.length == 0) {
                continue;
            }
            m.put(key, value);
        }
        return m;
    }
}
