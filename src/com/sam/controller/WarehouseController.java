package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetHouse;
import com.sam.service.AssetHouseService;

/**
 * 查询仓库
 * 
 * @author gaohailong
 *
 */
@Controller
@RequestMapping(value = "/wareHouse")
public class WarehouseController {

	@Autowired
	private AssetHouseService assetHouseService;

	/**
	 * 查询所有的仓库
	 * 
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/findAllHouse", method = RequestMethod.GET)
	public List<AssetHouse> findAllHouse() throws Exception {
		return assetHouseService.findAllHouse();
	}
}
