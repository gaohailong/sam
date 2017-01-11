package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.TypeDao;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetType;
import com.sam.entity.AssetUser;
import com.sam.entity.Pager;
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

	@Override
	public List<AssetType> findAssetTypeByAtlevel(Integer atlevel) {
		return typeDao.findAssetTypeByAtlevel(atlevel);
	}

	@Override
	public Pager<AssetInfo> findAssetInfosByatname(String atname, int pageNum,
			int pageSize) {
		List<AssetInfo> assetInfoList = findAssetInfosByatname(atname);
		Pager<AssetInfo> pager = new Pager<AssetInfo>(pageNum, pageSize, assetInfoList);
		return pager;
	}
	
	private List<AssetInfo> findAssetInfosByatname(String atname){
		return typeDao.findAssetInfosByatname(atname);
	}

	@Override
	public List<AssetType> findAllSecondAssetType() {
		return typeDao.findAllSecondAssetType();
	}

	@Override
	public int addType(AssetType assettype) throws Exception {
		// TODO Auto-generated method stub
		return typeDao.addType(assettype);
	}

	@Override
	public int addTypeSecond(AssetType assettype)
			throws Exception {
		// TODO Auto-generated method stub
		return typeDao.addTypeSecond(assettype);
	}

	@Override
	public Pager<AssetType> findType(int pageNum, int pageSize, int ahlevel)
			throws Exception {
		// TODO Auto-generated method stub
		List<AssetType> typeList = findAssetTypeByAtlevel(ahlevel);
		Pager<AssetType> pager = new Pager<AssetType>(pageNum,pageSize,typeList);
		return pager;
	}

	@Override
	public Pager<AssetType> findTypeSecond(int pageNum, int pageSize, int atid)
			throws Exception {
		// TODO Auto-generated method stub
		List<AssetType> typeList = findAssetTypeByAtlevel(atid);
		Pager<AssetType> pager = new Pager<AssetType>(pageNum,pageSize,typeList);
		return pager;
	}

	@Override
	public int deleteType(Integer atid) throws Exception {
		// TODO Auto-generated method stub
		return typeDao.deleteType(atid);
	}

	@Override
	public int updateType(AssetType assettype) throws Exception {
		// TODO Auto-generated method stub
		return typeDao.updateType(assettype);
	}

	
}
