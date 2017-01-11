package com.sam.service;

import java.util.List;

import com.sam.entity.AssetHouse;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetUser;
import com.sam.entity.Pager;

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
	
	public Pager<AssetInfo> findAssetInfos(String ahname, int pageNum,int pageSize) throws Exception;
	
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
	
	/**
	 * 分页查询所有用户
	 * @return
	 * @throws Exception
	 */
	Pager<AssetHouse> findHouse(int pageNum,int pageSize)throws Exception;

}
