package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.ActionMapping;

import com.sam.entity.AssetDictionary;
import com.sam.service.DictionaryService;

/**
 * 字典表的controller
 * 
 * @author yty
 *
 */
@Controller
@RequestMapping(value = "/dictionaryController")
public class DictionaryController {

	@Autowired
	private DictionaryService dictionaryService;

	/**
	 * 查询所有的dictionary
	 * 
	 * @return
	 */
	@RequestMapping(value = "/findAllDictionary", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetDictionary> findAllDictionary(
			@RequestParam(value = "dicttype", required = true) Integer dicttype) {
		List<AssetDictionary> dictionaryList = null;
		try {
			dictionaryList = dictionaryService.findAllDictionary(dicttype);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dictionaryList;
	}
}
