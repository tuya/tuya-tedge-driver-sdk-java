package tuya.tedge.driver.sdk.base.rpcclient;

import tuya.tedge.driver.sdk.base.convert.AlertConvert;
import tuya.tedge.driver.sdk.base.dto.alert.AlertReportReqDto;
import tuya.tedge.driver.sdk.base.dto.alert.AlertReportRespDto;
import tuya.tedge.driver.sdk.base.utils.TimeConst;
import tuya.tedge.driver.sdk.grpc.alert.AlertReportReq;
import tuya.tedge.driver.sdk.grpc.alert.AlertReportResp;
import tuya.tedge.driver.sdk.grpc.alert.AlertReportServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class AlertClient {
    private AlertReportServiceGrpc.AlertReportServiceBlockingStub blockingStub;
    private AlertConvert alertConvert;

    public AlertClient(ManagedChannel channel) {
        this.blockingStub = AlertReportServiceGrpc.newBlockingStub(channel);
        this.alertConvert = new AlertConvert();
    }

    public AlertReportRespDto AlertReport(AlertReportReqDto reqDto) {
        AlertReportRespDto respDto = null;
        try {
            AlertReportReq req = alertConvert.alertReportReqDto2Rpc(reqDto);
            final AlertReportResp resp = blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).alertReport(req);
            respDto = alertConvert.alertReportRespRpc2Dto(resp);
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
            return respDto;
        }
        return respDto;
    }

}
