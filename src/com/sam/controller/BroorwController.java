package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.controller.BaseController;
import com.sam.entity.AssetBroorw;
import com.sam.entity.Pager;
import com.sam.service.BroorwService;
import com.sam.util.ConstantUtil;

/**
 * 设备借出申请控制器
 * @author zhw
 *
 */
@Controller
@RequestMapping(value="/broorw")
public class BroorwController extends BaseController{
	
	@Autowired
	private BroorwService broorwService;

	/**
	 * 普通用户提交借出申请
	 * @author zhw
	 * @param assetBroorw
	 * @return
	 */
	@RequestMapping(value="addBroorw",method=RequestMethod.POST)
	@ResponseBody
	public int addBroorw(
			@RequestParam(value = "auname", required = false) String auname,
			@RequestParam(value = "abbackDate", required = false) String abbackDate,
			@RequestParam(value = "adname", required = false) String adname,
			@RequestParam(value = "abreson", required = false) String abreson,
			@RequestParam(value = "aiidStr", required = false) String aiidStr
			){
		System.out.println("sssssssssssssssssssssssssss"+auname);

		System.out.println(abbackDate);

		System.out.println(adname);

		System.out.println(abreson);

		System.out.println(aiidStr);
		try {
			AssetBroorw broorw = new AssetBroorw();
			broorw.setAuname(auname);
			broorw.setAbbackdate(abbackDate);
			broorw.setAdname(adname);
			broorw.setAbreson(abreson);
			
			int num = broorwService.addBroow(broorw,aiidStr);
			return num;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	/**
	 * 分页遍历借出申请
	 * @author zhw
	 * @param page
	 * @return
	 */
	public Pager<AssetBroorw> findBroorws(Integer page) {
		
		try {
			int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
			if(page != null) {
				pageNum = page;
			}
			int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
			Pager<AssetBroorw> broorwResult = broorwService.findBroorws(pageNum, pageSize);
			return broorwResult;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
