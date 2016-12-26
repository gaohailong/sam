package com.sam.service;

import com.sam.entity.AssetInfo;

public interface InfoService {
	/**
	 * 为设备表添加一条新的信息
	 * @param info
	 * @throws Exception
	 */
	int addInfo(AssetInfo info) throws Exception;
}
