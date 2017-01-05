package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetApply;

public interface ApplyDao {
	
	/**
	 * 设备购置申请。
	 * @author wc
	 *
	 */
	int addApply(AssetApply assetapply) throws Exception;
	
	/**
	 * 设备购置申请的所有项目
	 * @author wc
	 */
	List<AssetApply> findApply() throws Exception;

}
