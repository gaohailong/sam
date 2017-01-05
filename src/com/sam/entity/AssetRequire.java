package com.sam.entity;

import java.util.Date;

/**
 * Assetrequire entity. @author MyEclipse Persistence Tools
 */

public class AssetRequire implements java.io.Serializable {

	// Fields

	private Integer arid;
	private Date artime;
	private Integer arday;
	private String arperson;
	private String arphone;
	private String arstatus;

	// Constructors

	/** default constructor */
	public AssetRequire() {
	}

	/** minimal constructor */
	public AssetRequire(Integer arid) {
		this.arid = arid;
	}

	/** full constructor */
	public AssetRequire(Integer arid, Date artime, Integer arday, String arperson,
			String arphone, String arstatus) {
		this.arid = arid;
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