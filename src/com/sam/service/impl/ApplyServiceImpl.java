package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.ApplyDao;
import com.sam.entity.AssetApply;
import com.sam.entity.Pager;
import com.sam.service.ApplyService;

@Service
public class ApplyServiceImpl implements ApplyService{
	@Autowired
	private ApplyDao applyDao;

	@Override
	public int addAppply(AssetApply assetapply) throws Exception {
		// TODO Auto-generated method stub
		return applyDao.addApply(assetapply);
	}

	public List<AssetApply> findAllApply() throws Exception {
		// TODO Auto-generated method stub
		return applyDao.findApply();
	}

	@Override
	public Pager<AssetApply> findApply(int pageNum, int pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		List<AssetApply> applyList = findAllApply();
		Pager<AssetApply> pager = new Pager<AssetApply>(pageNum,pageSize,applyList);
		return pager;
	}

	@Override
	public Pager<AssetApply> findApplyByAinameAndAdname(AssetApply assetapply,
			Integer pageNum, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		List<AssetApply> applyList = applyDao.findApplyByAinameAndAdname(assetapply);
		Pager<AssetApply> pager = new Pager<AssetApply>(pageNum,pageSize,applyList);
		return pager;
	}

	@Override
	public int updateApply(Integer aaid) throws Exception {
		// TODO Auto-generated method stub
		int num = applyDao.updateApply(aaid);
		return num;
	}

	@Override
	public int deleteApply(Integer aaid) throws Exception {
		// TODO Auto-generated method stub
		int num = applyDao.deleteApply(aaid);
		return num;
	}

	
	

}
