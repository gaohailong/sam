package com.sam.service;

import java.util.List;

import com.sam.entity.AssetType;

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
}
