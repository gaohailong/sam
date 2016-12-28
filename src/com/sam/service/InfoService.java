package com.sam.service;

import java.util.List;

import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;

public interface InfoService {
	/**
	 * 为设备表添加一条新的信息
	 * 
	 * @param info
	 * @throws Exception
	 */
	int addInfo(AssetInfo info) throws Exception;

	/**
	 * 根据使用状态查询设备
	 * 
	 * @param asname
	 * @return
	 * @throws Exception
	 */
	public List<AssetInfo> findInfoByAsname(String asname) throws Exception;

	/**
	 * 
	 * 查询借出设备
	 */
	public List<AssetInfo> findInfoByAcid(Integer acid) throws Exception;

	/**
	 * 查询维修中的设备
	 * 
	 * @param arid
	 * @return
	 * @throws Exception
	 */

	public List<AssetRequire> findInfoArid(Integer arid) throws Exception;

	/**
	 * @author gaohailong 设备条件查询
	 */
	List<AssetInfo> findAssetByCondition(AssetInfo assetInfo) throws Exception;

}
