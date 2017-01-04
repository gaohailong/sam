package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.ActionMapping;

import com.sam.entity.AssetDictionary;
import com.sam.service.DictionaryService;

/**
 * 字典表的controller
 * @author yty
 *
 */
@Controller
@RequestMapping(value="/dictionary")
public class DictionaryController {

	@Autowired
	private DictionaryService dictionaryService;
	
	/**
	 * 查询所有的dictionary
	 * @return
	 */
	@RequestMapping(value="/findAllDictionary", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetDictionary> findAllDictionary(){
		List<AssetDictionary> dictionaryList = null;
		try {
			dictionaryList = dictionaryService.findAllDictionary();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dictionaryList;
	}
}
