package com.example.mybatis.util;

import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * SHA256加密工具类
 */
public class SHA256Util {

    /**
     * SHA256加密
     * @param source
     * @return
     */
    public static String encodeSHA256(String source){
        String target = "";
        if (StringUtils.isEmpty(source)){
            return target;
        }

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(source.getBytes("UTF-8"));
            target = byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return target;
    }

    /**
     * 将byte转为16进制
     * @param bytes 字节数组
     * @return
     */
    private static String byte2Hex(byte[] bytes){
        StringBuffer result = new StringBuffer();
        String temp;
        for (int n = 0; n < bytes.length; n++){
            temp = Integer.toHexString(bytes[n] & 0xFF);
            if (temp.length()==1){
                // 1得到一位的进行补0操作
                result.append("0");
            }
            result.append(temp);
        }
        return result.toString().toUpperCase();
    }
}
