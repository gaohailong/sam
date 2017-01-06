package com.sam.service;

import com.sam.entity.AssetRequire;

public interface RequireService {

	/**
	 * 像维修表中添加一条记录
	 * @param require
	 * @return
	 * @throws Exception
	 */
	int addRequire(String aiidStr,AssetRequire require) throws Exception;
}
