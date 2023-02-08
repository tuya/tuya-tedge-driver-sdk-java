package tuya.tedge.driver.sdk.base.cache;

import tuya.tedge.driver.sdk.base.rpcclient.DeviceClient;
import tuya.tedge.driver.sdk.base.dto.common.BaseSearchConditionQueryDto;
import tuya.tedge.driver.sdk.base.dto.device.DeviceByIdRequestDto;
import tuya.tedge.driver.sdk.base.dto.device.DeviceInfoDto;
import tuya.tedge.driver.sdk.base.dto.device.DeviceSearchQueryRequestDto;
import tuya.tedge.driver.sdk.base.dto.device.MultiDeviceResponseDto;
import tuya.tedge.driver.sdk.base.rpcclient.DeviceServiceClient;
import tuya.tedge.driver.sdk.dpmodel.dto.deviceservice.DeviceServiceDto;
import tuya.tedge.driver.sdk.base.rpcclient.ResourceClient;
import tuya.tedge.driver.sdk.base.config.ClientConfig;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class DeviceCache {
    protected Map<String, DeviceInfoDto> deviceInfoDtoMap;

    protected DeviceServiceDto serviceDto;
    protected ResourceClient resourceClient;
    protected ClientConfig clientConfig;
    private Timer timer;

    public DeviceCache(ResourceClient resourceClient, ClientConfig clientConfig) {
        this.resourceClient = resourceClient;
        this.clientConfig = clientConfig;
        this.timer = new Timer();
        this.deviceInfoDtoMap = new ConcurrentHashMap<>();
    }

    public DeviceServiceDto getDeviceServiceInfo() {
        return serviceDto;
    }

    public void initCache() {
        try {
            DeviceServiceClient devServiceClient = resourceClient.getDeviceServiceClient();
            serviceDto = devServiceClient.deviceServiceById(clientConfig.serviceConfig().getId());
        } catch (StatusRuntimeException e) {
            log.error("initCache device cache, exception:{}", e.getMessage());
            throw e;
        }

        if (serviceDto == null) {
            return;
        }

        //initAllDeviceInfo(serviceDto.getId());
        timer.schedule(timerTask, 0, 60 * 1000);
    }

    private void initAllDeviceInfo(String serviceId) {
        log.info("initAllDeviceInfo serviceId:{} in", serviceId);
        DeviceClient deviceClient = resourceClient.getDeviceClient();
        MultiDeviceResponseDto devicesSearch = deviceClient.DevicesSearch(new DeviceSearchQueryRequestDto(new BaseSearchConditionQueryDto(), serviceId));
        if (devicesSearch == null) {
            log.error("initAllDeviceInfo fail,devicesSearch is nil");
            return;
        }

        devicesSearch.getDeviceList().forEach(deviceInfoDto -> {
            addDeviceInfoDto(deviceInfoDto);
        });
    }

    //定时更新产品信息
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            initAllDeviceInfo(serviceDto.getId());
        }
    };

    /**
     * 操作dp模型 设备信息
     */
    public DeviceInfoDto getDeviceInfoDtoById(String cid) {
        DeviceInfoDto deviceInfoDto = deviceInfoDtoMap.get(cid);
        if (deviceInfoDto == null) {
            if (!updateDeviceShadowInfo(cid)) {
                return null;
            }
            deviceInfoDto = deviceInfoDtoMap.get(cid);
        }
        return deviceInfoDto;
    }

    public Map<String, DeviceInfoDto> getDeviceInfoDtoMap() {
        return deviceInfoDtoMap;
    }

    public void addDeviceInfoDto(DeviceInfoDto deviceInfoDto) {
        if (deviceInfoDto == null) {
            log.error("addDeviceInfoDto func parameter is nil");
            return;
        }

        deviceInfoDtoMap.put(deviceInfoDto.getId(), deviceInfoDto);
    }

    public void updateDeviceInfoDto(DeviceInfoDto deviceInfoDto) {
        this.addDeviceInfoDto(deviceInfoDto);
    }

    public void removeDeviceInfoDtoById(String cid) {
        if (cid == null) {
            return;
        }

        deviceInfoDtoMap.remove(cid);
    }

    private Boolean updateDeviceShadowInfo(String cid) {
        if (cid == null) {
            return false;
        }
        DeviceInfoDto deviceInfoDto = resourceClient.getDeviceClient().DeviceById(new DeviceByIdRequestDto(cid));
        if (deviceInfoDto == null) {
            return false;
        }
        addDeviceInfoDto(deviceInfoDto);
        return true;
    }
}
