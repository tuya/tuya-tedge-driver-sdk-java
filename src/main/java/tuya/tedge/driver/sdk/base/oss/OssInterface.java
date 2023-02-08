package tuya.tedge.driver.sdk.base.oss;

import tuya.tedge.driver.sdk.dpmodel.model.OssResult;

public interface OssInterface {
    /**
     * 上传图片
     *
     * @param name
     * @param data
     * @return
     */
    OssResult uploadFile(String name, byte[] data);

}
