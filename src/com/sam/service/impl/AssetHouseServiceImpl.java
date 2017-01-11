package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.HouseDao;
import com.sam.entity.AssetHouse;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetUser;
import com.sam.entity.Pager;
import com.sam.service.AssetHouseService;

@Service
public class AssetHouseServiceImpl implements AssetHouseService {
	@Autowired
	private HouseDao houseDao;

	@Override
	public List<AssetHouse> findAllHouse() throws Exception {
		return houseDao.findAllHouse();
	}

	@Override
	public List<AssetHouse> findHouseByAhlevel(Integer ahleval)
			throws Exception {
		return houseDao.findHouseByAhlevel(ahleval);
	}

	@Override
	public Pager<AssetInfo> findAssetInfos(String ahname, int pageNum,
			int pageSize) throws Exception {
		List<AssetInfo> assetInfoList = findAssetInfos(ahname);
		Pager<AssetInfo> pager = new Pager<AssetInfo>(pageNum, pageSize, assetInfoList);
		return pager;
	}
	
	private List<AssetInfo> findAssetInfos(String ahname) throws Exception {
		return houseDao.findAssetInfosByAhname(ahname);
		
	}

	@Override
	public int addHouse(AssetHouse assethouse) throws Exception {
		// TODO Auto-generated method stub
		return houseDao.addHouse(assethouse);
	}

	@Override
	public int deleteHouse(Integer ahid) throws Exception {
		// TODO Auto-generated method stub
		return houseDao.deleteHouse(ahid);
	}

	@Override
	public int updateHouse(AssetHouse assethouse) throws Exception {
		// TODO Auto-generated method stub
		return houseDao.updateHouse(assethouse);
	}

	@Override
	public Pager<AssetHouse> findHouse(int pageNum, int pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		List<AssetHouse> houseList = findAllHouse();
		Pager<AssetHouse> pager= new Pager<AssetHouse>(pageNum,pageSize,houseList);
		return pager;
	}



}
