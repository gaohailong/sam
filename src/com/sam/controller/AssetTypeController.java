package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetType;
import com.sam.entity.Pager;
import com.sam.service.AssetTypeService;
import com.sam.service.DepartmentService;
import com.sam.util.ConstantUtil;

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
	@RequestMapping(value = "/findAllAssetType", method = RequestMethod.GET)
	public List<AssetType> findAllAssetType() throws Exception {
		return assetTypeService.findAssetType();
	}

	/**
	 * 查询所有的二级类型
	 * 
	 * @author gaohailong
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/findAllSecondAssetType", method = RequestMethod.GET)
	public List<AssetType> findAllSecondAssetType() throws Exception {
		try {
			return assetTypeService.findAllSecondAssetType();
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * @author zxx 查询一级类型菜单使用get方式
	 * @RequestMapping(value = "/findAllCategory", method = RequestMethod.GET)
	 * @return
	 */
	@RequestMapping(value = "/findAssetTypeFirst", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetType> findAssetTypeFirst() {
		try {
			List<AssetType> assetTypeList = assetTypeService
					.findAssetTypeByAtlevel(0);
			return assetTypeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 查询二级部门
	 * 
	 * @param adlevel
	 * @return
	 * @author zxx
	 */
	@RequestMapping(value = "/findAssetTypeSecond", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetType> findAssetTypeSecond(Integer atlevel) {
		System.out.println("进来了方法");
		try {
			System.out.println("atlevel:" + atlevel);
			List<AssetType> assetTypeList = assetTypeService
					.findAssetTypeByAtlevel(atlevel);
			return assetTypeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 根据资产类型查询资产
	 * 
	 * @author zxx
	 * @param dname
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/findAssetInfosByatname", method = RequestMethod.POST)
	@ResponseBody
	public Pager<AssetInfo> findAssetInfosByatname(String atname, Integer page) {
		try {
			System.out.println("进入findAssetInfosByatname控制器");
			System.out.println("atname:" + atname);
			int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
			if (page != null) {
				pageNum = page;
			}
			int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
			Pager<AssetInfo> pager = assetTypeService.findAssetInfosByatname(
					atname, pageNum, pageSize);
			System.out.println(pager.getDataList().size());
			return pager;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
