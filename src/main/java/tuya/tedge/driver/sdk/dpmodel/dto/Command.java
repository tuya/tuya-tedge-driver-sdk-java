package tuya.tedge.driver.sdk.dpmodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Command {
    @JsonProperty("object_device_id")
    private String objectDeviceId;
    @JsonProperty("service_id")
    private String serviceId;
    @JsonProperty("command_name")
    private String commandName;
    private Object paras;

    public Command() {
    }

    public Command(String objectDeviceId, String serviceId, String commandName, Object paras) {
        this.objectDeviceId = objectDeviceId;
        this.serviceId = serviceId;
        this.commandName = commandName;
        this.paras = paras;
    }

    public String getObjectDeviceId() {
        return this.objectDeviceId;
    }

    public void setObjectDeviceId(String objectDeviceId) {
        this.objectDeviceId = objectDeviceId;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getCommandName() {
        return this.commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public Object getParas() {
        return this.paras;
    }

    public void setParas(Object paras) {
        this.paras = paras;
    }
}