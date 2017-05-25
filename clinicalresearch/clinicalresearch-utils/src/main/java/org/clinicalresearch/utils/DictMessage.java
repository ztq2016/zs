package org.clinicalresearch.utils;

/**
 * 
 * @Class Name DictMessage
 * @author 王康屹
 * @Create In 2016年12月21日
 * @description 封装响应参数
 */
public class DictMessage {
	
	/**接口返回码*/
	public static  String RESULT_SUCCESS = "200";
	public static  String RESULT_PARAM_ERROR = "201";
	public static  String RESULT_FAIL = "202";
	public static  String RESULT_INTERCEPTED = "203";
	public static  String RESULT_EXCEPTION = "500";
	/**接口返回码含义*/
	public static  String MESSAGE_SUCESS = "成功";
	public static  String MESSAGE_PARAM_EOORO = "请求参数不符合规则";
	public static  String MESSAGE_FAIL = "失败";
	public static  String MESSAGE_INTERCEPTED = "异常请求被拦截";
	public static  String MESSAGE_EXCEPTION = "失败";
}
