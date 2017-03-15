package com.sam.service;

import com.sam.entity.AssetBack;
import com.sam.entity.Pager;

public interface BackService {
	


	/**
	 * 归还业务,修改资产的状态,同时添加归还表
	 * @author zhw
	 * @param assetBack
	 * @param abid
	 * @return
	 * @throws Exception
	 */
	public int addAssetBack(AssetBack assetBack, Integer abid) throws Exception;
	
	/**
	 * 查询归还表没有入库的
	 * @param assetBack
	 * @param page
	 * @param pageNum
	 * @return
	 * @throws Exception
	 */
	public Pager<AssetBack> findAssetBacksNotRuku(AssetBack assetBack, Integer page, Integer pageNum) throws Exception;
}
