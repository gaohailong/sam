package com.sam.entity;

/**
 * Assetbroorw entity. @author MyEclipse Persistence Tools
 */

public class AssetBroorw implements java.io.Serializable {

	// Fields

	private Integer abid;
	private String auname;
	private String abbackdate;
	private String abdate;
	private String adname;
	private String abreson;
	private String abresult;
	private String abresultremark;

	// Constructors

	/** default constructor */
	public AssetBroorw() {
	}

	/** minimal constructor */
	public AssetBroorw(Integer abid) {
		this.abid = abid;
	}

	/** full constructor */
	public AssetBroorw(Integer abid, String auname, String abbackdate,
			String abdate, String abreson, String adname, String abresult,
			String abresultremark) {
		this.abid = abid;
		this.auname = auname;
		this.abbackdate = abbackdate;
		this.abdate = abdate;
		this.adname = adname;
		this.abreson = abreson;
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

	public String getAuname() {
		return this.auname;
	}

	public void setAuname(String auname) {
		this.auname = auname;
	}

	public String getAbbackdate() {
		return this.abbackdate;
	}

	public void setAbbackdate(String abbackdate) {
		this.abbackdate = abbackdate;
	}

	public String getAbdate() {
		return this.abdate;
	}

	public void setAbdate(String abdate) {
		this.abdate = abdate;
	}

	public String getAdname() {
		return adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
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