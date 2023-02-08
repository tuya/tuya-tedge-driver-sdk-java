package tuya.tedge.driver.sdk.base.convert;

import tuya.tedge.driver.sdk.base.model.GatewayInfo;
import tuya.tedge.driver.sdk.base.model.GatewayModel;
import tuya.tedge.driver.sdk.grpc.gateway.GateWayInfoResponse;

public class GatewayConvert {
    public GatewayInfo gateWayInfoResponseRpc2Model(GateWayInfoResponse resp) {
        if (resp == null) {
            return null;
        }
        GatewayModel gatewayModel;
        if (resp.getIsNewModel()) {
            gatewayModel = GatewayModel.ThingModel;
        } else {
            gatewayModel = GatewayModel.DpModel;
        }

        //resp.
        return new GatewayInfo(
                resp.getGwId(),
                resp.getLocalKey(),
                resp.getEnv(),
                resp.getRegion(),
                gatewayModel,
                resp.getCloudState(),
                resp.getGatewayName());
    }
}
