package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.BroorwDao;
import com.sam.entity.AssetBroorw;
import com.sam.entity.Pager;
import com.sam.service.BroorwService;

/**
 * 设备借出操作
 * @author zhw
 *
 */
@Service
public class BroorwServiceImpl implements BroorwService {
	
	@Autowired
	private BroorwDao broorwDao;

	/**
	 * 添加设备借出申请
	 */
	@Override
	public int addBroow() throws Exception {
		// TODO Auto-generated method stub
		return broorwDao.addBroow();
	}

	@Override
	public Pager<AssetBroorw> findBroorws(int pageNum, int pageSize)
			throws Exception {
		List<AssetBroorw> broorwList = findAllBroorws();
		Pager<AssetBroorw> pager = new Pager<AssetBroorw>(pageNum, pageSize, broorwList);
		return null;
	}
	
	public List<AssetBroorw> findAllBroorws() throws Exception {
		return broorwDao.findBroorws();
	}


}
