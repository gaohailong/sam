package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sam.entity.AssetAccept;
import com.sam.entity.AssetInfo;
import com.sam.service.AcceptService;

/**
 * 入库表的controller
 * @author yty
 *
 */
@Controller
public class AcceptController {

	@Autowired
	private AcceptService acceptService;
	
	/**
	 * 入库时候添加信息
	 * @param accept
	 * @param info
	 * @return
	 */ 
	@RequestMapping("/addAccept")
	public String addAccept(AssetAccept accept,AssetInfo info){
		try {
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
