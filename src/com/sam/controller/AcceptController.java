package com.sam.controller;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sam.entity.AssetAccept;
import com.sam.entity.AssetInfo;
import com.sam.service.AcceptService;

/**
 * 入库表的controller
 * @author yty
 *
 */
@Controller

@RequestMapping(value="/acceptController")
public class AcceptController {

	@Autowired
	private AcceptService acceptService;
	
	/**
	 * 入库时候添加信息
	 * @param accept
	 * @param info
	 * @return
	 */ 
	@RequestMapping(value="/addAccept",method=RequestMethod.POST)
	public String addAccept(String acceptStr,AssetAccept accept){

		AssetInfo info = new AssetInfo();
		try {
			String[] accStr = acceptStr.split(",");
			for(int i=0;i<accStr.length;i++){
				String[] acc = accStr[i].split(".");
				info.setAimodel(acc[0]);
				info.setAiname(acc[1]);
				info.setAtname(acc[2]);
			}
			System.out.println(info);
			System.out.println(accept);
			int num = acceptService.addAccept(accept, info);
			if(num>0){
				return "添加正确的页面";
			}
			return "添加失败的页面";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "exception";
		}
		
	}
	
	
}
