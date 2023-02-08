package tuya.tedge.driver.sdk.base.model;

import lombok.Data;

@Data
public class ProxyInfo {
    private String host;
    private Integer port;

    public ProxyInfo() {
    }

    public ProxyInfo(String host, Integer port) {
        this.host = host;
        this.port = port;
    }
}
