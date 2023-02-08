package tuya.tedge.driver.sdk.base.convert;

import lombok.extern.slf4j.Slf4j;
import tuya.tedge.driver.sdk.base.dto.common.BaseSearchConditionQueryDto;
import tuya.tedge.driver.sdk.base.dto.common.BaseWithIdResponseDto;
import tuya.tedge.driver.sdk.base.dto.common.MqttProtocolType;
import tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery;
import tuya.tedge.driver.sdk.grpc.common.BaseWithIdResponse;
import tuya.tedge.driver.sdk.grpc.common.EnumTUYAMQTTProtocol;

@Slf4j
public class CommonConvert {

    public CommonConvert() {
    }

//    public PongDto pongRpc2Dto(Pong pong) {
//        if (pong == null) {
//            return null;
//        }
//        return new PongDto(pong.getTimestamp());
//    }
//
//    public VersionResponseDto versionResponseRpc2Dto(VersionResponse response) {
//        if (response == null) {
//            return null;
//        }
//        return new VersionResponseDto(response.getVersion());
//    }

    public BaseWithIdResponseDto baseWithIdResponseRpc2Dto(BaseWithIdResponse response) {
        if (response == null) {
            return null;
        }
        return new BaseWithIdResponseDto(response.getIdList().toArray(new String[0]));
    }

    public BaseSearchConditionQuery baseSearchConditionQueryDto2Rpc(BaseSearchConditionQueryDto dto) {
        if (dto == null) {
            return null;
        }
        BaseSearchConditionQuery.Builder builder = BaseSearchConditionQuery.newBuilder();
        if (dto.getIsAll() != null) {
            builder.setIsAll(dto.getIsAll());
        }
        if (dto.getPage() != null) {
            builder.setPage(dto.getPage());
        }
        if (dto.getPageSize() != null) {
            builder.setPageSize(dto.getPageSize());
        }
        if (dto.getId() != null) {
            builder.setId(dto.getId());
        }
        if (dto.getIds() != null) {
            builder.setIds(dto.getIds());
        }
        if (dto.getLikeId() != null) {
            builder.setLikeId(dto.getLikeId());
        }
        if (dto.getName() != null) {
            builder.setName(dto.getName());
        }
        if (dto.getNameLike() != null) {
            builder.setName(dto.getNameLike());
        }
        return builder.build();
    }

    public MqttProtocolType enumTuyaMqttProtocolRpc2Dto(EnumTUYAMQTTProtocol protocol) {
        return MqttProtocolType.typeOfValue(protocol.getNumber());
    }
}
