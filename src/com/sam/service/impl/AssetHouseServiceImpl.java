package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.HouseDao;
import com.sam.entity.AssetHouse;
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


}
