package tuya.tedge.driver.sdk.base.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class ByteConvert {
    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] toByteArray(Object obj) {
        byte[] bytes = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            oos.flush();
            bytes = bos.toByteArray();
            oos.close();
            bos.close();
        } catch (IOException ex) {
            PrintException.printStack(ex);
        }
        return bytes;
    }


    /**
     * 文件转[]byte
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static byte[] file2byte(String filename) throws IOException {
        File f = new File(filename);
        if (!f.exists()) {
            throw new FileNotFoundException(filename);
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream((int) f.length());
        BufferedInputStream in = null;
        final byte[] bytes = bos.toByteArray();
        log.info("{}", bytes);
        try {
            in = new BufferedInputStream(new FileInputStream(f));
            int buf_size = 1024;
            byte[] buffer = new byte[buf_size];
            int len = 0;
            while (-1 != (len = in.read(buffer, 0, buf_size))) {
                bos.write(buffer, 0, len);
            }
            return bos.toByteArray();
        } catch (IOException e) {
            PrintException.printStack(e);
            throw e;
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                PrintException.printStack(e);
            }
            bos.close();
        }
    }

    /**
     * 存文件
     *
     * @param path
     * @param data
     */
    public static void bytesToFile(String path, byte[] data) {
        FileOutputStream fos = null;
        try {
            File file = new File(path);
            fos = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            fos.write(data);
        } catch (Exception e) {
            PrintException.printStack(e);
        } finally {
            try {
                if (fos != null) {
                    fos.flush();
                    fos.close();
                }
            } catch (Exception e) {
                PrintException.printStack(e);
            }
        }
    }

    /**
     * bytes 转 16 进制
     *
     * @param bytes
     * @return
     */
    public static String bytesToHexString(byte[] bytes) {
        char[] buf = new char[bytes.length * 2];
        int index = 0;
        for (byte b : bytes) {
            buf[index++] = HEX_CHAR[b >>> 4 & 0xf];
            buf[index++] = HEX_CHAR[b & 0xf];
        }
        return new String(buf);
    }

    /**
     * 16进制字符串 装 bytes
     *
     * @param str
     * @return
     */
    public static byte[] hexStringToBytes(String str) {
        if (str == null || str.trim().equals("")) {
            return new byte[0];
        }

        byte[] bytes = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            String subStr = str.substring(i * 2, i * 2 + 2);
            bytes[i] = (byte) Integer.parseInt(subStr, 16);
        }

        return bytes;
    }

}
