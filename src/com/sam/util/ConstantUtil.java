package com.sam.util;

/**
 * 定义常量字符串
 * 
 * @author gaohailong
 *
 */
public class ConstantUtil {

	public static final String LOGIN_ERROR = "ERROR";

	public static final String LOGIN_SESSION = "SESSION_ID";

	public static final String SYSTEM_ERROR_MSG = "系统错误";

	public static final String REQUEST_PARAMS_NULL = "请求参数为空";

	public static final String SERVICE_RESPONSE_NULL = "服务端返回结果为空";

	// 服务端返回成功的标志
	public static final String SERVICE_RESPONSE_SUCCESS_CODE = "AMS00000";

	// 服务端返回结果的标志
	public static final String SERVICE_RESPONSE_RESULT_FLAG = "returnCode";

	// 服务端返回结果失败的标志
	public static final String SERVICE_RESPONSE_RESULT_MSG = "errorMsg";

	// 返回给前段页面成功或失败的标志
	public static final String RESPONSE_RESULT_FLAG_ISERROR = "isError";

	// 执行删除操作
	public static final String OPERATION_TYPE_DELETE = "D";
	//返回成功
	public static final String RESPONSE_RESULT_FLAG_ISSUCCESS = "isSuceess";
	
	//默认每页显示条数
	public static final int DEFAULT_PAGE_SIZE = 5;
	
	//默认显示第几页记录
	public static final int DEFAULT_PAGE_NUM = 1;
}
