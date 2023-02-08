package tuya.tedge.driver.sdk.base.mqtt;

import lombok.Data;

@Data
public class InnerMessage {
    private String topic;
    private byte[] payload;
    private String requestId;

    public InnerMessage() {

    }

    public InnerMessage(String topic, byte[] payload) {
        this.topic = topic;
        this.payload = payload;
    }

    public InnerMessage(String topic, byte[] payload, String requestId) {
        this.topic = topic;
        this.payload = payload;
        this.requestId = requestId;
    }
}
