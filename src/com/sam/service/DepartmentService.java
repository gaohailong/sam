package com.sam.service;

import java.util.List;

import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.Pager;

public interface DepartmentService {
	public List<AssetDepartment> findAssetDepartmentsByAdlevel(Integer adlevel);
	
	/**
	 * 根据部门name查询资产的分页方法
	 * @param departmentId 
	 * 			查询条件
	 * @param pageNum
	 * 			查询第几页数据
	 * @param pageSize
	 * 			每页显示多少条数据
	 * @return
	 */
	public Pager<AssetInfo> findAssetByDname(String dname,int pageNum, int pageSize);
	
	/**
	 * 
	 * 查询全部的资产分页
	 * @param pageNum
	 * 			查询第几页数据
	 * @param pageSize
	 * 			每页显示多少条数据
	 * @return
	 */
	public Pager<AssetInfo> findAssets(int pageNum,int pageSize) throws Exception; 
	
	/**
	 * 购置申请页面的部门下拉列表的显示
	 * @author zhw
	 * @return
	 * @throws Exception
	 */
	public List<AssetDepartment> findAllSecondDepartments() throws Exception;
	
	
}
