package com.sam.controller;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sam.util.ConstantUtil;

/**
 * 基本的控制器
 * 
 * @author gaohailong
 *
 */
@Controller
public class BaseController {
	/**
	 * 将String转换为json
	 *
	 * @param message
	 * @return
	 * @throws JsonProcessingException
	 */
	public String responseStringToJson(String message)
			throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return message = mapper.writeValueAsString(message);
	}

	/**
	 * 返回成功
	 *
	 * @param obj
	 *            输出对象
	 * @return 输出成功的JSON格式数据
	 */
	public String responseSuccess(String errorMsg) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put(ConstantUtil.RESPONSE_RESULT_FLAG_ISSUCCESS, true);
		jsonObj.put(ConstantUtil.SERVICE_RESPONSE_RESULT_MSG, errorMsg);
		return jsonObj.toString();
	}

	/**
	 * 返回失败
	 *
	 * @param errorMsg
	 *            错误信息
	 * @return 输出失败的JSON格式数据
	 */
	public String responseFail(String errorMsg) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put(ConstantUtil.RESPONSE_RESULT_FLAG_ISERROR, true);
		jsonObj.put(ConstantUtil.SERVICE_RESPONSE_RESULT_MSG, errorMsg);
		return jsonObj.toString();
	}
}
