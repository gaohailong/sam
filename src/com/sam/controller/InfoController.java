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

@Controller
@RequestMapping(value = "/InfoController")
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

	@RequestMapping(value = "/findInfoByAsname", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetInfo> findInfoByAsname(String asname) {
		try {
			infoService.findInfoByAsname(asname);
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

	@RequestMapping(value = "/findInfoArid", method = RequestMethod.GET)
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
}
