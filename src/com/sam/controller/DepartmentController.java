package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetType;
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
			System.out.println("findDepartmentsSecond的adlevel:"+adlevel);
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
	@RequestMapping(value="/findAssetInfosBydname",method=RequestMethod.POST)
	@ResponseBody
	public Pager<AssetInfo> findAssetInfosByDname(String dname ,Integer page) {
		try {
			System.out.println("进入findAssetInfosByDname控制器");
			System.out.println("dname:"+dname);
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
	
	/**
	 * 部门管理下的遍历全部的资产
	 * @author zhw
	 * @param page
	 * @return
	 */
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
	
	/**
	 * 分页查询出一级部门菜单
	 * @author wc
	 * @param page
	 */
	@RequestMapping(value="/findDepartment",method=RequestMethod.GET)
	@ResponseBody
	public Pager<AssetDepartment> findDepartment(Integer page,Integer adlevel){
		System.out.println("进findtype方法"+adlevel);
		try{
		int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
		if(page!=null){
			pageNum = page;
		}
		int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
		Pager<AssetDepartment> typeResult = departmentService.findDepartment(pageNum, pageSize, adlevel);
		return typeResult;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
			
		}
	}
	
	@RequestMapping(value="/findDepartmentSecond",method=RequestMethod.POST)
	@ResponseBody
	public Pager<AssetDepartment> findDepartmentSecond(Integer page,Integer adid){
		try{
		int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
		if(page!=null){
			pageNum = page;
		}
		int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
		System.out.println("adid:"+adid);
		Pager<AssetDepartment> typeResult = departmentService.findDepartmentSecond(pageNum, pageSize, adid);
		return typeResult;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
		
	}
	
	/**
	 * 增加一级类型(Controller中的value和页面date引号中的内容对应。 页面获取的内容和set的内容对应)
	 * @param adname
	 * @param adlevel
	 * @return
	 * @author wc
	 */
	@RequestMapping(value="/addDepartment",method = RequestMethod.POST)
	@ResponseBody
	public int addDepartment(
			@RequestParam(value="adname",required = false)String adname,
			@RequestParam(value="adlevel",required = false)Integer adlevel){
		AssetDepartment assetdepartment = new AssetDepartment();
		assetdepartment.setAdname(adname);
		assetdepartment.setAdlevel(adlevel);
		try{
		int num = departmentService.addDepartment(assetdepartment);
		return num;
		}catch(Exception ex){
			ex.printStackTrace();
			return 0;
		}
		
	}
	
	@RequestMapping(value="/addDepartmentSecond",method = RequestMethod.POST)
	@ResponseBody
	public int addDepartmentSecond(
			@RequestParam(value="adname",required = false)String adname,
			@RequestParam(value="adlevel",required = false)Integer adlevel){
		AssetDepartment assetdepartment = new AssetDepartment();
		assetdepartment.setAdname(adname);
		assetdepartment.setAdlevel(adlevel);
		int num=0;
		 try{
		  num = departmentService.addDepartmentSecond(assetdepartment);
		 }catch(Exception ex){
			 ex.printStackTrace();
			 return 0;
		 }
		return num;
	}
	
	/**
	 * 删除类别
	 * @param adid
	 * @return
	 * @author wc
	 */
	@RequestMapping(value="/deleteDepartment/{adid}",method = RequestMethod.POST)
	@ResponseBody
	public int deleteDepartment(
			@PathVariable(value="adid")Integer adid){
		int num = 0;
		try{
		   num = departmentService.deleteDepartment(adid);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		if(num==0)
			return -1;
		return num;
	}
	
	@RequestMapping(value="/updateDepartment",method = RequestMethod.POST)
	@ResponseBody
	public int updateDepartment(
			@RequestParam(value="adid",required = false)Integer adid,
			@RequestParam(value="adname",required = false)String adname,
			@RequestParam(value="adlevel",required = false)Integer adlevel){
		int num =0;
		try{
			System.out.println("进入修改"+adid+" "+adname+"  "+adlevel);
		AssetDepartment assetdepartment = new AssetDepartment();
		assetdepartment.setAdid(adid);
		assetdepartment.setAdname(adname);
		assetdepartment.setAdlevel(adlevel);
		num = departmentService.updateDepartment(assetdepartment);
		}catch(Exception ex){
			ex.printStackTrace();
			return -1;
		}
		return num;
		
	}
}

