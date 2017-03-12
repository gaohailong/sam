package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetType;

public interface DepartmentDao {
	
	public List<AssetDepartment> findAssetDepartmentsByAdlevel(Integer adlevel);
	
	
	/**
	 * @author zhw
	 * 根据部门查询资产
	 * @param dname
	 * @return
	 */
	public List<AssetInfo> findAssetInfosByDname(String dname);

	/**
	 * @author zhw
	 * 查询全部的资产
	 * @return
	 */
	public List<AssetInfo> findAssetInfos() throws Exception;
	
	/**
	 * 购置申请页面的部门下拉列表的显示,
	 * 一级部门的adleval是0
	 * 所以查询adleval非0的数据
	 * @author zhw
	 * @return
	 * @throws Exception
	 */
	public List<AssetDepartment> findAllSecondDepartments() throws Exception;
	
	
	public List<AssetDepartment> findAll() throws Exception;
	
	/**
	 * 增加一级菜单
	 * @param assetdepartment
	 * @return
	 * @throws Exception
	 * @author wc
	 */
	int  addDepartment(AssetDepartment assetdepartment)throws Exception;
	/**
	 * 增加二级菜单
	 * @param assetdepartment
	 * @param adid
	 * @return
	 * @throws Exception
	 * @author wc
	 */
	int  addDepartmentSecond(AssetDepartment assetdepartment)throws Exception;
	/**
	 * 删除类型
	 * @param adid
	 * @return
	 * @throws Exception
	 */
	int deleteDepartment(Integer adid)throws Exception;
	/**
	 * 修该类型
	 * @param sddetdepartment
	 * @return
	 * @throws Exception
	 */
	int updateDepartment(AssetDepartment assetdepartment)throws Exception;
	
}
