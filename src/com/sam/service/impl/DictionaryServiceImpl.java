package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.DictionaryDao;
import com.sam.entity.AssetDictionary;
import com.sam.service.DictionaryService;

/**
 * 字典表的serviceimpl
 * 
 * @author yty
 *
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {

	@Autowired
	private DictionaryDao dictionaryDao;

	/**
	 * 查询字典表的所有内容
	 */
	@Override
	public List<AssetDictionary> findAllDictionary(Integer dicttype) throws Exception {
		return dictionaryDao.findAllDictionary(dicttype);
	}

}
