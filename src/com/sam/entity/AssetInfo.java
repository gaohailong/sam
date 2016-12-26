package com.sam.entity;

import java.util.Date;

/**
 * Assetinfo entity. @author MyEclipse Persistence Tools
 */

public class AssetInfo implements java.io.Serializable {

	// Fields

	private Integer aiid;
	private String aimodel;
	private String ainame;
	private String atname;
	private String ahname;
	private String adname;
	private String asname;
	private Date aidate;
	private Date aimeasuer;
	private String aisupply;
	private Integer aimoney;
	private Integer aaid;
	private Date ailife;
	private Integer acid;
	private String airemark;
	private String aidepreciation;
	private Integer airemainratio;

	// Constructors

	/** default constructor */
	public AssetInfo() {
	}

	/** full constructor */
	public AssetInfo(String aimodel, String ainame, String atname,
			String ahname, String adname, String asname, Date aidate,
			Date aimeasuer, String aisupply, Integer aimoney,
			Date ailife, String airemark, String aidepreciation,
			Integer airemainratio,Integer aaid,Integer acid) {
		this.aimodel = aimodel;
		this.ainame = ainame;
		this.atname = atname;
		this.ahname = ahname;
		this.adname = adname;
		this.asname = asname;
		this.aidate = aidate;
		this.aimeasuer = aimeasuer;
		this.aisupply = aisupply;
		this.aimoney = aimoney;
		this.ailife = ailife;
		this.aaid = aaid ;
		this.airemark = airemark;
		this.acid = acid;
		this.aidepreciation = aidepreciation;
		this.airemainratio = airemainratio;
	}

	// Property accessors

	public Integer getAiid() {
		return this.aiid;
	}

	public void setAiid(Integer aiid) {
		this.aiid = aiid;
	}

	public String getAimodel() {
		return this.aimodel;
	}

	public void setAimodel(String aimodel) {
		this.aimodel = aimodel;
	}

	public String getAiname() {
		return this.ainame;
	}

	public void setAiname(String ainame) {
		this.ainame = ainame;
	}

	public String getAtname() {
		return this.atname;
	}

	public void setAtname(String atname) {
		this.atname = atname;
	}

	public String getAhname() {
		return this.ahname;
	}

	public void setAhname(String ahname) {
		this.ahname = ahname;
	}

	public String getAdname() {
		return this.adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
	}

	public String getAsname() {
		return this.asname;
	}

	public void setAsname(String asname) {
		this.asname = asname;
	}

	public Date getAidate() {
		return this.aidate;
	}

	public void setAidate(Date aidate) {
		this.aidate = aidate;
	}

	public Date getAimeasuer() {
		return this.aimeasuer;
	}

	public void setAimeasuer(Date aimeasuer) {
		this.aimeasuer = aimeasuer;
	}

	public String getAisupply() {
		return this.aisupply;
	}

	public void setAisupply(String aisupply) {
		this.aisupply = aisupply;
	}

	public Integer getAimoney() {
		return this.aimoney;
	}

	public void setAimoney(Integer aimoney) {
		this.aimoney = aimoney;
	}

	public Date getAilife() {
		return this.ailife;
	}

	public void setAilife(Date ailife) {
		this.ailife = ailife;
	}

	public String getAiremark() {
		return this.airemark;
	}

	public void setAiremark(String airemark) {
		this.airemark = airemark;
	}

	public String getAidepreciation() {
		return this.aidepreciation;
	}

	public void setAidepreciation(String aidepreciation) {
		this.aidepreciation = aidepreciation;
	}

	public Integer getAiremainratio() {
		return this.airemainratio;
	}

	public void setAiremainratio(Integer airemainratio) {
		this.airemainratio = airemainratio;
	}

	public Integer getAaid() {
		return aaid;
	}

	public void setAaid(Integer aaid) {
		this.aaid = aaid;
	}

	public Integer getAcid() {
		return acid;
	}

	public void setAcid(Integer acid) {
		this.acid = acid;
	}
	
}