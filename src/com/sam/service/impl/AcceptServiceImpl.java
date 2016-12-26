package com.sam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.AcceptDao;
import com.sam.dao.InfoDao;
import com.sam.entity.AssetAccept;
import com.sam.entity.AssetInfo;
import com.sam.service.AcceptService;
import com.sam.util.CreateRandom;

@Service
public class AcceptServiceImpl implements AcceptService{

	@Autowired
	private AcceptDao acceptDao;
	@Autowired
	private InfoDao infoDao;
	
	@Override
	public int addAccept(AssetAccept accept, AssetInfo info) throws Exception {
		// TODO Auto-generated method stub
		CreateRandom cr = new CreateRandom();
		int aaid = cr.createRandom();
		accept.setAaid(aaid);
		int num = acceptDao.addAccept(accept);
		if(num>0){
			info.setAaid(aaid);
			num = infoDao.addInfo(info);
		}
		return num;
	}

	
}
