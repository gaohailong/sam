package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody
	public int addRequest(
			@RequestParam(value = "aiidStr",required = false) String aiidStr,
			@RequestParam(value = "artime",required = false) String artime,
			@RequestParam(value = "arday",required = false) Integer arday,
			@RequestParam(value = "arperson",required = false) String arperson,
			@RequestParam(value = "arphone",required = false) String arphone
			){
		System.out.println("进入了");
		AssetRequire require = new AssetRequire();
		require.setArday(arday);
		require.setArtime(artime);
		require.setArperson(arperson);
		require.setArphone(arphone);
		int num = 0;
		try {
			 num = requireService.addRequire(aiidStr,require);
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	
}
