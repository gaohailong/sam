package com.sam.service;

import java.util.List;

import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.Pager;

public interface DepartmentService {
	public List<AssetDepartment> findAssetDepartmentsByAdlevel(Integer adlevel);
	
	/**
	 * 根据部门id查询资产的分页方法
	 * @param departmentId 
	 * 			查询条件
	 * @param pageNum
	 * 			查询第几页数据
	 * @param pageSize
	 * 			每页显示多少条数据
	 * @return
	 */
	public Pager<AssetInfo> findAssetsByDepartmentId(Integer departmentId, int pageNum, int pageSize);
}
