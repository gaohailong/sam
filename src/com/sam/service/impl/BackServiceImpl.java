package com.sam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.BackDao;
import com.sam.dao.InfoDao;
import com.sam.entity.AssetBack;
import com.sam.service.BackService;
@Service
public class BackServiceImpl implements BackService {
	
	@Autowired
	private BackDao bsckDao;
	
	@Autowired
	private InfoDao infoDao;
	
	
	
	@Override
	public int addAssetBack(AssetBack assetBack, Integer abid) throws Exception {
		System.out.println("assetBack:"+assetBack);
		System.out.println("添加AssetBack");
		int num = bsckDao.addAssetBack(assetBack);
		return num;
	}

}
