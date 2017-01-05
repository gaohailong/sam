package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetHouse;

/**
 * 仓库
 * @author gaohailong
 *
 */
public interface HouseDao {
	
	/**
	 * 查询所有的仓库
	 * @return
	 */
	List<AssetHouse> findAllHouse() throws Exception;
	
	/**
	 * 
	 * 根据仓库等级查询仓库
	 */
	List<AssetHouse> findHouseByAhlevel(Integer ahleval) throws Exception;
	
}
