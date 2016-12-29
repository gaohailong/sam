package com.sam.service;

import com.sam.entity.AssetAccept;
import com.sam.entity.AssetInfo;

/**
 * 入库表的service
 * @author yty
 *
 */
public interface AcceptService {

	/**
	 * 添加一个入库信息之后一起把设备的信息添加到assetaccept表中
	 * @param accept
	 * @param info
	 * @return
	 * @throws Exception
	 */
	int addAccept(AssetAccept accept,AssetInfo info) throws Exception;
}
