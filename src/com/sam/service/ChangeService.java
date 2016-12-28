package com.sam.service;

import com.sam.entity.AssetChange;

public interface ChangeService {
	
	/**
	 * 移交表中添加一条记录
	 * @param change
	 * @return
	 * @throws Exception
	 */
	int addChange(AssetChange change) throws Exception;
}
