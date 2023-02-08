package tuya.tedge.driver.sdk.dpmodel.convert;

import tuya.tedge.driver.sdk.base.convert.CommonConvert;
import tuya.tedge.driver.sdk.dpmodel.dto.command.CmdRequestDto;
import tuya.tedge.driver.sdk.grpc.devicecallback.CmdRequest;

public class CommandConvert {
    private static CommonConvert convert = new CommonConvert();

    public CmdRequestDto cmdRequestRpc2Dto(CmdRequest request) {
        if (request == null) {
            return null;
        }

        return new CmdRequestDto(
                request.getCid(),
                convert.enumTuyaMqttProtocolRpc2Dto(request.getProtocol()),
                request.getS(),
                request.getT(),
                request.getData().toByteArray()
        );
    }
}
