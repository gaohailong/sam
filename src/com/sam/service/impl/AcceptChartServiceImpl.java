package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.InfoDao;
import com.sam.entity.AssetChartUtils;
import com.sam.service.AcceptChartService;

/**
 * 图表
 * 
 * @author gaohailong
 *
 */
@Service
public class AcceptChartServiceImpl implements AcceptChartService {
	@Autowired
	private InfoDao infoDao;

	@Override
	public List<AssetChartUtils> findLineChart() {
		return infoDao.findLineChart();
	}

	@Override
	public List<AssetChartUtils> findHouseLineChart() {
		return infoDao.findHouseLineChart();
	}

	@Override
	public List<AssetChartUtils> findHouseCateAndWareChart() {
		return infoDao.findHouseCateAndWareChart();
	}

}
