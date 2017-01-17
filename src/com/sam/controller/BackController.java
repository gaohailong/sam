package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetBack;
import com.sam.service.BackService;


/**
 * 归还
 * @author zhw
 *
 */
@Controller
@RequestMapping(value="/back")
public class BackController {
	
	@Autowired
	private BackService backService;

	@ResponseBody
	@RequestMapping(value="/addAssetBack")
	public String addAssetBack(int abid, String abdeluser) {
		try {
			AssetBack assetBack = new AssetBack();
			if(abdeluser != null && !"".equals(abdeluser)) {
				assetBack.setAbdeluser(abdeluser);
			}
			int num = backService.addAssetBack(assetBack, abid);
			if(num > 0) {
				return "归还提交成功";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return "归还提交失败";
		
	}
}
