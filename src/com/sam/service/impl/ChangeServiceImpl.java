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
	public int addChange(AssetChange change,String numStr) throws Exception {
		// TODO Auto-generated method stub
		CreateRandom cr = new CreateRandom();
		int acid = cr.createRandom();
		change.setAcid(acid);
		
		String[] num = numStr.split(",");
		
		for(int i=0;i<num.length;i++){
			if(num[i]!=null){
				System.out.println("acide"+acid);
				AssetInfo info = new AssetInfo();
				info.setAsname("使用中");
				info.setAcceptid(acid);
				info.setAdname(change.getAdname());
				info.setAiid(Integer.parseInt(num[i]));
					infoDao.updInfoAcid(info);
				}
		}
		return changeDao.addChange(change);
	}
	
}
