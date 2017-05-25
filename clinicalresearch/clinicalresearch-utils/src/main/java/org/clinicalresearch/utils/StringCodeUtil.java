package org.clinicalresearch.utils;

import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;

public class StringCodeUtil {
	
	private static Logger logger = Logger.getLogger(StringCodeUtil.class);
	
	public static String toUTF(String source){
		return formatString(source, FormatCodeDict.UTF);
	}
	
	public static String toGBK(String source){
		return formatString(source, FormatCodeDict.GBK);
	}
	
	public static String toISO8859(String source){
		return formatString(source, FormatCodeDict.ISO8859);
	}
	
	private static String formatString(String source,String format){
		try {
			return new String(source.getBytes(format),format);
		} catch (UnsupportedEncodingException e) {
			logger.error("转码方法异常", e);
			return null;
		}
	}
	
	
    /**
     * 将数字转换为相应的英文
     * 
     * @return
     */
    public static String changeNumToEnLing(String num)
    {
        StringBuffer cn = new StringBuffer();
        int numLength = num.length();
        char temp = '0';
        for (int i = 0; i < numLength; i++ )
        {
            temp = num.charAt(i);
            switch (temp)
            {
                case '0':
                    cn.append("A");
                    break;
                case '1':
                    cn.append("B");
                    break;
                case '2':
                    cn.append("C");
                    break;
                case '3':
                    cn.append("D");
                    break;
                case '4':
                    cn.append("E");
                    break;
                case '5':
                    cn.append("F");
                    break;
                case '6':
                    cn.append("G");
                    break;
                case '7':
                    cn.append("H");
                    break;
                case '8':
                    cn.append("I");
                    break;
                case '9':
                    cn.append("J");
                    break;
                default:
                    break;
            }
        }
        return cn.toString();
    }
	
	public static void main(String[] args) {
		String ss = "测试呢--TEST--";
		System.out.println("UTF-8:"+toUTF(ss));
		System.out.println("GBK:"+toGBK(ss));
		System.out.println("ISO8859-1:"+toISO8859(ss));
	}
	
	

}
