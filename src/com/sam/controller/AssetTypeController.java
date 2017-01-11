package com.sam.controller;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetType;
import com.sam.entity.AssetUser;
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
	 * 分页查询出一级类型菜单
	 * @author wc
	 * @param page
	 */
	@RequestMapping(value="/findType",method=RequestMethod.GET)
	@ResponseBody
	public Pager<AssetType> findType(Integer page,Integer ahlevel){
		System.out.println("进findtype方法"+ahlevel);
		try{
		int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
		if(page!=null){
			pageNum = page;
		}
		int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
		Pager<AssetType> typeResult = assetTypeService.findType(pageNum, pageSize,ahlevel);
		return typeResult;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
			
		}
	}
	
	@RequestMapping(value="/findTypeSecond",method=RequestMethod.POST)
	@ResponseBody
	public Pager<AssetType> findTypeSecond(Integer page,Integer atid){
		try{
		int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
		if(page!=null){
			pageNum = page;
		}
		int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
		System.out.println("atid:"+atid);
		Pager<AssetType> typeResult = assetTypeService.findTypeSecond(pageNum, pageSize, atid);
		return typeResult;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
		
	}
	
	/**
	 * 增加一级类型(Controller中的value和页面date引号中的内容对应。 页面获取的内容和set的内容对应)
	 * @param atname
	 * @param atlevel
	 * @return
	 * @author wc
	 */
	@RequestMapping(value="/addType",method = RequestMethod.POST)
	@ResponseBody
	public int addType(
			@RequestParam(value="atname",required = false)String atname,
			@RequestParam(value="atlevel",required = false)Integer atlevel){
		AssetType assettype = new AssetType();
		assettype.setAtname(atname);
		assettype.setAtlevel(atlevel);
		try{
		int num = assetTypeService.addType(assettype);
		return num;
		}catch(Exception ex){
			ex.printStackTrace();
			return 0;
		}
		
	}
	
	@RequestMapping(value="/addTypeSecond",method = RequestMethod.POST)
	@ResponseBody
	public int addTypeSecond(
			@RequestParam(value="atname",required = false)String atname,
			@RequestParam(value="atlevel",required = false)Integer atlevel){
		AssetType assettype = new AssetType();
		assettype.setAtname(atname);
		assettype.setAtlevel(atlevel);
		int num=0;
		 try{
		  num = assetTypeService.addTypeSecond(assettype);
		 }catch(Exception ex){
			 ex.printStackTrace();
			 return 0;
		 }
		return num;
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
