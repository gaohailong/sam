package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.BackDao;
import com.sam.dao.BroorwDao;
import com.sam.dao.InfoDao;
import com.sam.entity.AssetBack;
import com.sam.entity.Pager;
import com.sam.service.BackService;
@Service
public class BackServiceImpl implements BackService {
	
	@Autowired
	private BackDao backDao;
	
	@Autowired
	private InfoDao infoDao;
	
	@Autowired
	private BroorwDao broorwDao;
	
	
	
	/**
	 * 归还业务,修改资产的状态,同时添加归还表
	 */
	@Override
	public int addAssetBack(AssetBack assetBack, Integer abid) throws Exception {
		System.out.println("assetBack:"+assetBack);
		System.out.println("添加AssetBack");
		int updatenum = broorwDao.updateBroowWhenBack(abid);
		int addnum = backDao.addAssetBack(assetBack);
		int num = 0;
		if(updatenum !=0 && addnum != 0) {
			//归还成功
			num = 1; 
		}
		return num;
	}



	@Override
	public Pager<AssetBack> findAssetBacksNotRuku(AssetBack assetBack,
			Integer pageSize, Integer pageNum) throws Exception {
		List<AssetBack> backList = backDao.findAssetBacksNotRuku(assetBack);
		Pager<AssetBack> pager = new Pager<AssetBack>(pageNum, pageSize, backList);
		return pager;
	}



}
