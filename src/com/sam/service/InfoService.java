package com.sam.service;

import com.sam.entity.AssetInfo;

public interface InfoService {
	/**
	 * 添加设备信息
	 * @param info
	 * @throws Exception
	 */
	void addInfo(AssetInfo info) throws Exception;
}
