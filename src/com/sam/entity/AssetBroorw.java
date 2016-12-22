package com.sam.entity;

import java.util.Date;

/**
 * Assetbroorw entity. @author MyEclipse Persistence Tools
 */

public class AssetBroorw implements java.io.Serializable {

	// Fields

	private Integer abid;
	private String ainame;
	private Integer aiid;
	private String auname;
	private Integer auid;
	private Date abbackdate;
	private Date abdate;
	private String abstatus;
	private String abreson;
	private Integer abnumebr;
	private String abresult;
	private String abresultremark;

	// Constructors

	/** default constructor */
	public AssetBroorw() {
	}

	/** full constructor */
	public AssetBroorw(String ainame, Integer aiid, String auname, Integer auid,
			Date abbackdate, Date abdate, String abstatus, String abreson,
			Integer abnumebr, String abresult, String abresultremark) {
		this.ainame = ainame;
		this.aiid = aiid;
		this.auname = auname;
		this.auid = auid;
		this.abbackdate = abbackdate;
		this.abdate = abdate;
		this.abstatus = abstatus;
		this.abreson = abreson;
		this.abnumebr = abnumebr;
		this.abresult = abresult;
		this.abresultremark = abresultremark;
	}

	// Property accessors

	public Integer getAbid() {
		return this.abid;
	}

	public void setAbid(Integer abid) {
		this.abid = abid;
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

	public Integer getAbnumebr() {
		return this.abnumebr;
	}

	public void setAbnumebr(Integer abnumebr) {
		this.abnumebr = abnumebr;
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