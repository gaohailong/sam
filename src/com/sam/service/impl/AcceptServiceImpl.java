package com.sam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sam.dao.AcceptDao;
import com.sam.dao.InfoDao;
import com.sam.entity.AssetAccept;
import com.sam.entity.AssetInfo;
import com.sam.service.AcceptService;

public class AcceptServiceImpl implements AcceptService{

	@Autowired
	private AcceptDao acceptDao;
	@Autowired
	private InfoDao infoDao;
	
	@Override
	public int addAccept(AssetAccept accept, AssetInfo info) throws Exception {
		// TODO Auto-generated method stub
		int num = acceptDao.addAccept(accept);
		if(num>0){
			num = infoDao.addInfo(info);
		}
		return num;
	}

	
}
