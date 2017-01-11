package com.sam.service;

import java.util.List;

import com.sam.entity.AssetHouse;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetType;
import com.sam.entity.Pager;

/**
 * 设备类型
 * 
 * @author gaohailong
 *
 */
public interface AssetTypeService {
	/**
	 * 查询设备类型
	 * 
	 * @return
	 * @author gaohailong
	 * @throws Exception 
	 * 
	 */
	List<AssetType> findAssetType() throws Exception;
	
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
	public Pager<AssetInfo> findAssetInfosByatname(String atname,int pageNum, int pageSize);
	
	/**
	 * 查询所有的二级类型
	 * @author gaohailong
	 * @return
	 */
	List<AssetType>	findAllSecondAssetType();
	
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
	 * 分页查询所有一级类型
	 * @return
	 * @throws Exception
	 */
	Pager<AssetType> findType(int pageNum,int pageSize,int ahlevel)throws Exception;
	/**
	 * 分页查询对应的二级菜单
	 * @param pageNum
	 * @param pageSize
	 * @param atid
	 * @return
	 * @throws Exception
	 */
	Pager<AssetType> findTypeSecond(int pageNum,int pageSize,int atid)throws Exception;
	
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
	int updateType(AssetType sssettype)throws Exception;
}
