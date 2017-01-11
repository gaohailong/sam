package com.sam.service;

import java.util.List;

import com.sam.entity.AssetRequire;
import com.sam.entity.AssetRequiresSearch;
import com.sam.entity.Pager;

public interface RequireService {

	/**
	 * 像维修表中添加一条记录
	 * @param require
	 * @return
	 * @throws Exception
	 */
	int addRequire(String aiidStr,AssetRequire require) throws Exception;

	/**
	 * @author zhw
	 * @param require
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public Pager<AssetRequire> findAssetRequires(AssetRequiresSearch assetRequiresSearch,Integer pageNum, Integer pageSize) throws Exception;

	public List<AssetRequire> findAssetRequiresNofenye(AssetRequiresSearch assetRequiresSearch) throws Exception;
}
