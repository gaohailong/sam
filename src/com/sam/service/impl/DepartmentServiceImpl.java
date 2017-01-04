package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.DepartmentDao;
import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.Pager;
import com.sam.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	@Override
	public List<AssetDepartment> findAssetDepartmentsByAdlevel(Integer adlevel) {
		// TODO Auto-generated method stub
		return departmentDao.findAssetDepartmentsByAdlevel(adlevel);
	}

	@Override
	public Pager<AssetInfo> findAssetByDname(String dname,
			int pageNum, int pageSize) {
		
		List<AssetInfo> assetInfoList = findAssetInfosByDname(dname);
		
		Pager<AssetInfo> pager = new Pager<AssetInfo>(pageNum, pageSize, assetInfoList);
		return pager;
	}
	
	/**
	 * 根据部门name查询全部的资产
	 * @param dname
	 * @return
	 */
	private List<AssetInfo> findAssetInfosByDname(String dname) {
		/*AssetInfo assetInfo1 = new AssetInfo();
		AssetInfo assetInfo2 = new AssetInfo();
		AssetInfo assetInfo3 = new AssetInfo();
		List<AssetInfo> asList = new ArrayList<AssetInfo>();
		asList.add(assetInfo1);
		asList.add(assetInfo2);
		asList.add(assetInfo3);
		return asList;*/
		return departmentDao.findAssetInfosByDname(dname);
		
	}

	@Override
	public Pager<AssetInfo> findAssets(int pageNum, int pageSize) {
		List<AssetInfo> assetInfoList = findAssetInfos();
		Pager<AssetInfo> pager = new Pager<AssetInfo>(pageNum, pageSize, assetInfoList);
		return pager;
	}
	
	private List<AssetInfo> findAssetInfos() {
		return departmentDao.findAssetInfos();
	}

}
