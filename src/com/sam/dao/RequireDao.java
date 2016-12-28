package com.sam.dao;

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
}
