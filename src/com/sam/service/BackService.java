package com.sam.service;

import com.sam.entity.AssetBack;

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
}
