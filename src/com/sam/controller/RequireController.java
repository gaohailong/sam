package com.sam.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetRequire;
import com.sam.entity.Pager;
import com.sam.service.RequireService;
import com.sam.util.ConstantUtil;

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
	
	/**
	 * @author zhw
	 * 动态多条件查询维修单表
	 * @param artime
	 * @param arday
	 * @param arstatus
	 * @param page
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/findAssetquires", method = RequestMethod.POST)
	public Pager<AssetRequire> findAssetquires(
			@RequestParam(value="artime", required = false) String artime,
			@RequestParam(value="arday", required = false) Integer arday,
			@RequestParam(value="arstatus", required = false) String arstatus,
			@RequestParam(value="page", required = false) Integer page
			) {
		try {
			AssetRequire require = new AssetRequire();
			require.setArtime(artime);
			require.setArstatus(arstatus);
			require.setArday(arday);
			Pager<AssetRequire> requirePager = requireService.findAssetRequires(require, page, ConstantUtil.DEFAULT_PAGE_SIZE);
			return requirePager;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
