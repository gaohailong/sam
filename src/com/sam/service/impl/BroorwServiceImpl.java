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
		return pager;
	}
	
	public List<AssetBroorw> findAllBroorws() throws Exception {
		return broorwDao.findBroorws();
	}

	@Override
	public Pager<AssetBroorw> findBroorwsByCondition(AssetBroorw broorw,Integer page,Integer pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		List<AssetBroorw> broorwList = broorwDao.findBroorwsByCondition(broorw);
		Pager<AssetBroorw> pager = new Pager<AssetBroorw>(page, pageSize, broorwList);
		return pager;
	}

	@Override
	public int updBroorwWhenOk(Integer abid) throws Exception {
		// TODO Auto-generated method stub
		AssetBroorw broorw = broorwDao.findBroorwByAbid(abid);
		AssetInfo info = new AssetInfo();
		info.setBroorwid(abid);
		info.setAdname(broorw.getAdname());
		infoDao.updInfoWhenBroorwOk(info);
		return broorwDao.updBroorwWhenOk(abid);
	}

	@Override
	public int updBroorwWhenRefuse(AssetBroorw broorw) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("sssssssssssssssss"+broorw.getAbid());
		infoDao.updInfoWhenBroorwRefuse(broorw.getAbid());
		return broorwDao.updBroorwWhenRefuse(broorw);
	}


}
