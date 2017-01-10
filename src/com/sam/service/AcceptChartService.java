package com.sam.service;

import java.util.List;

import com.sam.entity.AssetChartUtils;

/**
 * 图表
 * @author gaohailong
 *
 */
public interface AcceptChartService {
	/**
	 * 资产查询
	 * @return
	 */
	List<AssetChartUtils> findLineChart();
	
	/**
	 * 仓库查询
	 * @author gaohailong
	 */
	List<AssetChartUtils> findHouseLineChart();
}
