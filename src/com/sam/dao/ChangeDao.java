package com.sam.dao;

import com.sam.entity.AssetChange;

/**
 * 设备移交时候的dao
 * @author yty
 *
 */
public interface ChangeDao {

	/**
	 * 增加移交记录的dao
	 * @param change
	 * @return
	 * @throws Exception
	 */
	int addChange(AssetChange change) throws Exception;
}
