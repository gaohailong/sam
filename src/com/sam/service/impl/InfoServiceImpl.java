package com.sam.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.InfoDao;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;
import com.sam.entity.Pager;
import com.sam.service.InfoService;
import com.sam.util.ConstantUtil;

@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InfoDao infoDao;

	@Override
	public int addInfo(AssetInfo info) throws Exception {

		return infoDao.addInfo(info);
	}

	@Override
	public Pager<AssetInfo> findInfoByAsname(String asname,int pageNum, int pageSize) throws Exception {
		List<AssetInfo> assetInfoList = findInfoByAsname(asname);
		Pager<AssetInfo> pager = new Pager<AssetInfo>(pageNum, pageSize, assetInfoList);
		return pager;
	}
	private List<AssetInfo> findInfoByAsname(String asname) throws Exception {
		return infoDao.findInfoByAsname(asname);
	}
	@Override
	public List<AssetInfo> findInfoByAcid(Integer acid) throws Exception {
		return infoDao.findInfoByAcid(acid);
	}

	@Override
	public List<AssetRequire> findInfoArid(Integer arid) throws Exception {
		return infoDao.findInfoByArid(arid);
	}

	@Override
	public Pager<AssetInfo> findAssetByCondition(AssetInfo assetInfo,Integer pageNum,Integer pageSize)
			throws Exception {
		List<AssetInfo> assetInfos= infoDao.findInfoByCondition(assetInfo);
		Pager<AssetInfo> pager = new Pager<AssetInfo>(pageNum, pageSize, assetInfos);
		return pager;
	}

	

	@Override
	public Pager<AssetInfo> findAssets(int pageNum, int pageSize) {
		List<AssetInfo> assetInfoList = findAssetInfos();
		Pager<AssetInfo> pager = new Pager<AssetInfo>(pageNum, pageSize, assetInfoList);
		return pager;
	}
	
	private List<AssetInfo> findAssetInfos() {
		return infoDao.findAssetInfos();
	}
}
