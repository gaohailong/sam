package com.sam.entity;

import java.util.Date;

/**
 * Assetinfo entity. @author MyEclipse Persistence Tools
 */

public class AssetInfo implements java.io.Serializable {

	// Fields

	private Integer aiid;
	private Integer aicard;
	private String aimodel;
	private String ainame;
	private String atname;
	private String ahname;
	private String adname;
	private String asname;
	private Integer acceptid;
	private Integer repairid;
	private Integer backid;
	private Integer broorwid;
	private Integer changeid;
	private Date aidate;
	private String aimeasuer;
	private String aisupply;
	private Double aimoney;
	private String ailife;
	private String airemark;
	private String aidepreciation;
	private Double airemainratio;

	// Constructors

	/** default constructor */
	public AssetInfo() {
	}

	/** minimal constructor */
	public AssetInfo(Integer aiid) {
		this.aiid = aiid;
	}

	/** full constructor */
	public AssetInfo(Integer aiid, Integer aicard, String aimodel, String ainame,
			String atname, String ahname, String adname, String asname,
			Integer acceptid, Integer repairid, Integer backid, Integer broorwid,
			Integer changeid, Date aidate, String aimeasuer, String aisupply,
			Double aimoney, String ailife, String airemark,
			String aidepreciation, Double airemainratio) {
		this.aiid = aiid;
		this.aicard = aicard;
		this.aimodel = aimodel;
		this.ainame = ainame;
		this.atname = atname;
		this.ahname = ahname;
		this.adname = adname;
		this.asname = asname;
		this.acceptid = acceptid;
		this.repairid = repairid;
		this.backid = backid;
		this.broorwid = broorwid;
		this.changeid = changeid;
		this.aidate = aidate;
		this.aimeasuer = aimeasuer;
		this.aisupply = aisupply;
		this.aimoney = aimoney;
		this.ailife = ailife;
		this.airemark = airemark;
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

	public Integer getAicard() {
		return this.aicard;
	}

	public void setAicard(Integer aicard) {
		this.aicard = aicard;
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

	public Integer getAcceptid() {
		return this.acceptid;
	}

	public void setAcceptid(Integer acceptid) {
		this.acceptid = acceptid;
	}

	public Integer getRepairid() {
		return this.repairid;
	}

	public void setRepairid(Integer repairid) {
		this.repairid = repairid;
	}

	public Integer getBackid() {
		return this.backid;
	}

	public void setBackid(Integer backid) {
		this.backid = backid;
	}

	public Integer getBroorwid() {
		return this.broorwid;
	}

	public void setBroorwid(Integer broorwid) {
		this.broorwid = broorwid;
	}

	public Integer getChangeid() {
		return this.changeid;
	}

	public void setChangeid(Integer changeid) {
		this.changeid = changeid;
	}

	public Date getAidate() {
		return this.aidate;
	}

	public void setAidate(Date aidate) {
		this.aidate = aidate;
	}

	public String getAimeasuer() {
		return this.aimeasuer;
	}

	public void setAimeasuer(String aimeasuer) {
		this.aimeasuer = aimeasuer;
	}

	public String getAisupply() {
		return this.aisupply;
	}

	public void setAisupply(String aisupply) {
		this.aisupply = aisupply;
	}

	public Double getAimoney() {
		return this.aimoney;
	}

	public void setAimoney(Double aimoney) {
		this.aimoney = aimoney;
	}

	public String getAilife() {
		return this.ailife;
	}

	public void setAilife(String ailife) {
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

	public Double getAiremainratio() {
		return this.airemainratio;
	}

	public void setAiremainratio(Double airemainratio) {
		this.airemainratio = airemainratio;
	}

}