package com.sam.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetApply;
import com.sam.entity.Pager;
import com.sam.service.ApplyService;
import com.sam.util.ConstantUtil;

/**
 * 设备购置申请
 * @author wc
 *
 */
@Controller
@RequestMapping(value="/apply")
public class ApplyController extends BaseController{
	
	@Autowired
	private ApplyService applyService;
	
	/**
	 * 提交购置申请
	 * @param assetapply
	 * @return
	 */
	@RequestMapping(value="/addApply",method=RequestMethod.POST)
	@ResponseBody
	public int addApply(
			@RequestParam(value="adname",required = false)String adname,
			@RequestParam(value="auname",required = false)String auname,
			@RequestParam(value="ainame",required = false)String ainame,
			@RequestParam(value="auSupply",required = false)String auSupply,
			@RequestParam(value="auNumber",required = false)Integer auNumber,
			@RequestParam(value="auMoney",required = false)Double auMoney,
			@RequestParam(value="auReason",required = false)String auReason,
			@RequestParam(value="auRemark",required = false)String auRemark){
		
		AssetApply assetapply = new AssetApply();
		assetapply.setAdname(adname);
		assetapply.setAuname(auname);
		assetapply.setAiname(ainame);
		assetapply.setAusupply(auSupply);
		assetapply.setAunumber(auNumber);
		assetapply.setAumoney(auMoney);
		assetapply.setAureason(auReason);
		assetapply.setAuremark(auRemark);
		System.out.println("auname"+auname);
		System.out.println("输出assetapply"+assetapply.toString());
		 try{
		int num = applyService.addAppply(assetapply);
		return num;
		 }catch(Exception ex){
			 ex.printStackTrace();
			 return 0;
			 
		 }
		
	}	
	
	/**
	 * 申请同意
	 * @author wc
	 */
	@RequestMapping(value="updateApply",method=RequestMethod.POST)
	@ResponseBody
	public int updateApply(
		@RequestParam(value="aaid",required=false)Integer aaid){
		System.out.println("aaid:"+aaid);
		int num = 0;
		try {
			num = applyService.updateApply(aaid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(num==0)
		return -1;
		  return num;
		
	}
	
	/**
	 * 删除申请的订单
	 * @author wc
	 */
	@RequestMapping(value="deleteApply",method=RequestMethod.POST)
	@ResponseBody
	public int deleteApply(
			@RequestParam(value="aaid",required=false)Integer aaid){
		int num = 0;
		try{
			System.out.println("获取的id是"+aaid);
		   num = applyService.deleteApply(aaid);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		if(num==0)
			return -1;
		return num;
	}
	
	
	/**
	 * 分页查询出购置申请
	 * @author wc
	 * @param page
	 */
	@RequestMapping(value="/findAllApply",method=RequestMethod.GET)
	@ResponseBody
	public Pager<AssetApply> findApply(Integer page){
		System.out.println("进findalliy方法");
		try{
		int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
		if(page!=null){
			pageNum = page;
		}
		int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
		Pager<AssetApply> applyResult = applyService.findApply(pageNum, pageSize);
		return applyResult;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
			
		}
	}
	
	/**
	 * 多条件分页查询
	 * @author wc
	 * @param page
	 */
	@ResponseBody
    @RequestMapping(value = "/findApplyByAinameAndAdname",method=RequestMethod.POST)
	public Pager<AssetApply> findApplyByAinameAndAdname(
			@RequestParam(value = "ainame",required = false)String ainame,
			@RequestParam(value = "adname",required = false)String adname,
			@RequestParam(value = "pageNum",required = false)Integer page){
		try{
			int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
			if(page!=null){
				pageNum = page;
			}
			int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
		AssetApply assetapply = new AssetApply();
		assetapply.setAiname(ainame.trim());
		assetapply.setAdname(adname.trim());
				return applyService.findApplyByAinameAndAdname(assetapply, pageNum,
						ConstantUtil.DEFAULT_PAGE_SIZE);
		}catch(Exception ex){
			return null;
		}
		
	}
	

}
