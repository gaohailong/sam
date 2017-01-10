package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.InfoDao;
import com.sam.entity.AssetChartUtils;
import com.sam.service.AcceptChartService;

@Service
public class AcceptChartServiceImpl implements AcceptChartService {
	@Autowired
	private InfoDao infoDao;
	
	@Override
	public List<AssetChartUtils> findLineChart() {
		infoDao.
		return null;
	}
	
}
