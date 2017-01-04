package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetDictionary;

/**
 * 字典表相关
 * @author yty
 *
 */
public interface DictionaryDao {
	
	/**
	 * 查询字典表的所有内容
	 * @return
	 * @throws Exception
	 */
	List<AssetDictionary> findAllDictionary(Integer dicttype) throws Exception;
}
