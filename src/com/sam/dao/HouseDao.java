package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetHouse;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetUser;

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
	
	public List<AssetInfo> findAssetInfosByAhname(String ahname) throws Exception;
	
	/**
	 * 增加仓库
	 * @author wc
	 *
	 */
	int addHouse(AssetHouse assethouse) throws Exception;
	
	/**
	 * 删除仓库
	 * @param ahid
	 * @return
	 * @throws Exception
	 */
	int deleteHouse(Integer ahid)throws Exception;
	
	/**
	 * 修改仓库
	 * @param auid
	 * @return
	 * @throws Exception
	 */
	int updateHouse(AssetHouse assethouse)throws Exception;
	
	
	
	
	
	
}
