package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetInfo;
import com.sam.service.InfoService;

@Controller
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/addInfo")
	@ResponseBody
	public void addInfo(AssetInfo info){
		try {
			System.out.println("进入addInfo");
			infoService.addInfo(info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
