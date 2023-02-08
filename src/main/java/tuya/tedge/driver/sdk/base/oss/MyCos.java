package tuya.tedge.driver.sdk.base.oss;

import com.alibaba.fastjson.JSON;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicSessionCredentials;
import com.qcloud.cos.model.*;
import com.qcloud.cos.region.Region;
import tuya.tedge.driver.sdk.base.utils.ByteConvert;
import tuya.tedge.driver.sdk.base.utils.PrintException;
import tuya.tedge.driver.sdk.dpmodel.model.OssResult;
import tuya.tedge.driver.sdk.base.encrypt.EncryptUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.util.Strings;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
@Slf4j
@Data
public class MyCos implements OssInterface {
    private ResultNode node;
    private COSClient client;

    public MyCos(ResultNode node, Integer timeout) {
        this.node = node;
        this.client = client(timeout);
    }

    private COSClient client(Integer timeout) {
        if (node == null) {
            return null;
        }
        if (this.client != null) {
            return this.client;
        }
        //1 传入获取到的临时密钥 (tmpSecretId, tmpSecretKey, sessionToken)
        BasicSessionCredentials cred = new BasicSessionCredentials(this.node.getAk(), this.node.getSk(), this.node.getToken());
        // 2 设置 bucket 的地域, COS 地域的简称请参阅 https://cloud.tencent.com/document/product/436/6224
        // clientConfig 中包含了设置 region, https(默认 http), 超时, 代理等 set 方法, 使用可参阅源码或者常见问题 Java SDK 部分
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setRegion(new Region(this.node.getRegion()));

        // 设置请求协议, http 或者 https
        // 5.6.53 及更低的版本，建议设置使用 https 协议
        // 5.6.54 及更高版本，默认使用了 https
//        clientConfig.setHttpProtocol(HttpProtocol.https);

        // 以下的设置，是可选的：
        // 设置 socket 读取超时，默认 30s
        clientConfig.setSocketTimeout(30 * 1000);
        // 设置建立连接超时，默认 30s
        clientConfig.setConnectionTimeout(timeout);

        // 如果需要的话，设置 http 代理，ip 以及 port
//        clientConfig.setHttpProxyIp("httpProxyIp");
//        clientConfig.setHttpProxyPort(80);
        // 3 生成 cos 客户端
        return new COSClient(cred, clientConfig);
    }

//    public TransferManager createTransferManager(OssInfo ossInfo) {
//        // 创建一个 COSClient 实例，这是访问 COS 服务的基础实例。
//        // 详细代码参见本页: 简单操作 -> 创建 COSClient
//        if (this.cosClient == null) {
//            createCOSClient(ossInfo);
//        }
//        // 自定义线程池大小，建议在客户端与 COS 网络充足（例如使用腾讯云的 CVM，同地域上传 COS）的情况下，设置成16或32即可，可较充分的利用网络资源
//        // 对于使用公网传输且网络带宽质量不高的情况，建议减小该值，避免因网速过慢，造成请求超时。
////        ExecutorService threadPool = Executors.newFixedThreadPool(8);
//
//        // 传入一个 threadpool, 若不传入线程池，默认 TransferManager 中会生成一个单线程的线程池。
//        TransferManager transferManager = new TransferManager(this.cosClient);
//
//        // 设置高级接口的配置项
//        // 分块上传阈值和分块大小分别为 5MB 和 1MB
//        TransferManagerConfiguration transferManagerConfiguration = new TransferManagerConfiguration();
//        transferManagerConfiguration.setMultipartUploadThreshold(5 * 1024 * 1024);
//        transferManagerConfiguration.setMinimumUploadPartSize(1 * 1024 * 1024);
//        transferManager.setConfiguration(transferManagerConfiguration);
//
//        return transferManager;
//    }

//    public Upload putObject(Object object) {
//// 这里创建一个 ByteArrayInputStream 来作为示例，实际中这里应该是您要上传的 InputStream 类型的流
//        long inputStreamLength = 1024 * 1024;
//        byte data[] = new byte[(int) inputStreamLength];
//        InputStream inputStream = new ByteArrayInputStream(data);
//
//        ObjectMetadata objectMetadata = new ObjectMetadata();
//// 上传的流如果能够获取准确的流长度，则推荐一定填写 content-length
//// 如果确实没办法获取到，则下面这行可以省略，但同时高级接口也没办法使用分块上传了
//        objectMetadata.setContentLength(inputStreamLength);
//
//        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, inputStream, objectMetadata);
//
//        try {
//            // 高级接口会返回一个异步结果Upload
//            // 可同步地调用 waitForUploadResult 方法等待上传完成，成功返回UploadResult, 失败抛出异常
//            Upload upload = transferManager.upload(putObjectRequest);
//            UploadResult uploadResult = upload.waitForUploadResult();
//        } catch (CosServiceException e) {
//            e.printStackTrace();
//        } catch (CosClientException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void shutdown() {
//        // 指定参数为 true, 则同时会关闭 transferManager 内部的 COSClient 实例。
//        // 指定参数为 false, 则不会关闭 transferManager 内部的 COSClient 实例。
//        this.transferManager.shutdownNow(true);
//    }

    public void shutdown() {
        if (this.client == null) {
            return;
        }
        this.client.shutdown();
        this.client = null;
    }

    @Override
    public OssResult uploadFile(String name, byte[] data) {
        // 指定文件将要存放的存储桶
        try {
            String bucketName = this.node.getBucket();
            // 指定文件上传到 COS 上的路径，即对象键。例如对象键为folder/picture.jpg，则表示将文件 picture.jpg 上传到 folder 路径下
            String[] split = Strings.split(this.node.getPathConfig().getDetect(), '/');
            String key = String.join("/", String.join("/", split), name);
            log.info("path:{}", key);
            //加密
            byte[] skey = EncryptUtils.getIv();
            byte[] encrypted = EncryptUtils.encrypt(skey, data);
            String skeyStr = ByteConvert.bytesToHexString(skey);
            log.info("skeyStr:{}", skeyStr);

            //发送
            InputStream inputStream = new ByteArrayInputStream(encrypted);
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.setContentLength(encrypted.length);
            PutObjectRequest respResult = new PutObjectRequest(bucketName, key, inputStream, objectMetadata);
            final PutObjectResult result = this.client.putObject(respResult);
            log.info("put result:{}", result.toString());
            //清理
            inputStream.close();
            shutdown();
            //返回
            UploadResponse upload = new UploadResponse(
                    bucketName,
                    key,
                    skeyStr,
                    System.currentTimeMillis() / 1000 + this.node.getLifeCycle()
            );
            String fileId = name + System.currentTimeMillis() + "temp.jpg";
            return new OssResult(fileId, JSON.toJSONString(upload));
        } catch (Exception e) {
            PrintException.printStack(e);
            return null;
        }
    }


}
