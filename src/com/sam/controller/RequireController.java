package com.sam.controller;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetRequire;
import com.sam.entity.AssetRequiresSearch;
import com.sam.entity.Pager;
import com.sam.service.RequireService;
import com.sam.util.ConstantUtil;
import com.sam.util.ExportExcelUtil;

/**
 * 设备修理时候的controller
 * @author yty
 *
 */
@Controller
@RequestMapping(value="/requireController")
public class RequireController {
	private AssetRequiresSearch assetRequiresSearch = null;

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
			@RequestParam(value="ardaynum", required = false) String ardaynum,
			@RequestParam(value="arstatus", required = false) String arstatus,
			@RequestParam(value="page", required = false) Integer page
			) {
		try {
			System.out.println("进入findAssetquires");
			Integer beginDay = null;
			Integer endDay = null;
			System.out.println("ardaynum:"+ardaynum);
			if(ardaynum != null && ardaynum !="") {
				beginDay = Integer.parseInt(ardaynum.split("-")[0]);
				endDay = Integer.parseInt(ardaynum.split("-")[1]);
			}
			
			assetRequiresSearch = new AssetRequiresSearch();
			if(beginDay != null && !"".equals(beginDay)) {
				assetRequiresSearch.setBeginDay(beginDay);
			}
			if(endDay != null && !"".equals(endDay)) {
				assetRequiresSearch.setEndDay(endDay);
			}
			if(arstatus != null && arstatus != "") {
				assetRequiresSearch.setRepairStatus(arstatus);
			}
			Pager<AssetRequire> requirePager = requireService.findAssetRequires(assetRequiresSearch, page, ConstantUtil.DEFAULT_PAGE_SIZE);
			return requirePager;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value="/exportProject", method = RequestMethod.POST)
	 public void exportProject(HttpServletResponse response, String export) {
	  try {
		  System.out.println("export:"+export);
		 // export = "项目名称#artime,天数#arday";
		  String[] excelHeader = export.split(",");
		 
		  assetRequiresSearch = new AssetRequiresSearch();
		  assetRequiresSearch.setBeginDay(1);
		  List<AssetRequire> projectList = requireService.findAssetRequiresNofenye(assetRequiresSearch);
		  for (AssetRequire assetRequire : projectList) {
			System.out.println(assetRequire.getArid());
		}
		  ExportExcelUtil.export(response, "维修表", excelHeader, projectList);
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 }

	
}
