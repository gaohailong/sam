package com.sam.entity;

import java.util.Date;

/**
 * Assetback entity. @author MyEclipse Persistence Tools
 */

public class AssetBack implements java.io.Serializable {

	// Fields

	private Integer abid;
	private String auname;
	private Date abdate;
	private String abdeluser;
	private String abcontent;

	// Constructors

	/** default constructor */
	public AssetBack() {
	}

	/** minimal constructor */
	public AssetBack(Integer abid) {
		this.abid = abid;
	}

	/** full constructor */
	public AssetBack(Integer abid, String auname, Date abdate, String abdeluser,
			String abcontent) {
		this.abid = abid;
		this.auname = auname;
		this.abdate = abdate;
		this.abdeluser = abdeluser;
		this.abcontent = abcontent;
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

	public Date getAbdate() {
		return this.abdate;
	}

	public void setAbdate(Date abdate) {
		this.abdate = abdate;
	}

	public String getAbdeluser() {
		return this.abdeluser;
	}

	public void setAbdeluser(String abdeluser) {
		this.abdeluser = abdeluser;
	}

	public String getAbcontent() {
		return this.abcontent;
	}

	public void setAbcontent(String abcontent) {
		this.abcontent = abcontent;
	}

}