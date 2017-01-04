package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.Pager;
import com.sam.service.DepartmentService;
import com.sam.util.ConstantUtil;

@Controller
@RequestMapping(value="/department")
public class DepartmentController extends BaseController {

	@Autowired
	private DepartmentService departmentService;
	
	/**
	 * @author zhw
	 * 查询一级部门使用get方式
	 * @RequestMapping(value = "/findAllCategory", method = RequestMethod.GET)
	 * @return
	 */
	@RequestMapping(value="/findDepartmentsFirst", method=RequestMethod.GET)
	@ResponseBody
	public List<AssetDepartment> findDepartmentsFirst() {
		try {
			List<AssetDepartment> departmentList = departmentService.findAssetDepartmentsByAdlevel(0);
			return departmentList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	/**
	 * 查询二级部门
	 * @param adlevel
	 * @return
	 * @author zhw
	 */
	@RequestMapping(value="/findDepartmentsSecond", method=RequestMethod.POST)
	@ResponseBody
	public List<AssetDepartment> findDepartmentsSecond(Integer adlevel) {
		try {
			System.out.println("adlevel:"+adlevel);
			List<AssetDepartment> departmentList = departmentService.findAssetDepartmentsByAdlevel(adlevel);
			return departmentList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * 根据部门查询资产
	 * @author zhw
	 * @param dname
	 * @param page
	 * @return
	 */
	@RequestMapping(value="/findAssetInfosBydname",method=RequestMethod.GET)
	@ResponseBody
	public Pager<AssetInfo> findAssetInfosByDname(String dname ,Integer page) {
		try {
			System.out.println("进入findAssetInfosByDname控制器");
			int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
			if(page != null) {
				pageNum = page;
			}
			int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
			Pager<AssetInfo> assetResult = departmentService.findAssetByDname(dname, pageNum, pageSize);
			System.out.println(assetResult.getDataList().size());
			return assetResult;
		} catch (Exception e) {
			e.printStackTrace();
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
			Pager<AssetInfo> assetResult = departmentService.findAssets(pageNum, pageSize);
			return assetResult;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

