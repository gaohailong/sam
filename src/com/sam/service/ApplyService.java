package com.sam.service;

import java.util.List;

import com.sam.entity.AssetApply;
import com.sam.entity.Pager;

/**
 * 设备购置申请表的service
 * @author wc
 *
 */

public interface ApplyService {
	/**
	 * 增加一个设备购置申请
	 * @param assetapply
	 * @return
	 * @throws Exception
	 */
	
int addAppply(AssetApply assetapply)throws Exception;

/**
 * 分页查询购置设备的申请
 * @return
 * @throws Exception
 */
Pager<AssetApply> findApply(int pageNum,int pageSize)throws Exception;

/**
 * 多条件查询
 * @author wc
 */
Pager<AssetApply> findApplyByAinameAndAdname(AssetApply assetapply,Integer pageNum,Integer pageSize) throws Exception;

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
