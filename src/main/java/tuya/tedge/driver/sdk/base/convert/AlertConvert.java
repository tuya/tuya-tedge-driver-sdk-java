package tuya.tedge.driver.sdk.base.convert;

import tuya.tedge.driver.sdk.base.dto.alert.AlertReportReqDto;
import tuya.tedge.driver.sdk.base.dto.alert.AlertReportRespDto;
import tuya.tedge.driver.sdk.grpc.alert.AlertLevel;
import tuya.tedge.driver.sdk.grpc.alert.AlertReportReq;
import tuya.tedge.driver.sdk.grpc.alert.AlertReportResp;

public class AlertConvert {
    public AlertReportReq alertReportReqDto2Rpc(AlertReportReqDto reqDto) {
        if (reqDto == null) {
            return null;
        }

        return AlertReportReq.newBuilder()
                .setId(reqDto.getId())
                .setVersion(reqDto.getVersion())
                .setServiceName(reqDto.getServiceName())
                .setAlertType(reqDto.getAlertType())
                .setAlertLevel(alertLevelDto2Rpc(reqDto.getAlertLevel()))
                .setT(reqDto.getT())
                .setContent(reqDto.getContent())
                .build();
    }

    public AlertReportRespDto alertReportRespRpc2Dto(AlertReportResp resp) {
        if (resp == null) {
            return null;
        }
        return new AlertReportRespDto(resp.getId(), resp.getStatusCode(), resp.getMessage());
    }

    private AlertLevel alertLevelDto2Rpc(tuya.tedge.driver.sdk.base.model.AlertLevel dto) {
        if (dto == null) {
            return null;
        }
        return AlertLevel.valueOf(dto.getValue());
    }

}
