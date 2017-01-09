package com.sam.service;

import java.util.List;

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
}
