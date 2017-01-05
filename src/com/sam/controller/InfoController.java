package com.sam.controller;

import java.util.Date;
import java.util.List;

import oracle.net.aso.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;
import com.sam.entity.Pager;
import com.sam.service.InfoService;
import com.sam.util.ConstantUtil;

/**
 * 设备信息
 * @author gaohailong
 *
 */
@Controller
@RequestMapping(value = "/infoController")
public class InfoController {

	@Autowired
	private InfoService infoService;
	private List<AssetInfo> assetInfoList;

	@RequestMapping(value = "/addInfo", method = RequestMethod.GET)
	@ResponseBody
	public void addInfo(AssetInfo info) {
		try {
			System.out.println("进入addInfo");
			infoService.addInfo(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param asname根据使用状态查询资产
	 * @param page
	 * @author zxx
	 * 
	 * @return
	 */
	@RequestMapping(value = "/findInfoByAsname", method = RequestMethod.POST)
	@ResponseBody
	public Pager<AssetInfo> findInfoByAsname(String asname,Integer page) {
		try {
			System.out.println("进入findAssetInfosByasname控制器");
			System.out.println("asname:"+asname);
			int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
			if(page != null) {
				pageNum = page;
			}
			int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
			Pager<AssetInfo> assetInfoList = infoService.findInfoByAsname(asname, pageNum, pageSize);
			return assetInfoList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = "/findInfoByAbid", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetInfo> findInfoByAcid(Integer acid) {
		try {
			infoService.findInfoByAcid(acid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = "/findInfoByArid", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetRequire> findInfoArid(Integer arid) {
		try {
			infoService.findInfoArid(arid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 资产条件查询
	 * 
	 * @author gaohailong
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findAssetByCondition", method = RequestMethod.GET)
	public Pager<AssetInfo> findAssetByCondition(
			@RequestParam(value = "ainame", required = false) String ainame,
			@RequestParam(value = "atname", required = false) String atname,
			@RequestParam(value = "ahname", required = false) String ahname,
			@RequestParam(value = "aidate", required = false) Date aidate,
			@RequestParam(value = "pageNum", required = false) int pageNum) {
		try {
			AssetInfo assetInfo = new AssetInfo();
			assetInfo.setAiname(ainame.trim());
			assetInfo.setAtname(atname.trim());
			assetInfo.setAhname(ahname.trim());
			assetInfo.setAidate(aidate);
			return infoService.findAssetByCondition(assetInfo, pageNum,
					ConstantUtil.DEFAULT_PAGE_SIZE);
		} catch (Exception e) {
			return null;
		}
	}
	@RequestMapping(value="/findAssetInfos",method=RequestMethod.GET)
	@ResponseBody
	public Pager<AssetInfo> findAssetInfos(Integer page) {
		try {
			int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
			if(page != null) {
				pageNum = page;
				System.out.println("控制器：pageNum："+pageNum);
			}
			int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
			Pager<AssetInfo> assetResult = infoService.findAssets(pageNum, pageSize);
			return assetResult;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
