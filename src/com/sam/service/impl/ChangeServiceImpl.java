package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.ChangeDao;
import com.sam.dao.InfoDao;
import com.sam.entity.AssetChange;
import com.sam.entity.AssetInfo;
import com.sam.service.ChangeService;
import com.sam.util.CreateRandom;

@Service
public class ChangeServiceImpl implements ChangeService{

	@Autowired
	private ChangeDao changeDao;
	@Autowired
	private InfoDao infoDao;
	
	@Override
	public int addChange(AssetChange change) throws Exception {
		// TODO Auto-generated method stub
		List<AssetInfo> infoList = infoDao.findInfoByAiname(change.getAiname());
		CreateRandom cr = new CreateRandom();
		int acid = cr.createRandom();
		change.setAcid(acid);
		if(infoList.size()>change.getAcnumber()){
			for(int i = 0;i<change.getAcnumber();i++){
				infoDao.updInfoAcid("使用中", change.getAcid(),infoList.get(i).getAiid());
			}
		}
		return changeDao.addChange(change);
	}
	
}
