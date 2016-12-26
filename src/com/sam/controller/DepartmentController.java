package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.dao.ConstantDepartment;
import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.Pager;
import com.sam.service.DepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	//查询一级部门
	@RequestMapping("findDepartmentsFirst.do")
	@ResponseBody
	public List<AssetDepartment> findDepartmentsFirst() {
		try {
			System.out.println("进入findDepartmentsFirst");
			List<AssetDepartment> departmentList = departmentService.findAssetDepartmentsByAdlevel(0);
			return departmentList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//查询一级部门下的二级部门
	@RequestMapping("findDepartmentsSecond.do")
	@ResponseBody
	public List<AssetDepartment> findDepartmentsSecond(Integer adlevel) {
		try {
			List<AssetDepartment> departmentList = departmentService.findAssetDepartmentsByAdlevel(adlevel);
			return departmentList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//分页根据部门id查询资产
	@RequestMapping("findAssetInfos.do")
	@ResponseBody
	public Pager<AssetInfo> findAssetInfosById(Integer did,Integer page) {
		try {
			System.out.println("进入findAssetInfosById控制器");
			int pageNum = ConstantDepartment.DEFAULT_PAGE_NUM;
			if(page != null) {
				pageNum = page;
			}
			int pageSize = ConstantDepartment.DEFAULT_PAGE_SIZE;
			Pager<AssetInfo> assstResult = departmentService.findAssetsByDepartmentId(did, pageNum, pageSize);
			return assstResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
