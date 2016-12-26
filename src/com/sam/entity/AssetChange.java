package com.sam.entity;

import java.util.Date;


/**
 * Assetchange entity. @author MyEclipse Persistence Tools
 */

public class AssetChange implements java.io.Serializable {

	// Fields

	private Integer acid;
	private String auname;
	private String ainame;
	private Integer acnumber;
	private Date acdate;
	private String adname;
	private String acresult;

	// Constructors

	/** default constructor */
	public AssetChange() {
	}

	/** full constructor */
	public AssetChange(String auname, String ainame, Date acdate,
			String adname, String acresult,Integer acnumber) {
		this.auname = auname;
		this.ainame = ainame;
		this.acdate = acdate;
		this.adname = adname;
		this.acresult = acresult;
		this.acnumber = acnumber;
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

	public String getAiname() {
		return this.ainame;
	}

	public void setAiname(String ainame) {
		this.ainame = ainame;
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

	public Integer getAcnumber() {
		return acnumber;
	}

	public void setAcnumber(Integer acnumber) {
		this.acnumber = acnumber;
	}

	
}