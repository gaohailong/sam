package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetChange;
import com.sam.entity.AssetChartUtils;
import com.sam.entity.AssetInfo;
import com.sam.entity.Pager;
import com.sam.service.ChangeService;
import com.sam.service.InfoService;

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
	@Autowired
	private InfoService infoSerice;
	
	/**
	 * 增加一条移交记录 
	 * @param change
	 * @return
	 */
	@RequestMapping(value="/addChange",method=RequestMethod.POST)
	@ResponseBody
	public List<AssetChartUtils> addChange(String acname,String adname,String aiidStr){
		
		return null;
	}
	
	@RequestMapping(value="/findInfoNumByAtname",method=RequestMethod.POST)
	@ResponseBody
	public int findInfoNumByAtname(String atname){
		int num = 0;
		try {
			num = infoSerice.findInfoNumByAtname(atname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return num;
	}
	
	@RequestMapping(value="/findInfoByAtname",method=RequestMethod.POST)
	@ResponseBody
	public List<AssetInfo> findInfoByAtname(String atname,Integer atnum){
		try {
			System.out.println("atname"+atname+"num"+atnum);
			
			List<AssetInfo> infoList = infoSerice.findInfoByAtname(atname);
			Pager<AssetInfo> pager = new Pager<AssetInfo>(1,atnum,infoList);
			System.out.println(pager.getDataList());
			return pager.getDataList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
