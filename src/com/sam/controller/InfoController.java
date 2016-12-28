package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;
import com.sam.service.InfoService;

@Controller
@RequestMapping(value="/InfoController")
public class InfoController {

	@Autowired
	private InfoService infoService;
	private List<AssetInfo> assetInfoList;

	@RequestMapping(value="/addInfo",method = RequestMethod.GET)
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
	 * @author gaohailong
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findAssetByCondition", method = RequestMethod.GET)
	public List<AssetInfo> findAssetByCondition(
			@RequestParam(value = "equipment", required = false) String equipment,
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "warehouse", required = false) String warehouse,
			@RequestParam(value = "inhousetime", required = false) String inhousetime) {
		try {
			return infoService.findAssetByCondition(equipment, category,
					warehouse, inhousetime);
		} catch (Exception e) {
			return null;
		}
	}
}
