package com.sam.service;

import java.util.List;

import com.sam.entity.AssetHouse;

/**
 * 仓库service
 * 
 * @author gaohailong
 *
 */
public interface AssetHouseService {
	/**
	 * 查询所有的仓库
	 * 
	 * @return
	 */
	List<AssetHouse> findAllHouse() throws Exception;

	/**
	 * 
	 * 根据仓库等级查询仓库
	 */
	List<AssetHouse> findHouseByAhlevel(Integer ahleval) throws Exception;


}
