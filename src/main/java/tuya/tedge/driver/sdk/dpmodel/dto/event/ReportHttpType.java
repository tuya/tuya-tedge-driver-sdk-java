package tuya.tedge.driver.sdk.dpmodel.dto.event;

public enum ReportHttpType {
    /**
     * 通过rpc HttpReportData 上报数据类型
     * HTTP_API_EG_SYNCDATA_RESULT                   = "tuya.industry.base.eg.syncdata.result.post"
     * HTTP_API_EDGE_GATEWAY_SYNCDATA_RESULT         = "tuya.industry.base.edge.gateway.syncdata.type.result.post"
     * HTTP_API_EDGE_UPLOAD_TOKEN                    = "tuya.industry.base.edge.file.upload.token"
     * HTTP_API_EDGE_DEVICE_QUERY_ALL                = "tuya.industry.base.edge.device.query.all"
     * HTTP_API_EG_DEVICE_CID_QUERY                  = "tuya.industry.base.eg.device.cid.query"
     * HTTP_API_EDGE_IPC_MODIFY_SKILL                = "tuya.industry.base.edge.ipc.modify.skill"
     * HTTP_API_EDGE_FILE_UPLOAD_ALG                 = "tuya.industry.base.edge.file.upload.alg"
     * HTTP_API_DEVICE_IPC_TY_SUB_STORAGE_SECRET_GET = "tuya.device.ipc.ty.sub.storage.secret.get "
     * HTTP_API_EDGE_IPC_QUERY_DETAIL                = "tuya.industry.base.edge.ipc.query.detail"
     * HTTP_DEVICE_IPC_STORAGE_SECRET_GET            = "tuya.device.ipc.storage.secret.get"
     * HTTP_DEVICE_SKILL_UPDATE                      = "tuya.device.skill.update"
     */

    HTTP_API_EG_SYNCDATA_RESULT("tuya.industry.base.eg.syncdata.result.post"),
    HTTP_API_EDGE_GATEWAY_SYNCDATA_RESULT("tuya.industry.base.edge.gateway.syncdata.type.result.post"),
    HTTP_API_EDGE_UPLOAD_TOKEN("tuya.industry.base.edge.file.upload.token"),
    HTTP_API_EDGE_DEVICE_QUERY_ALL("tuya.industry.base.edge.device.query.all"),
    HTTP_API_EG_DEVICE_CID_QUERY("tuya.industry.base.eg.device.cid.query"),
    HTTP_API_EDGE_IPC_MODIFY_SKILL("tuya.industry.base.edge.ipc.modify.skill"),
    HTTP_API_EDGE_FILE_UPLOAD_ALG("tuya.industry.base.edge.file.upload.alg"),
    HTTP_API_DEVICE_IPC_TY_SUB_STORAGE_SECRET_GET("tuya.device.ipc.ty.sub.storage.secret.get"),
    HTTP_API_EDGE_IPC_QUERY_DETAIL("tuya.industry.base.edge.ipc.query.detail"),
    HTTP_DEVICE_IPC_STORAGE_SECRET_GET("tuya.device.ipc.storage.secret.get"),
    HTTP_DEVICE_SKILL_UPDATE("tuya.device.skill.update");

    private String value;

    ReportHttpType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
