package com.sam.service;

import java.util.List;

import com.sam.entity.AssetChartUtils;

/**
 * 图表
 * @author gaohailong
 *
 */
public interface AcceptChartService {
	List<AssetChartUtils> findLineChart();
}
