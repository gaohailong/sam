package com.sam.entity;

import java.util.Date;

/**
 * Assetbroorw entity. @author MyEclipse Persistence Tools
 */

public class AssetBroorw implements java.io.Serializable {

	// Fields

	private Long abid;
	private String auname;
	private Date abbackdate;
	private Date abdate;
	private String abstatus;
	private String abreson;
	private String abresult;
	private String abresultremark;

	// Constructors

	/** default constructor */
	public AssetBroorw() {
	}

	/** minimal constructor */
	public AssetBroorw(Long abid) {
		this.abid = abid;
	}

	/** full constructor */
	public AssetBroorw(Long abid, String auname, Date abbackdate, Date abdate,
			String abstatus, String abreson, String abresult,
			String abresultremark) {
		this.abid = abid;
		this.auname = auname;
		this.abbackdate = abbackdate;
		this.abdate = abdate;
		this.abstatus = abstatus;
		this.abreson = abreson;
		this.abresult = abresult;
		this.abresultremark = abresultremark;
	}

	// Property accessors

	public Long getAbid() {
		return this.abid;
	}

	public void setAbid(Long abid) {
		this.abid = abid;
	}

	public String getAuname() {
		return this.auname;
	}

	public void setAuname(String auname) {
		this.auname = auname;
	}

	public Date getAbbackdate() {
		return this.abbackdate;
	}

	public void setAbbackdate(Date abbackdate) {
		this.abbackdate = abbackdate;
	}

	public Date getAbdate() {
		return this.abdate;
	}

	public void setAbdate(Date abdate) {
		this.abdate = abdate;
	}

	public String getAbstatus() {
		return this.abstatus;
	}

	public void setAbstatus(String abstatus) {
		this.abstatus = abstatus;
	}

	public String getAbreson() {
		return this.abreson;
	}

	public void setAbreson(String abreson) {
		this.abreson = abreson;
	}

	public String getAbresult() {
		return this.abresult;
	}

	public void setAbresult(String abresult) {
		this.abresult = abresult;
	}

	public String getAbresultremark() {
		return this.abresultremark;
	}

	public void setAbresultremark(String abresultremark) {
		this.abresultremark = abresultremark;
	}

}