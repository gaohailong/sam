package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.TypeDao;
import com.sam.entity.AssetType;
import com.sam.service.AssetTypeService;

/**
 * 资产类型
 * @author gaohailong
 *
 */
@Service
public class AssetTypeServiceImpl implements AssetTypeService {

	@Autowired
	private TypeDao typeDao;

	@Override
	public List<AssetType> findAssetType() throws Exception {
		return typeDao.findAll();
	}

}
