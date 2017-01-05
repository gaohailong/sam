package com.sam.entity;

/**
 * Assetuser entity. @author MyEclipse Persistence Tools
 */

public class AssetUser implements java.io.Serializable {

	// Fields

	private Integer auid;
	private String urname;
	private String udname;
	private String auname;
	private String aupass;
	private String auphone;

	// Constructors

	/** default constructor */
	public AssetUser() {
	}

	/** minimal constructor */
	public AssetUser(Integer auid) {
		this.auid = auid;
	}

	/** full constructor */
	public AssetUser(Integer auid, String urname, String udname, String auname,
			String aupass, String auphone) {
		this.auid = auid;
		this.urname = urname;
		this.udname = udname;
		this.auname = auname;
		this.aupass = aupass;
		this.auphone = auphone;
	}

	// Property accessors

	public Integer getAuid() {
		return this.auid;
	}

	public void setAuid(Integer auid) {
		this.auid = auid;
	}

	public String getUrname() {
		return this.urname;
	}

	public void setUrname(String urname) {
		this.urname = urname;
	}

	public String getUdname() {
		return this.udname;
	}

	public void setUdname(String udname) {
		this.udname = udname;
	}

	public String getAuname() {
		return this.auname;
	}

	public void setAuname(String auname) {
		this.auname = auname;
	}

	public String getAupass() {
		return this.aupass;
	}

	public void setAupass(String aupass) {
		this.aupass = aupass;
	}

	public String getAuphone() {
		return this.auphone;
	}

	public void setAuphone(String auphone) {
		this.auphone = auphone;
	}

}