package tuya.tedge.driver.sdk.dpmodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    @JsonProperty("object_device_id")
    private String objectDeviceId;
    private String name;
    private String id;
    private Object content;

    public Message() {
    }

    public Message(String objectDeviceId, String name, String id, Object content) {
        this.objectDeviceId = objectDeviceId;
        this.name = name;
        this.id = id;
        this.content = content;
    }

    public String getObjectDeviceId() {
        return this.objectDeviceId;
    }

    public void setObjectDeviceId(String objectDeviceId) {
        this.objectDeviceId = objectDeviceId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}