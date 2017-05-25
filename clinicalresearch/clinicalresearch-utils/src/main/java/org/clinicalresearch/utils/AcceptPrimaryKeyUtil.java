package org.clinicalresearch.utils;

import java.util.UUID;

import org.apache.log4j.Logger;


/**
 * 
 * @Class Name AcceptPrimaryKeyUtil
 * @author 王康屹
 * @Create In 2016年12月21日
 */
public class AcceptPrimaryKeyUtil {
	
	
	private static final Logger logger = Logger.getLogger(AcceptPrimaryKeyUtil.class);
	
	public static String getPrimaryKey(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	
	public static boolean isContain(String str1,String str2) {
		return str1.contains(str2);
	}
	
	public static void main(String[] args) {
		System.out.println(getPrimaryKey());
	}
}
