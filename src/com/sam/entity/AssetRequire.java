package com.sam.entity;

import java.util.Date;

/**
 * Assetrequire entity. @author MyEclipse Persistence Tools
 */

public class AssetRequire implements java.io.Serializable {

	// Fields

	private Integer arid;
	private AssetInfo assetinfo;
	private Date artime;
	private Integer arday;
	private String arperson;
	private String arphone;
	private String arstatus;

	// Constructors

	/** default constructor */
	public AssetRequire() {
	}

	/** full constructor */
	public AssetRequire(AssetInfo assetinfo, Date artime, Integer arday,
			String arperson, String arphone, String arstatus) {
		this.assetinfo = assetinfo;
		this.artime = artime;
		this.arday = arday;
		this.arperson = arperson;
		this.arphone = arphone;
		this.arstatus = arstatus;
	}

	// Property accessors

	public Integer getArid() {
		return this.arid;
	}

	public void setArid(Integer arid) {
		this.arid = arid;
	}

	public AssetInfo getAssetinfo() {
		return this.assetinfo;
	}

	public void setAssetinfo(AssetInfo assetinfo) {
		this.assetinfo = assetinfo;
	}

	public Date getArtime() {
		return this.artime;
	}

	public void setArtime(Date artime) {
		this.artime = artime;
	}

	public Integer getArday() {
		return this.arday;
	}

	public void setArday(Integer arday) {
		this.arday = arday;
	}

	public String getArperson() {
		return this.arperson;
	}

	public void setArperson(String arperson) {
		this.arperson = arperson;
	}

	public String getArphone() {
		return this.arphone;
	}

	public void setArphone(String arphone) {
		this.arphone = arphone;
	}

	public String getArstatus() {
		return this.arstatus;
	}

	public void setArstatus(String arstatus) {
		this.arstatus = arstatus;
	}

}