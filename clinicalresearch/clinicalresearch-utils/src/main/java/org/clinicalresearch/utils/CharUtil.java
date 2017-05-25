package org.clinicalresearch.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharUtil {

	//正则判断是否是汉字
	public static boolean isChineseChar(String str){
        boolean temp = false;
        Pattern p=Pattern.compile("[\u4e00-\u9fa5]"); 
        Matcher m=p.matcher(str); 
        if(m.find()){ 
            temp =  true;
        }
        return temp;
    }
	//z正则判断是否为数值
	public static boolean isEnNumber(String str){
        boolean temp = false;
        Pattern p=Pattern.compile("^\\d+$"); 
        Matcher m=p.matcher(str); 
        if(m.find()){ 
            temp =  true;
        }
        return temp;
    }
	public static void main(String[] args) {
		String a = "-36";
		boolean enNumber = isEnNumber(a);
		System.out.println(enNumber);
	}
}
