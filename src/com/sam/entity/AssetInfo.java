package com.sam.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
	private Integer atid;
	private Integer ahid;
	private Date aidate;
	private Date aimeasuer;
	private String aisupply;
	private Integer aimoney;
	private Date ailife;
	private String airemark;
	private Set assetrequires = new HashSet(0);

	// Constructors

	/** default constructor */
	public AssetInfo() {
	}

	/** full constructor */
	public AssetInfo(String aimodel, String ainame, String atname,
			String ahname, Integer atid, Integer ahid, Date aidate, Date aimeasuer,
			String aisupply, Integer aimoney, Date ailife, String airemark,
			Set assetrequires) {
		this.aimodel = aimodel;
		this.ainame = ainame;
		this.atname = atname;
		this.ahname = ahname;
		this.atid = atid;
		this.ahid = ahid;
		this.aidate = aidate;
		this.aimeasuer = aimeasuer;
		this.aisupply = aisupply;
		this.aimoney = aimoney;
		this.ailife = ailife;
		this.airemark = airemark;
		this.assetrequires = assetrequires;
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

	public Integer getAtid() {
		return this.atid;
	}

	public void setAtid(Integer atid) {
		this.atid = atid;
	}

	public Integer getAhid() {
		return this.ahid;
	}

	public void setAhid(Integer ahid) {
		this.ahid = ahid;
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

	public Set getAssetrequires() {
		return this.assetrequires;
	}

	public void setAssetrequires(Set assetrequires) {
		this.assetrequires = assetrequires;
	}

}