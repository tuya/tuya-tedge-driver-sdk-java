package tuya.tedge.driver.sdk.base.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class RpcConfig {
    private String resourceAddr;
    private Boolean resourceUseTls;
    private String resourceCertFilePath;

    public RpcConfig(String resourceAddr, Boolean resourceUseTls, String resourceCertFilePath) {
        this.resourceAddr = resourceAddr;
        this.resourceUseTls = resourceUseTls;
        this.resourceCertFilePath = resourceCertFilePath;
    }

    public String getResourceAddr() {
        return resourceAddr;
    }

    public Boolean getResourceUseTls() {
        return resourceUseTls;
    }

    public String getResourceCertFilePath() {
        return resourceCertFilePath;
    }
}
