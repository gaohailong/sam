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
	
	/**
	 * 增加一条移交记录
	 */
	@Override
	public int addChange(AssetChange change) throws Exception {
		// TODO Auto-generated method stub
		/*List<AssetInfo> infoList = infoDao.findInfoByAiname(change);
		CreateRandom cr = new CreateRandom();
		int acid = cr.createRandom();
		change.setAcid(acid);
		infoDao.updInfoAcid("使用中", change.getAcid(),infoList.get(0).getAiid());
		if(infoList.size()>change.getAcnumber()){
			for(int i = 0;i<change.getAcnumber();i++){
			}
		}*/
		return changeDao.addChange(change);
	}
	
}
