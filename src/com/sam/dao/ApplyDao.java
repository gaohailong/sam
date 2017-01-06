package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetApply;

public interface ApplyDao {
	
	/**
	 * 通过aaid
	 */
	
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
	
    /**
     * 多条件查询
     * @author wc
     */
	List<AssetApply> findApplyByAinameAndAdname(AssetApply assetapply) throws Exception;
	/**
	 * 审核通过后修改状态
	 * @param aaid
	 * @return
	 * @throws Exception
	 */
	int updateApply(Integer aaid) throws Exception;
	/**
	 * 删除申请的订单
	 * @param aaid
	 * @return
	 * @throws Exception
	 */
	int deleteApply(Integer aaid) throws Exception;

}
