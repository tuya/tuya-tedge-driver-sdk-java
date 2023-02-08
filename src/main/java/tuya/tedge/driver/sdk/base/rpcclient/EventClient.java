package tuya.tedge.driver.sdk.base.rpcclient;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.ByteString;
import tuya.tedge.driver.sdk.base.utils.TimeConst;
import tuya.tedge.driver.sdk.dpmodel.convert.EventConvert;
import tuya.tedge.driver.sdk.base.dto.common.BaseWithIdResponseDto;
import tuya.tedge.driver.sdk.base.convert.CommonConvert;
import tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse;
import tuya.tedge.driver.sdk.dpmodel.dto.event.EventDto;
import tuya.tedge.driver.sdk.dpmodel.dto.event.ResponseDto;
import tuya.tedge.driver.sdk.dpmodel.dto.event.WithoutDpReportDto;
import tuya.tedge.driver.sdk.grpc.event.*;

import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
@Slf4j
public class EventClient {
    private RpcEventGrpc.RpcEventBlockingStub blockingStub;
    private EventConvert eventConvert;
    private CommonConvert commonConvert;

    public EventClient(ManagedChannel channel) {
        this.blockingStub = RpcEventGrpc.newBlockingStub(channel);
        this.eventConvert = new EventConvert();
        this.commonConvert = new CommonConvert();
    }

    public BaseWithIdResponseDto Adds(List<EventDto> eventDtos) {
        try {
            Events events = eventConvert.eventsDto2Rpc(eventDtos);
            BaseWithIdResponse response = blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).add(events);
            return commonConvert.baseWithIdResponseRpc2Dto(response);
        } catch (StatusRuntimeException e) {
            log.error("RPC Add failed:{}" + e.getMessage());
        }
        return null;
    }

    public String HttpReportData(String api, String version, Map<String, Object> payload) {
        log.debug("enter HttpReportData");
        try {
            HttpReport httpReport = HttpReport.newBuilder()
                    .setHttpApi(api)
                    .setVersion(version)
                    .setPayload(ByteString.copyFrom(JSON.toJSONBytes(payload)))
                    .build();
            Response response = blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).httpReportData(httpReport);
            ResponseDto responseDto = eventConvert.responseRpc2Dto(response);
            if (responseDto == null) {
                return null;
            }
            return responseDto.getMessage();
        } catch (StatusRuntimeException e) {
            log.error("RPC HttpReportData failed:{}", e.getMessage());
        }
        return null;
    }

    public void WithoutDpReportDto(WithoutDpReportDto withoutDpReportDto) {
        log.debug("enter WithoutDpReportData");
        WithoutDpReport withoutDpReport = null;
        try {
            withoutDpReport = eventConvert.withoutDpReportDto2Rpc(withoutDpReportDto);
            blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).withoutDpReportData(withoutDpReport);
        } catch (StatusRuntimeException e) {
            log.error("RPC WithoutDpReportDto failed:{}", e.getMessage());
        }
        log.info("report withoutDp data success：{}", withoutDpReport);
    }

}
