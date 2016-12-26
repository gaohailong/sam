package com.sam.entity;

import java.util.Date;

/**
 * Assetaccept entity. @author MyEclipse Persistence Tools
 */

public class AssetAccept implements java.io.Serializable {

	// Fields

	private Integer aaid;
	private String aaname;
	private Integer aiid;
	private String ainame;
	private Integer aanumber;
	private String aatype;
	private Date aadate;
	private Integer aaprice;
	private Date aalife;
	private String ahname;

	// Constructors

	/** default constructor */
	public AssetAccept() {
	}

	/** full constructor */
	public AssetAccept(String aaname, Integer aiid, String ainame, Integer aanumber,
			String aatype, Date aadate, Integer aaprice,
			Date aalife, String ahname) {
		this.aaname = aaname;
		this.aiid = aiid;
		this.ainame = ainame;
		this.aanumber = aanumber;
		this.aatype = aatype;
		this.aadate = aadate;
		this.aaprice = aaprice;
		this.aalife = aalife;
		this.ahname = ahname;
	}

	// Property accessors

	public Integer getAaid() {
		return this.aaid;
	}

	public void setAaid(Integer aaid) {
		this.aaid = aaid;
	}

	public String getAaname() {
		return this.aaname;
	}

	public void setAaname(String aaname) {
		this.aaname = aaname;
	}

	public Integer getAiid() {
		return this.aiid;
	}

	public void setAiid(Integer aiid) {
		this.aiid = aiid;
	}

	public String getAiname() {
		return this.ainame;
	}

	public void setAiname(String ainame) {
		this.ainame = ainame;
	}

	public Integer getAanumber() {
		return this.aanumber;
	}

	public void setAanumber(Integer aanumber) {
		this.aanumber = aanumber;
	}

	public String getAatype() {
		return this.aatype;
	}

	public void setAatype(String aatype) {
		this.aatype = aatype;
	}

	public Date getAadate() {
		return this.aadate;
	}

	public void setAadate(Date aadate) {
		this.aadate = aadate;
	}

	public Integer getAaprice() {
		return this.aaprice;
	}

	public void setAaprice(Integer aaprice) {
		this.aaprice = aaprice;
	}

	public Date getAalife() {
		return this.aalife;
	}

	public void setAalife(Date aalife) {
		this.aalife = aalife;
	}

	public String getAhname() {
		return this.ahname;
	}

	public void setAhname(String ahname) {
		this.ahname = ahname;
	}

}