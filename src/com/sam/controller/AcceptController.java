package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetAccept;
import com.sam.entity.AssetInfo;
import com.sam.service.AcceptService;

/**
 * 入库表的controller
 * @author yty
 *
 */
@Controller

@RequestMapping(value="/accept")
public class AcceptController extends BaseController {

	@Autowired
	private AcceptService acceptService;
	
	/**
	 * 入库时候添加信息
	 * @param accept
	 * @param info
	 * @return
	 */ 
	@RequestMapping(value="/addAccept",method=RequestMethod.POST)
	@ResponseBody
	public int addAccept(
			@RequestParam(value = "ahname",required = false) String ahname,
			@RequestParam(value = "aatype",required = false) String aatype,
			@RequestParam(value = "aaname",required = false) String aaname,
			@RequestParam(value = "aaprice",required = false) Double aaprice,
			@RequestParam(value = "aanumber",required = false) Integer aanumber,
			String acceptStr){
		AssetAccept accept = new AssetAccept();
		accept.setAhname(ahname);
		accept.setAatype(aatype);
		accept.setAaname(aaname);
		accept.setAaprice(aaprice);
		accept.setAanumber(aanumber);
		System.out.println(accept);
		System.out.println(acceptStr);

		try {
			int num = acceptService.addAccept(acceptStr, accept);
			return num;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
		}
		
	}
	
	
}
