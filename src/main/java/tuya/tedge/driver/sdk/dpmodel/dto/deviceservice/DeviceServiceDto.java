package tuya.tedge.driver.sdk.dpmodel.dto.deviceservice;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class DeviceServiceDto {
    private String id;
    private String name;
    private String baseAddress;
    private String deviceLibraryId;
    private String dockerContainerId;
    private byte[] config;
    private Boolean isMountDir;
    private Integer runStatus;
    private Boolean expertMode;
    private String expertModeContent;
    private Boolean dockerParamsSwitch;
    private String dockerParams;
    private Boolean isAppService;

    public DeviceServiceDto(
            String id,
            String name,
            String baseAddress,
            String deviceLibraryId,
            String dockerContainerId,
            byte[] config,
            Boolean isMountDir,
            Integer runStatus,
            Boolean expertMode,
            String expertModeContent,
            Boolean dockerParamsSwitch,
            String dockerParams,
            Boolean isAppService) {
        this.id = id;
        this.name = name;
        this.baseAddress = baseAddress;
        this.deviceLibraryId = deviceLibraryId;
        this.dockerContainerId = dockerContainerId;
        this.config = config;
        this.isMountDir = isMountDir;
        this.runStatus = runStatus;
        this.expertMode = expertMode;
        this.expertModeContent = expertModeContent;
        this.dockerParamsSwitch = dockerParamsSwitch;
        this.dockerParams = dockerParams;
        this.isAppService = isAppService;
    }
}
