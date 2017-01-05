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

}
