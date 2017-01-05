package com.sam.entity;

import java.util.Date;

/**
 * Assetchange entity. @author MyEclipse Persistence Tools
 */

public class AssetChange implements java.io.Serializable {

	// Fields

	private Integer acid;
	private String auname;
	private Date acdate;
	private String adname;
	private String acresult;

	// Constructors

	/** default constructor */
	public AssetChange() {
	}

	/** minimal constructor */
	public AssetChange(Integer acid) {
		this.acid = acid;
	}

	/** full constructor */
	public AssetChange(Integer acid, String auname, Date acdate, String adname,
			String acresult) {
		this.acid = acid;
		this.auname = auname;
		this.acdate = acdate;
		this.adname = adname;
		this.acresult = acresult;
	}

	// Property accessors

	public Integer getAcid() {
		return this.acid;
	}

	public void setAcid(Integer acid) {
		this.acid = acid;
	}

	public String getAuname() {
		return this.auname;
	}

	public void setAuname(String auname) {
		this.auname = auname;
	}

	public Date getAcdate() {
		return this.acdate;
	}

	public void setAcdate(Date acdate) {
		this.acdate = acdate;
	}

	public String getAdname() {
		return this.adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
	}

	public String getAcresult() {
		return this.acresult;
	}

	public void setAcresult(String acresult) {
		this.acresult = acresult;
	}

}