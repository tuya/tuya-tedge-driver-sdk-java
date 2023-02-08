package tuya.tedge.driver.sdk.dpmodel.convert;

import com.google.protobuf.ByteString;
import tuya.tedge.driver.sdk.dpmodel.dto.event.*;
import tuya.tedge.driver.sdk.grpc.event.*;

import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Slf4j
public class EventConvert {

    public EventConvert() {

    }

    /**
     * baseReadingDto2Rpc
     *
     * @param dto
     * @return
     */
    private BaseReading baseReadingDto2Rpc(BaseReadingDto dto) {
        if (dto == null) {
            return null;
        }
        BaseReading.Builder baseBuilder = BaseReading.newBuilder()
                .setId(dto.getId())
                .setDpId(dto.getDpId())
                .setDeviceId(dto.getDeviceId())
                .setCreated(dto.getCreated())
                .setProductId(dto.getProductId())
                .setOrigin(dto.getOrigin())
                .setValueType(dto.getValueType());
        SimpleReadingDto simple = dto.getSimpleReadingDto();
        BinaryReadingDto binary = dto.getBinaryReadingDto();
        if (simple != null) {
            return baseBuilder.setSimpleReading(simpleReadingDto2Rpc(simple))
                    .build();
        }
        if (binary != null) {
            return baseBuilder.setBinaryReading(binaryReadingDto2Rpc(binary))
                    .build();
        }
        log.error("both SimpleReadingDto and BinaryReadingDto are null");
        return BaseReading.newBuilder().build();
    }

    /**
     * binaryReadingDto2Rpc
     *
     * @param dto
     * @return
     */
    private BinaryReading binaryReadingDto2Rpc(BinaryReadingDto dto) {
        if (dto == null) {
            return null;
        }
        return BinaryReading.newBuilder()
                .setMediaType(dto.getMediaType())
                .setBinaryValue(ByteString.copyFrom(dto.getBinaryValue()))
                .build();
    }

    /**
     * simpleReadingDto2Rpc
     *
     * @param dto
     * @return
     */
    private SimpleReading simpleReadingDto2Rpc(SimpleReadingDto dto) {
        if (dto == null) {
            return null;
        }
        return SimpleReading.newBuilder()
                .setValue(dto.getValue())
                .build();
    }

    /**
     * event dto to rpc
     *
     * @param eventDtos
     * @return
     */

    public Events eventsDto2Rpc(List<EventDto> eventDtos) {
        if (eventDtos == null) {
            return null;
        }

        Events.Builder builder = Events.newBuilder();
        for (EventDto e : eventDtos) {
            if (e.equals(null)) {
                continue;
            }
            Event.Builder event = Event.newBuilder()
                    .setId(e.getId())
                    .setDeviceId(e.getDeviceId())
                    .setProductId(e.getProductId())
                    .setCreated(e.getCreated())
                    .setOrigin(e.getOrigin());
            for (BaseReadingDto baseDto : e.getBaseReadingDtoList()) {
                event.addReadings(baseReadingDto2Rpc(baseDto));
            }
            builder.addMultiEvents(event);
        }
        return builder.build();
    }

    /**
     * httpReport dto to rpc
     *
     * @param dto
     * @return
     */
    public HttpReport httpReportDto2Rpc(HttpReportDto dto) {
        if (dto == null) {
            return null;
        }
        return HttpReport.newBuilder()
                .setHttpApi(dto.getHttpApi())
                .setVersion(dto.getVersion())
                .setPayload(ByteString.copyFrom(dto.getPayload()))
                .build();
    }

    /**
     * withoutDpReport dto to rpc
     *
     * @param dto
     * @return
     */
    public WithoutDpReport withoutDpReportDto2Rpc(WithoutDpReportDto dto) {
        if (dto == null) {
            return null;
        }
        return WithoutDpReport.newBuilder()
                .setTopic(dto.getTopic())
                .setProtocol(dto.getProtocol())
                .setS(dto.getS())
                .setT(dto.getT())
                .setData(ByteString.copyFrom(dto.getData()))
                .build();
    }

    public ResponseDto responseRpc2Dto(Response response) {
        if (response == null) {
            return null;
        }
        return new ResponseDto(response.getMessage());
    }
}
