package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetRequire;

/**
 * 设备修理时候的Dao
 * @author yty
 *
 */
public interface RequireDao {

	/**
	 * 增加一条设备时候的dao
	 * @param require
	 * @return
	 * @throws Exception
	 */
	int addRequire(AssetRequire require) throws Exception;
	
	/**
	 * 动态多条件查询资产维修表
	 * @author zhw
	 * @param require
	 * @return
	 */
	public List<AssetRequire> findAssetRequires(AssetRequire require) throws Exception;
}
