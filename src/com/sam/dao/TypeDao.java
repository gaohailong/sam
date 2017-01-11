package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetInfo;
import com.sam.entity.AssetType;

public interface TypeDao {

	public List<AssetType> findAll() throws Exception;
	
	/**
	 * 根据类型等级查询类型
	 * @param atlevel
	 * @return
	 */
	public List<AssetType> findAssetTypeByAtlevel(Integer atlevel);
		
	/**
	 * 根据类型查询资产
	 * @param atame
	 * @return
	 */
	public List<AssetInfo> findAssetInfosByatname(String atname);
	
	/**
	 * 查询所有的二级类型
	 * @author gaohailong
	 * @return
	 */
	List<AssetType> findAllSecondAssetType();
	
	/**
	 * 增加一级菜单
	 * @param assettype
	 * @return
	 * @throws Exception
	 * @author wc
	 */
	int  addType(AssetType assettype)throws Exception;
	/**
	 * 增加二级菜单
	 * @param assettype
	 * @param atid
	 * @return
	 * @throws Exception
	 * @author wc
	 */
	int  addTypeSecond(AssetType assettype)throws Exception;
	/**
	 * 删除类型
	 * @param atid
	 * @return
	 * @throws Exception
	 */
	int deleteType(Integer atid)throws Exception;
	/**
	 * 修该类型
	 * @param sddettype
	 * @return
	 * @throws Exception
	 */
	int updateType(AssetType sddettype)throws Exception;
}
