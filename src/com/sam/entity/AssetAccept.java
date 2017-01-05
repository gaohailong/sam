package com.sam.entity;

import java.util.Date;

/**
 * Assetaccept entity. @author MyEclipse Persistence Tools
 */

public class AssetAccept implements java.io.Serializable {

	// Fields

	private Integer aaid;
	private String aaname;
	private String ainame;
	private Integer aanumber;
	private String aatype;
	private Date aadate;
	private Double aaprice;
	private String ahname;

	// Constructors

	/** default constructor */
	public AssetAccept() {
	}

	/** minimal constructor */
	public AssetAccept(Integer aaid) {
		this.aaid = aaid;
	}

	/** full constructor */
	public AssetAccept(Integer aaid, String aaname, String ainame, Integer aanumber,
			String aatype, Date aadate, Double aaprice, String ahname) {
		this.aaid = aaid;
		this.aaname = aaname;
		this.ainame = ainame;
		this.aanumber = aanumber;
		this.aatype = aatype;
		this.aadate = aadate;
		this.aaprice = aaprice;
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

	public Double getAaprice() {
		return this.aaprice;
	}

	public void setAaprice(Double aaprice) {
		this.aaprice = aaprice;
	}

	public String getAhname() {
		return this.ahname;
	}

	public void setAhname(String ahname) {
		this.ahname = ahname;
	}

}