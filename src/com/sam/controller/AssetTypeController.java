package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetType;
import com.sam.service.AssetTypeService;

/**
 * 查询所有的设备类型
 * 
 * @author gaohailong
 *
 */
@Controller
@RequestMapping(value = "/assetType")
public class AssetTypeController {

	@Autowired
	private AssetTypeService assetTypeService;

	/**
	 * 查询所有的设备类型
	 * 
	 * @author gaohailong
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/findAllAssetType",method=RequestMethod.GET)
	public List<AssetType> findAllAssetType() throws Exception {
		System.out.println("tsets");
		return assetTypeService.findAssetType();
	}
}
