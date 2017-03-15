package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetBack;
import com.sam.entity.AssetInfo;

public interface BackDao {
	


	/**
	 * 添加归还记录
	 * @author zhw
	 * @param assetBack
	 * @return
	 * @throws Exception
	 */
	public int addAssetBack(AssetBack assetBack) throws Exception;
	
	/**
	 * 查询全部,归还但未入库的
	 * @author zhw
	 * @return
	 * @throws Exception
	 */
	public List<AssetBack> findAssetBacksNotRuku(AssetBack assetBack) throws Exception;
	
	
	
}
