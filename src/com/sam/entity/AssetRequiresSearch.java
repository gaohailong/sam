package com.sam.entity;

public class AssetRequiresSearch {
	
	private Integer beginDay;
	private Integer endDay;
	private String repairStatus;

	public AssetRequiresSearch() {
	}

	public AssetRequiresSearch(Integer beginDay, Integer endDay,
			String repairStatus) {
		this.beginDay = beginDay;
		this.endDay = endDay;
		this.repairStatus = repairStatus;
	}

	public Integer getBeginDay() {
		return beginDay;
	}

	public void setBeginDay(Integer beginDay) {
		this.beginDay = beginDay;
	}

	public Integer getEndDay() {
		return endDay;
	}

	public void setEndDay(Integer endDay) {
		this.endDay = endDay;
	}

	public String getRepairStatus() {
		return repairStatus;
	}

	public void setRepairStatus(String repairStatus) {
		this.repairStatus = repairStatus;
	}
	
	

}
