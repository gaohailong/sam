package com.sam.entity;

/**
 * Assethouse entity. @author MyEclipse Persistence Tools
 */

public class AssetHouse implements java.io.Serializable {

	// Fields

	private Integer ahid;
	private String ahname;
	private Integer ahnumber;
	private String auid;
	private String auname;
	private Integer aulevel;

	// Constructors

	/** default constructor */
	public AssetHouse() {
	}

	/** full constructor */
	public AssetHouse(String ahname, Integer ahnumber) {
		this.ahname = ahname;
		this.ahnumber = ahnumber;
	}
	
	// Property accessors

	public Integer getAhid() {
		return this.ahid;
	}

	public AssetHouse(Integer ahid, String ahname, Integer ahnumber,
			String auid, String auname, Integer aulevel) {
		super();
		this.ahid = ahid;
		this.ahname = ahname;
		this.ahnumber = ahnumber;
		this.auid = auid;
		this.auname = auname;
		this.aulevel = aulevel;
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

	public Integer getAhnumber() {
		return this.ahnumber;
	}

	public void setAhnumber(Integer ahnumber) {
		this.ahnumber = ahnumber;
	}

	public String getAuid() {
		return auid;
	}

	public void setAuid(String auid) {
		this.auid = auid;
	}

	public String getAuname() {
		return auname;
	}

	public void setAuname(String auname) {
		this.auname = auname;
	}

	public Integer getAulevel() {
		return aulevel;
	}

	public void setAulevel(Integer aulevel) {
		this.aulevel = aulevel;
	}
	
}