package com.sam.entity;

/**
 * Assetdepartment entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class AssetDepartment implements java.io.Serializable {

	// Fields

	private Integer adid;
	private String adname;

	// Constructors

	/** default constructor */
	public AssetDepartment() {
	}

	/** full constructor */
	public AssetDepartment(String adname) {
		this.adname = adname;
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

}