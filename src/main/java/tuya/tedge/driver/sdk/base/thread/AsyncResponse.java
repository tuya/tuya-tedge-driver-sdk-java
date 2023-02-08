package tuya.tedge.driver.sdk.base.thread;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Data
@Slf4j
public class AsyncResponse {
    private static Map<String, AsyncData> asyncDataMap = new ConcurrentHashMap<>();

    private AsyncResponse() {
    }

    public static Object waitGetData(String cid, String msgId) {
        Object resp = null;
        CountDownLatch latch = new CountDownLatch(1);
        AsyncData asyncData = new AsyncData(msgId, latch, null);
        asyncDataMap.put(cid + msgId, asyncData);
        try {
            latch.await(5, TimeUnit.SECONDS);
            resp = asyncData.getData();
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        } finally {
            asyncDataMap.remove(cid + msgId);
        }
        return resp;
    }

    public static void putData(String cid, String msgId, Object data) {
        AsyncData asyncData = asyncDataMap.get(cid + msgId);
        if (asyncData != null) {
            asyncData.setDataAndCountDown(data);
        }
    }

}
