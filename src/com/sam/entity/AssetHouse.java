package com.sam.entity;

/**
 * Assethouse entity. @author MyEclipse Persistence Tools
 */

public class AssetHouse implements java.io.Serializable {

	// Fields

	private Integer ahid;
	private String ahname;
	private Integer auid;
	private String auname;
	private Integer ahlevel;

	// Constructors

	/** default constructor */
	public AssetHouse() {
	}

	/** full constructor */
	public AssetHouse(String ahname, Integer auid, String auname, Integer ahlevel) {
		this.ahname = ahname;
		this.auid = auid;
		this.auname = auname;
		this.ahlevel = ahlevel;
	}

	// Property accessors

	public Integer getAhid() {
		return this.ahid;
	}

	public void setAhid(Integer ahid) {
		this.ahid = ahid;
	}

	public String getAhname() {
		return this.ahname;
	}

	public void setAhname(String ahname) {
		this.ahname = ahname;
	}

	public Integer getAuid() {
		return this.auid;
	}

	public void setAuid(Integer auid) {
		this.auid = auid;
	}

	public String getAuname() {
		return this.auname;
	}

	public void setAuname(String auname) {
		this.auname = auname;
	}

	public Integer getAhlevel() {
		return this.ahlevel;
	}

	public void setAhlevel(Integer ahlevel) {
		this.ahlevel = ahlevel;
	}

}