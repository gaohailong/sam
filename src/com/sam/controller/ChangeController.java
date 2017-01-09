package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetChange;
import com.sam.service.ChangeService;

/**
 * 移交表的controller
 * @author yty
 *
 */
@Controller
@RequestMapping(value="/changeController")
public class ChangeController {

	@Autowired
	private ChangeService changeService;
	
	/**
	 * 增加一条移交记录 
	 * @param change
	 * @return
	 */
	@RequestMapping(value="/addChange",method=RequestMethod.POST)
	@ResponseBody
	public int addChange(AssetChange change,String infoStr,String numStr){
		int num = 0;
		try {
			num = changeService.addChange(change,infoStr,numStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return num;
	}
}
