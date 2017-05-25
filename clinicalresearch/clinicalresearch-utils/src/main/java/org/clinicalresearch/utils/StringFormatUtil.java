package org.clinicalresearch.utils;

public class StringFormatUtil {

	/* 
	 * 自动补零
	 * 
	 * int num 补全几位
	 * 
	 * */
	public static final String str = "";
	
	@SuppressWarnings("static-access")
	public static String FormatNumber(int num, int record ){
		return str.format("%0"+num+"d", record);
	}
	
	
	public static void main(String[] args) {
		String formatNumber = FormatNumber(10, 10);
		System.out.println("formatNumber:"+formatNumber);
	}
}
