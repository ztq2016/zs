package org.clinicalresearch.utils;

import java.security.MessageDigest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * 
 * @Class Name MD5
 * @author 王康屹
 * @Create In 2016年12月21日
 * @description MD5工具类
 */
public class MD5 {

    private static final Logger logger = Logger.getLogger(MD5.class);
    
    private static final int SIZE = 2;
    private static final int KeyConstant = 64;
    private static final int CORPSCHAR = 0xff;

    private static String toHex(byte[] bytesArray) {
        StringBuffer sb = new StringBuffer(KeyConstant);
        String str = "";
        for (byte b : bytesArray) {
            str = Integer.toHexString(b & CORPSCHAR);
            if (str.length() < SIZE) {
                sb.append('0');
            }
            sb.append(str);
        }
        return sb.toString();
    }

    
    /**
     * 
     * @Create 2016年12月21日
     * By 王康屹
     * @return String
     * @description MD5加密
     */
    public static String encode(String s) {
        try {
            if (StringUtils.isBlank(s)) {
                return null;
            }
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            return toHex(md.digest());
        } catch (Exception e) {
            logger.error("####### MD5加密异常", e);
        }
        return null;
    }
    
}
