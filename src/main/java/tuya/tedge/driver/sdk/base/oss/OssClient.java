package tuya.tedge.driver.sdk.base.oss;

import com.alibaba.fastjson.JSON;

import tuya.tedge.driver.sdk.base.rpcclient.ResourceClient;
import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class OssClient {
    private ResourceClient client;
    private Map<String, ResultNode> cidNodeMap;

    public OssClient(ResourceClient client) {
        this.client = client;
        this.cidNodeMap = new ConcurrentHashMap<>();
    }

    public void start(List<String> cIds) {
        updateCidCosInfoMap(cIds);
    }

    public OssInterface getOssClient(String cid, Integer timeout) {
        if (!paramsCheck(cid)) {
            return null;
        }
        final ResultNode node = getOssInfo(cid);
        switch (node.getProvider()) {
            case "oss":
                return new MyCos(node, timeout);
            default:
                log.error("oss type invalid:{}", node.getProvider());
        }
        return null;
    }

    private ResultNode getOssInfo(String cid) {
        List<String> l = new ArrayList<>();
        l.add(cid);
        if (!updateCidCosInfoMap(l)) {
            return null;
        }
        return this.cidNodeMap.get(cid);
    }


    private Boolean expirationP(ResultNode node) {
        if (node == null) {
            return true;
        }
        //零时时区
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT")).plusMinutes(5);
        //是否过期了
        return gmt.isAfter(ZonedDateTime.parse(node.getExpiration()));
    }

    /**
     * 更新 cidCosInfoMap 信息，同时会检查是否过期，如果没过期则不更新。
     *
     * @param cIds
     * @return
     */
    private Boolean updateCidCosInfoMap(List<String> cIds) {
        if (cIds == null || cIds.isEmpty()) {
            log.error("cid list is null");
            return false;
        }
        List<String> reqCid = new ArrayList<>();
        //检查是否token过期
        cIds.forEach(cid -> {
            ResultNode node = this.cidNodeMap.get(cid);
            if (node != null) {
                if (expirationP(node)) {
                    reqCid.add(cid);
                }
            } else {
                reqCid.add(cid);
            }
        });
        //没有过期，不用更新
        if (reqCid.isEmpty()) {
            return true;
        }
        //更新map
        OssInfo ossInfo = this.getOssInfo(reqCid);
        if (ossInfo == null) {
            return false;
        }
        ossInfo.getResultNodeList().forEach(v -> {
            this.cidNodeMap.put(v.getCid(), v);
        });
        return true;
    }

    private OssInfo getOssInfo(List<String> cIds) {
        //获取数据
        String api = "tuya.device.ty.sub.stor.config.get";
        String version = "2.0";
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("nodeIds", JSON.toJSON(cIds).toString());
        reqBody.put("type", "Motion");
        String resp = client.getEventClient().HttpReportData(api, version, reqBody);
        // atop:http://a1-cn.wgine.com/d.json, api:tuya.device.ty.sub.stor.config.get,
        // gwId:6ce430884b0edcf8a3p3eo, version:2.0, payload:{"nodeIds":"[\"testdahua_ipc_1\"]","type":"Motion"}
        //解析数据
        log.info("resp:{}", resp);
        OssInfo ossInfo = JSON.parseObject(resp, OssInfo.class);
        if (ossInfo == null) {
            log.error("ossInfo is null");
            return null;
        }
        log.info("ossInfo:{}", ossInfo.toString());
        if (!ossInfo.getSuccess()) {
            log.error("get oss fail: errCode:{}, errMsg:{}", ossInfo.getErrorCode(), ossInfo.getErrorMsg());
            return null;
        }
        if (ossInfo.getResultNodeList().isEmpty()) {
            log.error("result list is empty");
            return null;
        }
//        ossInfo.setExpiration(System.currentTimeMillis() + 50 * 60 * 100);
        return ossInfo;
    }

    private Boolean paramsCheck(Object... o) {
        for (Object v : o) {
            if (v != null) {
                continue;
            }
            log.error("params is null");
            return false;
        }
        return true;
    }
}
