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
	public int addChange(AssetChange change,String infoStr,String numStr) throws Exception {
		// TODO Auto-generated method stub
		CreateRandom cr = new CreateRandom();
		int acid = cr.createRandom();
		change.setAcid(acid);
		
		String[] info = infoStr.split(",");
		String[] num = numStr.split(",");
		
		for(int i=0;i<info.length;i++){
			if(info[i]!=null){
				List<AssetInfo> infoList = infoDao.findInfoByAiname(info[i]);
				if(num[i]!=null){	
					for(int j=0;j<Integer.parseInt(num[i]);j++){
						infoList.get(j).setAsname("使用中");
						infoDao.updInfoAcid("使用中", acid, infoList.get(j).getAiid());
					}
				}
			}
		}
		return changeDao.addChange(change);
	}
	
}
