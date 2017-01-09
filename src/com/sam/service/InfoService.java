package com.sam.service;

import java.util.List;

import com.sam.entity.AssetInfo;
import com.sam.entity.AssetRequire;
import com.sam.entity.Pager;

public interface InfoService {
	/**
	 * 为设备表添加一条新的信息
	 * 
	 * @param info
	 * @throws Exception
	 */
	int addInfo(AssetInfo info) throws Exception;
	/**
	 * 根据设备id查询设备  yty
	 * @param aiid
	 * @return
	 * @throws Exception
	 */
	AssetInfo findInfoByAiid(Integer aiid) throws Exception;

	/**
	 * 根据使用状态查询设备
	 * 
	 * @param asname
	 * @return
	 * @throws Exception
	 */
	public Pager<AssetInfo> findInfoByAsname(String asname,int pageNum, int pageSize) throws Exception;

	/**
	 * 
	 * 查询借出设备
	 */
	public List<AssetInfo> findInfoByAcid(Integer acid) throws Exception;

	/**
	 * 查询维修中的设备
	 * 
	 * @param arid
	 * @return
	 * @throws Exception
	 */
	public List<AssetRequire> findInfoArid(Integer arid) throws Exception;

	/**
	 * @author gaohailong 设备条件查询
	 */
	Pager<AssetInfo> findAssetByCondition(AssetInfo assetInfo,Integer pageNum,Integer pageSize) throws Exception;
	

	/**
	 * 
	 * 查询全部的资产分页
	 * @param pageNum
	 * 			查询第几页数据
	 * @param pageSize
	 * 			每页显示多少条数据
	 * @return
	 */
	public Pager<AssetInfo> findAssets(int pageNum,int pageSize);
	
	/**
	 * 根据设备的类型查询的设备信息
	 * @param atname
	 * @return
	 * @throws Exception
	 */
	List<AssetInfo> findInfoByAtname(String atname) throws Exception;
	
	/**
	 * 根据设备类型名称查询剩余件数
	 * @param atname
	 * @return
	 * @throws Exception
	 */
	int findInfoNumByAtname(String atname) throws Exception;
}
