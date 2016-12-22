package com.sam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.InfoDao;
import com.sam.entity.AssetInfo;
import com.sam.service.InfoService;

@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InfoDao infoDao;

	@Override
	public void addInfo(AssetInfo info) throws Exception {

		infoDao.addInfo(info);
	}

}
