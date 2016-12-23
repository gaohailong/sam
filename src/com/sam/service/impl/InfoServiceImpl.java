package com.sam.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.InfoDao;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;
import com.sam.service.InfoService;

@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InfoDao infoDao;

	@Override
	public int addInfo(AssetInfo info) throws Exception {

		return infoDao.addInfo(info);
	}

	public InfoDao getInfoDao() {
		return infoDao;
	}

	public void setInfoDao(InfoDao infoDao) {
		this.infoDao = infoDao;
	}

	@Override
	public List<AssetInfo> findInfoByAsname(String asname) throws Exception {
		// TODO Auto-generated method stub
		return infoDao.findInfoByAsname(asname);
	}

	@Override
	public List<AssetInfo> findInfoByAcid(Integer acid) throws Exception {
		// TODO Auto-generated method stub
		return infoDao.findInfoByAcid(acid);
	}

	@Override
	public List<AssetRequire> findInfoArid(Integer arid) throws Exception {
		// TODO Auto-generated method stub
		return infoDao.findInfoArid(arid);
	}
	
}
