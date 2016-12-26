package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;

public interface DepartmentDao {
	
	public List<AssetDepartment> findAssetDepartmentsByAdlevel(Integer adlevel);
	
	//根据部门查询资产
	public List<AssetInfo> findAssetInfosByDepartmentId(Integer departmentId);

}
