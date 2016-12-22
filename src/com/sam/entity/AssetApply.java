package com.sam.entity;

import java.util.Date;

/**
 * Assetapply entity. @author MyEclipse Persistence Tools
 */

public class AssetApply implements java.io.Serializable {

	// Fields

	private Integer aaid;
	private String adname;
	private Integer adid;
	private String auname;
	private Integer auid;
	private Date audate;
	private String ainame;
	private Integer aiid;
	private String ausupply;
	private Integer aunumber;
	private Integer aumoney;
	private String aureason;
	private String auremark;
	private String auresult;
	private String auresultremark;

	// Constructors

	/** default constructor */
	public AssetApply() {
	}

	/** full constructor */
	public AssetApply(String adname, Integer adid, String auname, Integer auid,
			Date audate, String ainame, Integer aiid, String ausupply,
			Integer aunumber, Integer aumoney, String aureason,
			String auremark, String auresult, String auresultremark) {
		this.adname = adname;
		this.adid = adid;
		this.auname = auname;
		this.auid = auid;
		this.audate = audate;
		this.ainame = ainame;
		this.aiid = aiid;
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

	public Integer getAuid() {
		return this.auid;
	}

	public void setAuid(Integer auid) {
		this.auid = auid;
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

	public Integer getAiid() {
		return this.aiid;
	}

	public void setAiid(Integer aiid) {
		this.aiid = aiid;
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

	public Integer getAumoney() {
		return this.aumoney;
	}

	public void setAumoney(Integer aumoney) {
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