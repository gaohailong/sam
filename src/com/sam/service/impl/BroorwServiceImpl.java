package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.BroorwDao;
import com.sam.dao.InfoDao;
import com.sam.entity.AssetBroorw;
import com.sam.entity.AssetInfo;
import com.sam.entity.Pager;
import com.sam.service.BroorwService;
import com.sam.util.CreateRandom;

/**
 * 设备借出操作
 * @author zhw
 *
 */
@Service
public class BroorwServiceImpl implements BroorwService {
	
	@Autowired
	private BroorwDao broorwDao;
	@Autowired
	private InfoDao infoDao;

	/**
	 * 添加设备借出申请
	 */
	@Override
	public int addBroow(AssetBroorw broorw,String numStr) throws Exception {
		// TODO Auto-generated method stub
		CreateRandom cr = new CreateRandom();
		Integer abid = cr.createRandom();
		broorw.setAbid(abid);
		
		String[] num = numStr.split(",");
		for(int i=0;i<num.length;i++){
			if(num!=null){
				AssetInfo info = new AssetInfo();
				info.setAiid(Integer.parseInt(num[i]));
				info.setBroorwid(abid);
				infoDao.updInfoAddBroorw(info);
			}
		}
		
		return broorwDao.addBroow(broorw);
	}

	@Override
	public Pager<AssetBroorw> findBroorws(int pageNum, int pageSize)
			throws Exception {
		List<AssetBroorw> broorwList = findAllBroorws();
		Pager<AssetBroorw> pager = new Pager<AssetBroorw>(pageNum, pageSize, broorwList);
		return null;
	}
	
	public List<AssetBroorw> findAllBroorws() throws Exception {
		return broorwDao.findBroorws();
	}


}
