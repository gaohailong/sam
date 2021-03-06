package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.DepartmentDao;
import com.sam.entity.AssetDepartment;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetType;
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
	public Pager<AssetInfo> findAssets(int pageNum, int pageSize) throws Exception {
		List<AssetInfo> assetInfoList = findAssetInfos();
		Pager<AssetInfo> pager = new Pager<AssetInfo>(pageNum, pageSize, assetInfoList);
		return pager;
	}
	
	private List<AssetInfo> findAssetInfos() throws Exception {
		return departmentDao.findAssetInfos();
	}

	@Override
	public List<AssetDepartment> findAllSecondDepartments() throws Exception {
		// TODO Auto-generated method stub
		return departmentDao.findAllSecondDepartments();
	}

	@Override
	public int addDepartment(AssetDepartment assetdepartment) throws Exception {
		// TODO Auto-generated method stub
		return departmentDao.addDepartment(assetdepartment);
	}

	@Override
	public int addDepartmentSecond(AssetDepartment assetdepartment)
			throws Exception {
		// TODO Auto-generated method stub
		return departmentDao.addDepartmentSecond(assetdepartment);
	}

	@Override
	public Pager<AssetDepartment> findDepartment(int pageNum, int pageSize,
			int adlevel) throws Exception {
		// TODO Auto-generated method stub
		List<AssetDepartment> departmentList = findAssetDepartmentsByAdlevel(adlevel);
		Pager<AssetDepartment> pager = new Pager<AssetDepartment>(pageNum,pageSize,departmentList);
		return pager;
	}

	@Override
	public Pager<AssetDepartment> findDepartmentSecond(int pageNum,
			int pageSize, int adid) throws Exception {
		// TODO Auto-generated method stub
		List<AssetDepartment> departmentList = findAssetDepartmentsByAdlevel(adid);
		Pager<AssetDepartment> pager = new Pager<AssetDepartment>(pageNum,pageSize,departmentList);
		return pager;
	}

	@Override
	public int deleteDepartment(Integer adid) throws Exception {
		// TODO Auto-generated method stub
		return departmentDao.deleteDepartment(adid);
	}

	@Override
	public int updateDepartment(AssetDepartment assetdepartment)
			throws Exception {
		// TODO Auto-generated method stub
		return departmentDao.updateDepartment(assetdepartment);
	}

}
