package tuya.tedge.driver.sdk.base.encrypt;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import tuya.tedge.driver.sdk.base.utils.PrintException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EncryptUtils {

    private static final String DEFAULT_ALGORITHM = "AES";
    private static final String DEFAULT_FULL_ALGORITHM = "AES/CBC/PKCS5Padding";

    /**
     * 加密
     *
     * @param key ,16位
     * @return
     */
    public static byte[] encrypt(byte[] key, byte[] data) {
        try {
            byte[] iv = getIv();
            Cipher cipher = initAESCipher(iv, key, Cipher.ENCRYPT_MODE);
            byte[] encrypted = cipher.doFinal(data);
            ByteBuffer bb = ByteBuffer.wrap(new byte[64 + encrypted.length]);
            ByteBuffer versionBuf = ByteBuffer.wrap(new byte[4]);
            versionBuf.asCharBuffer().put('1');
            //版本 4
            bb.put(versionBuf);
            //iv 16
            bb.put(iv);
            ByteBuffer lengthBuf = ByteBuffer.wrap(new byte[4]);
            lengthBuf.asIntBuffer().put(encrypted.length);

            //元数据长度 4
            bb.put(lengthBuf);
            //保留 40
            bb.put(new byte[40]);
            //加密内容
            bb.put(encrypted);
            byte[] ret = bb.array();
            return ret;
        } catch (Exception e) {
            PrintException.printStack(e);
        }
        return null;
    }

    //解密
    public static byte[] decrypt(byte[] key, byte[] encrypted) {
        try {
            if (encrypted.length < 64) {
                log.error("Decrypted Fail");
                return null;
            }
            ByteBuffer bb = ByteBuffer.wrap(new byte[encrypted.length]);
            bb.put(encrypted);
            bb.rewind();
            byte[] version = new byte[4];
            bb.get(version);

            byte[] iv = new byte[16];
            bb.get(iv);

            byte[] length = new byte[4];
            bb.get(length);
            Integer value = (int) (((length[0] & 0xFF) << 24)
                    | ((length[0 + 1] & 0xFF) << 16)
                    | ((length[0 + 2] & 0xFF) << 8)
                    | (length[0 + 3] & 0xFF));

            log.info("{}", value);
            byte[] reserve = new byte[40];
            bb.get(reserve);
            byte[] data = new byte[encrypted.length - 64];
            bb.get(data);
            Cipher cipher = initAESCipher(iv, key, Cipher.DECRYPT_MODE);
            return cipher.doFinal(data);
        } catch (Exception e) {
            PrintException.printStack(e);
        }
        return null;
    }

    public static File decryptFile(byte[] key, InputStream in, File destFile) {
        FileOutputStream out = null;
        try {
            if (!destFile.getParentFile().exists()) {
                destFile.getParentFile().mkdirs();
            }
            destFile.createNewFile();
            out = new FileOutputStream(destFile);

            byte[] iv = new byte[16];
            in.skip(4);
            int read = in.read(iv);
            if (read != 16) {
                throw new IOException("iv length error");
            }
            in.skip(44);
            Cipher cipher = initAESCipher(iv, key, Cipher.DECRYPT_MODE);
            CipherOutputStream cipherOutputStream = new CipherOutputStream(out, cipher);
            byte[] buffer = new byte[1024];
            int r;
            while ((r = in.read(buffer)) >= 0) {
                cipherOutputStream.write(buffer, 0, r);
            }
            cipherOutputStream.close();
        } catch (Exception e) {
            PrintException.printStack(e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                PrintException.printStack(e);
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                PrintException.printStack(e);
            }
        }
        return destFile;
    }

    private static Cipher initAESCipher(byte[] iv, byte[] sKey, int cipherMode) {
        try {
            IvParameterSpec zeroIv = new IvParameterSpec(iv);
            SecretKeySpec key = new SecretKeySpec(sKey, DEFAULT_ALGORITHM);
            Cipher cipher = Cipher.getInstance(DEFAULT_FULL_ALGORITHM);
            cipher.init(cipherMode, key, zeroIv);
            return cipher;
        } catch (NoSuchAlgorithmException e) {
            PrintException.printStack(e);
        } catch (NoSuchPaddingException e) {
            PrintException.printStack(e);
        } catch (InvalidKeyException e) {
            PrintException.printStack(e);
        } catch (InvalidAlgorithmParameterException e) {
            PrintException.printStack(e);
        }
        return null;
    }

    public static byte[] getIv() {
        StringBuilder uid = new StringBuilder();
        //产生16位的强随机数
        Random rd = new SecureRandom();
        for (int i = 0; i < 16; i++) {
            //产生0-2的3位随机数
            int type = rd.nextInt(3);
            switch (type) {
                case 0:
                    //0-9的随机数
                    uid.append(rd.nextInt(10));
                    break;
                case 1:
                    //ASCII在65-90之间为大写,获取大写随机
                    uid.append((char) (rd.nextInt(25) + 65));
                    break;
                case 2:
                    //ASCII在97-122之间为小写，获取小写随机
                    uid.append((char) (rd.nextInt(25) + 97));
                    break;
                default:
                    break;
            }
        }
        return uid.toString().getBytes();
    }
}