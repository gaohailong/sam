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
	
	//鏌ヨ涓�骇閮ㄩ棬
	@RequestMapping("/findDepartmentsFirst")
	@ResponseBody
	public List<AssetDepartment> findDepartmentsFirst() {
		try {
			System.out.println("杩涘叆findDepartmentsFirst");
			List<AssetDepartment> departmentList = departmentService.findAssetDepartmentsByAdlevel(0);
			for (AssetDepartment assetDepartment : departmentList) {
				System.out.println(assetDepartment.getAdname());
			}
			return departmentList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//鏌ヨ涓�骇閮ㄩ棬涓嬬殑浜岀骇閮ㄩ棬
	@RequestMapping("/findDepartmentsSecond")
	@ResponseBody
	public List<AssetDepartment> findDepartmentsSecond(Integer adlevel) {
		try {
			List<AssetDepartment> departmentList = departmentService.findAssetDepartmentsByAdlevel(adlevel);
			return departmentList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//鍒嗛〉鏍规嵁閮ㄩ棬id鏌ヨ璧勪骇
	@RequestMapping("/findAssetInfos")
	@ResponseBody
	public Pager<AssetInfo> findAssetInfosByDname(String dname ,Integer page) {
		try {
<<<<<<< Updated upstream
			System.out.println("杩涘叆findAssetInfosById鎺у埗鍣�z");
=======
			System.out.println("进入findAssetInfosByDname控制器");
>>>>>>> Stashed changes
			int pageNum = ConstantDepartment.DEFAULT_PAGE_NUM;
			if(page != null) {
				pageNum = page;
			}
			int pageSize = ConstantDepartment.DEFAULT_PAGE_SIZE;
			Pager<AssetInfo> assstResult = departmentService.findAssetByDname("aa", pageNum, pageSize);
			System.out.println(assstResult.getDataList().size());
			return assstResult;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
