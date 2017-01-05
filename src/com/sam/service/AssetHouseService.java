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
	 * 查询所有的一级仓库
	 */
	List<AssetHouse> findAllFirstHouse() throws Exception;

	/**
	 * 
	 * 查询所有的二级仓库
	 */
	List<AssetHouse> findAllSecondHouse() throws Exception;
}
