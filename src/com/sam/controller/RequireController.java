package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sam.entity.AssetRequire;
import com.sam.service.RequireService;

/**
 * 设备修理时候的controller
 * @author yty
 *
 */
@Controller
@RequestMapping(value="/requireController")
public class RequireController {

	@Autowired
	private RequireService requireService;
	
	/**
	 * 向设备修理表增加一条记录
	 * @param require
	 * @return
	 */
	@RequestMapping(value="/addRequest",method=RequestMethod.POST)
	public String addRequest(AssetRequire require){
		try {
			int num = requireService.addRequire(require);
			if(num>0){
				return "成功的页面";
			}
			return "失败的页面";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "exception";
		}
	}
}
