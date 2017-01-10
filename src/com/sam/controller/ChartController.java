package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetChartUtils;
import com.sam.service.AcceptChartService;

@Controller
@RequestMapping(value = "/chart")
public class ChartController {

	@Autowired
	private AcceptChartService acceptChartService;

	/**
	 * 
	 * @param change
	 * @return
	 */
	@RequestMapping(value = "/findLineChart", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetChartUtils> findLineChart() {
		try {
			return acceptChartService.findLineChart();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
