package com.sam.dao;

import com.sam.entity.AssetChange;

public interface ChangeDao {

	int addChange(AssetChange change) throws Exception;
}
