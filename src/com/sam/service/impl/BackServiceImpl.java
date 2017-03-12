package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.BackDao;
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
	
	
	
	@Override
	public int addAssetBack(AssetBack assetBack, Integer abid) throws Exception {
		System.out.println("assetBack:"+assetBack);
		System.out.println("添加AssetBack");
		int num = backDao.addAssetBack(assetBack);
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
