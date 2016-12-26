package com.sam.entity;

/**
 * Assetdepartment entity. @author MyEclipse Persistence Tools
 */

public class AssetDepartment implements java.io.Serializable {

	// Fields

	private Integer adid;
	private String adname;
	private Integer adlevel;

	// Constructors

	/** default constructor */
	public AssetDepartment() {
	}

	/** full constructor */
	public AssetDepartment(String adname, Integer adlevel) {
		this.adname = adname;
		this.adlevel = adlevel;
	}

	// Property accessors

	public Integer getAdid() {
		return this.adid;
	}

	public void setAdid(Integer adid) {
		this.adid = adid;
	}

	public String getAdname() {
		return this.adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
	}

	public Integer getAdlevel() {
		return this.adlevel;
	}

	public void setAdlevel(Integer adlevel) {
		this.adlevel = adlevel;
	}

}