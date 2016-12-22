package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetType;

public interface TypeDao {

	public List<AssetType> findAll() throws Exception;
	
}
