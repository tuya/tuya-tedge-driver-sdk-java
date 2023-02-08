package tuya.tedge.driver.sdk.base.thread;

import java.util.concurrent.CountDownLatch;

public class AsyncData<T> {
    private String msgId;
    private CountDownLatch countDownLatch;
    private T data;

    public AsyncData() {
    }

    public AsyncData(String msgId, CountDownLatch countDownLatch, T data) {
        this.msgId = msgId;
        this.countDownLatch = countDownLatch;
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setDataAndCountDown(T data) {
        this.data = data;
        countDownLatch.countDown();
    }

    public T getData() {
        return this.data;
    }

    public String getMsgId() {
        return this.msgId;
    }
}
