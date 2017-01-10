package com.sam.service;

import java.util.List;

import com.sam.entity.AssetBroorw;
import com.sam.entity.Pager;

public interface BroorwService {

	public int addBroow(AssetBroorw broorw,String numStr) throws Exception;
	
	public Pager<AssetBroorw> findBroorws(int pageNum, int pageSize) throws Exception;
}
