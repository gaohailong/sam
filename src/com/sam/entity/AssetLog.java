package com.sam.entity;

import java.util.Date;

/**
 * Assetlog entity. @author MyEclipse Persistence Tools
 */

public class AssetLog implements java.io.Serializable {

	// Fields

	private Integer alid;
	private String auname;
	private String ainame;
	private Integer aiid;
	private String alop;
	private Date audate;

	// Constructors

	/** default constructor */
	public AssetLog() {
	}

	/** full constructor */
	public AssetLog(String auname, String ainame, Integer aiid, String alop,
			Date audate) {
		this.auname = auname;
		this.ainame = ainame;
		this.aiid = aiid;
		this.alop = alop;
		this.audate = audate;
	}

	// Property accessors

	public Integer getAlid() {
		return this.alid;
	}

	public void setAlid(Integer alid) {
		this.alid = alid;
	}

	public String getAuname() {
		return this.auname;
	}

	public void setAuname(String auname) {
		this.auname = auname;
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

	public String getAlop() {
		return this.alop;
	}

	public void setAlop(String alop) {
		this.alop = alop;
	}

	public Date getAudate() {
		return this.audate;
	}

	public void setAudate(Date audate) {
		this.audate = audate;
	}

}