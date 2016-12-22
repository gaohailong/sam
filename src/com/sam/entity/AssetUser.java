package com.sam.entity;

/**
 * Assetuser entity. @author MyEclipse Persistence Tools
 */

public class AssetUser implements java.io.Serializable {

	// Fields

	private Integer auid;
	private String urname;
	private Integer urid;
	private String udname;
	private Integer adid;
	private String auname;
	private String aupass;
	private String auphone;

	// Constructors

	/** default constructor */
	public AssetUser() {
	}

	/** full constructor */
	public AssetUser(String urname, Integer urid, String udname, Integer adid,
			String auname, String aupass, String auphone) {
		this.urname = urname;
		this.urid = urid;
		this.udname = udname;
		this.adid = adid;
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

	public Integer getUrid() {
		return this.urid;
	}

	public void setUrid(Integer urid) {
		this.urid = urid;
	}

	public String getUdname() {
		return this.udname;
	}

	public void setUdname(String udname) {
		this.udname = udname;
	}

	public Integer getAdid() {
		return this.adid;
	}

	public void setAdid(Integer adid) {
		this.adid = adid;
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