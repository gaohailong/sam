package com.sam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.InfoDao;
import com.sam.dao.RequireDao;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;
import com.sam.service.RequireService;
import com.sam.util.CreateRandom;

@Service
public class RequireServiceImpl implements RequireService{

	@Autowired
	private RequireDao requireDao;
	@Autowired
	private InfoDao infoDao;
	
	@Override
	public int addRequire(AssetRequire require) throws Exception{
		CreateRandom cr = new CreateRandom();
		int arid = cr.createRandom();
		require.setArid(arid);
		infoDao.updInfoAsname("维修中", require.getAiid());
		return requireDao.addRequire(require);
	}
}
