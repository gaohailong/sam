package com.sam.dao;

import com.sam.entity.AssetAccept;

/**
 * 入库时候的dao
 * @author yty
 *
 */

public interface AcceptDao {

	/**
	 * 增加一条设备的dao
	 * @param accept
	 * @return
	 * @throws Exception
	 */
	int addAccept(AssetAccept accept) throws Exception;
}
