package com.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetBack;
import com.sam.entity.Pager;
import com.sam.service.BackService;
import com.sam.util.ConstantUtil;


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

	
	/**
	 * 生成归还记录,未入库
	 * @param abroorwid
	 * @param abdeluser
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/addAssetBack")
	public int addAssetBack(Integer abroorwid, String abdeluser) {
		try {
			System.out.println("abid:"+abroorwid);
			System.out.println("abdeluser:"+abdeluser);
			AssetBack assetBack = new AssetBack();
			if(abroorwid != null && !"".equals(abroorwid)) {
				assetBack.setAbroorwid(abroorwid);
			}
			if(abdeluser != null && !"".equals(abdeluser)) {
				assetBack.setAbdeluser(abdeluser);
			}
			int num = backService.addAssetBack(assetBack, abroorwid);
			if(num > 0) {
				return 1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return 0;
		
	}
	
	/**
	 * @author zhw
	 * 查询归还记录
	 * @param abdeluser
	 * @param abdate
	 * @param page
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/findAssetbacksNotRuku",method=RequestMethod.POST)
	public Pager<AssetBack> findAssetbacksNotRuku(String abdeluser,String abdate, Integer page) {
		try {
			int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
			if(page != null) {
				pageNum = page;
			}
			AssetBack assetBack = new AssetBack();
			if(abdeluser != null && !"".equals(abdeluser)) {
				assetBack.setAbdeluser(abdeluser.trim());
			}
			if(abdate != null && !"".equals(abdeluser)) {
				assetBack.setAbdate(abdate);
			}
			Pager<AssetBack> pagerResult =  backService.findAssetBacksNotRuku(assetBack, ConstantUtil.DEFAULT_PAGE_SIZE, pageNum);
			return pagerResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
