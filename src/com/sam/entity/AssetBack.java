package com.sam.entity;


/**
 * Assetback entity. @author MyEclipse Persistence Tools
 */

public class AssetBack implements java.io.Serializable {

	// Fields

	private Integer abid;
	private String auname;
	private String abdate;
	private String abdeluser;
	private Integer abroorwid;

	// Constructors

	/** default constructor */
	public AssetBack() {
	}

	/** minimal constructor */
	public AssetBack(Integer abid) {
		this.abid = abid;
	}

	/** full constructor */
	public AssetBack(Integer abid, String auname, String abdate, String abdeluser,
			Integer abroorwid) {
		this.abid = abid;
		this.auname = auname;
		this.abdate = abdate;
		this.abdeluser = abdeluser;
		this.abroorwid = abroorwid;
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

	public String getAbdate() {
		return this.abdate;
	}

	public void setAbdate(String abdate) {
		this.abdate = abdate;
	}

	public String getAbdeluser() {
		return this.abdeluser;
	}

	public void setAbdeluser(String abdeluser) {
		this.abdeluser = abdeluser;
	}

	public Integer getAbroorwid() {
		return abroorwid;
	}

	public void setAbroorwid(Integer abroorwid) {
		this.abroorwid = abroorwid;
	}

	@Override
	public String toString() {
		return "AssetBack [abid=" + abid + ", auname=" + auname + ", abdate="
				+ abdate + ", abdeluser=" + abdeluser + ", abroorwid="
				+ abroorwid + "]";
	}


}