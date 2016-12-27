package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetInfo;

public interface InfoDao {

	int addInfo(AssetInfo info) throws Exception;
	
	List<AssetInfo> findInfoByAiname(String ainame) throws Exception;

	AssetInfo findInfoByAiid(Integer aiid) throws Exception;
	
	int updInfoAsname(String asname,Integer aiid) throws Exception;
	
	int updInfoAcid(String asname,Integer acid,Integer aiid) throws Exception;
	
}
