package com.sam.service;

import java.util.List;

import com.sam.entity.AssetDictionary;

/**
 * 字典表的service
 * 
 * @author yty
 *
 */
public interface DictionaryService {
	
	/**
	 * 查询字典表的所有内容
	 * 
	 * @return
	 * @throws Exception
	 */
	List<AssetDictionary> findAllDictionary(Integer dicttype) throws Exception;
}
