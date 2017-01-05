package com.sam.entity;

import java.util.Date;

/**
 * Assetapply entity. @author MyEclipse Persistence Tools
 */

public class AssetApply implements java.io.Serializable {

	// Fields

	private Integer aaid;
	private String adname;
	private String auname;
	private Date audate;
	private String ainame;
	private String ausupply;
	private Integer aunumber;
	private Double aumoney;
	private String aureason;
	private String auremark;
	private String auresult;
	private String auresultremark;

	// Constructors

	/** default constructor */
	public AssetApply() {
	}

	/** minimal constructor */
	public AssetApply(Integer aaid) {
		this.aaid = aaid;
	}

	/** full constructor */
	public AssetApply(Integer aaid, String adname, String auname, Date audate,
			String ainame, String ausupply, Integer aunumber, Double aumoney,
			String aureason, String auremark, String auresult,
			String auresultremark) {
		this.aaid = aaid;
		this.adname = adname;
		this.auname = auname;
		this.audate = audate;
		this.ainame = ainame;
		this.ausupply = ausupply;
		this.aunumber = aunumber;
		this.aumoney = aumoney;
		this.aureason = aureason;
		this.auremark = auremark;
		this.auresult = auresult;
		this.auresultremark = auresultremark;
	}

	// Property accessors

	public Integer getAaid() {
		return this.aaid;
	}

	public void setAaid(Integer aaid) {
		this.aaid = aaid;
	}

	public String getAdname() {
		return this.adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
	}

	public String getAuname() {
		return this.auname;
	}

	public void setAuname(String auname) {
		this.auname = auname;
	}

	public Date getAudate() {
		return this.audate;
	}

	public void setAudate(Date audate) {
		this.audate = audate;
	}

	public String getAiname() {
		return this.ainame;
	}

	public void setAiname(String ainame) {
		this.ainame = ainame;
	}

	public String getAusupply() {
		return this.ausupply;
	}

	public void setAusupply(String ausupply) {
		this.ausupply = ausupply;
	}

	public Integer getAunumber() {
		return this.aunumber;
	}

	public void setAunumber(Integer aunumber) {
		this.aunumber = aunumber;
	}

	public Double getAumoney() {
		return this.aumoney;
	}

	public void setAumoney(Double aumoney) {
		this.aumoney = aumoney;
	}

	public String getAureason() {
		return this.aureason;
	}

	public void setAureason(String aureason) {
		this.aureason = aureason;
	}

	public String getAuremark() {
		return this.auremark;
	}

	public void setAuremark(String auremark) {
		this.auremark = auremark;
	}

	public String getAuresult() {
		return this.auresult;
	}

	public void setAuresult(String auresult) {
		this.auresult = auresult;
	}

	public String getAuresultremark() {
		return this.auresultremark;
	}

	public void setAuresultremark(String auresultremark) {
		this.auresultremark = auresultremark;
	}

}