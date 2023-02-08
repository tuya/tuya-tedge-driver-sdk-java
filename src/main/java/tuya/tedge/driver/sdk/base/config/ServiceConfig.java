package tuya.tedge.driver.sdk.base.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
public class ServiceConfig {
    private String id;
    private String name;
    private String address;
    private String port;
    private Boolean useTls;
    private String certFile;
    private String keyFile;
    private List<String> productList;
    private Boolean activated;


    public ServiceConfig(String id, String name, String address, String port, Boolean useTls, String certFile, String keyFile, List<String> productList, Boolean activated) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.useTls = useTls;
        this.certFile = certFile;
        this.keyFile = keyFile;
        this.productList = productList;
        this.activated = activated;
        this.port = port;
    }


}
