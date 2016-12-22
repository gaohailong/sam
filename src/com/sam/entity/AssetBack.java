package com.sam.entity;

import java.util.Date;

/**
 * Assetback entity. @author MyEclipse Persistence Tools
 */

public class AssetBack implements java.io.Serializable {

	// Fields

	private Integer abid;
	private String auname;
	private Integer auid;
	private String ainame;
	private Integer aiid;
	private Date abdate;
	private String abdeluser;
	private String abcontent;

	// Constructors

	/** default constructor */
	public AssetBack() {
	}

	/** full constructor */
	public AssetBack(String auname, Integer auid, String ainame, Integer aiid,
			Date abdate, String abdeluser, String abcontent) {
		this.auname = auname;
		this.auid = auid;
		this.ainame = ainame;
		this.aiid = aiid;
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

	public Integer getAuid() {
		return this.auid;
	}

	public void setAuid(Integer auid) {
		this.auid = auid;
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