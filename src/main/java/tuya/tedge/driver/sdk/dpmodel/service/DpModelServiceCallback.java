package tuya.tedge.driver.sdk.dpmodel.service;

import tuya.tedge.driver.sdk.dpmodel.dto.command.CmdRequestDto;
import tuya.tedge.driver.sdk.base.dto.product.ProductDto;

public interface DpModelServiceCallback {
    /**
     * dp模型云端更新产品回调
     *
     * @param request
     */
     void updateProductCallback(ProductDto request);

    /**
     * dp模型云端命令下发回调
     *
     * @param request
     */
     void issueCommand(CmdRequestDto request);
}
