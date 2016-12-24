package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetInfo;

public interface InfoDao {

	int addInfo(AssetInfo info) throws Exception;
	
	List<AssetInfo> findInfoByAiname(String ainame) throws Exception;

	AssetInfo findInfoByAiid(Integer aiid) throws Exception;
	
	int updInfoAsname(String asname,Integer aiid) throws Exception;
	
	int updInfoAcid(String asname,Integer acid,Integer aiid) throws Exception;
	
	//根据使用状态查询设备
	public List<AssetInfo> findAssetInfoByAsname(String asname) throws Exception;
		
	//查询借出设备
	public List<AssetInfo> findAssetInfoByAbid(Integer abid) throws Exception;
		
}
