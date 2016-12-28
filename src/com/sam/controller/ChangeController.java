package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sam.entity.AssetChange;
import com.sam.service.ChangeService;

/**
 * 移交表的controller
 * @author yty
 *
 */
@Controller
public class ChangeController {

	@Autowired
	private ChangeService changeService;
	
	/**
	 * 增加一条移交记录 
	 * @param change
	 * @return
	 */
	@RequestMapping("/addChange")
	public String addChange(AssetChange change){
		try {
			int num = changeService.addChange(change);
			if(num>0){
				return "正确的页面";
			}
			return "错误的页面";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "exception";
		}
	}
}
