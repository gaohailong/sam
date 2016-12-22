package com.sam.entity;

/**
 * Assetrole entity. @author MyEclipse Persistence Tools
 */

public class AssetRole implements java.io.Serializable {

	// Fields

	private Integer arid;
	private String ainame;

	// Constructors

	/** default constructor */
	public AssetRole() {
	}

	/** full constructor */
	public AssetRole(String ainame) {
		this.ainame = ainame;
	}

	// Property accessors

	public Integer getArid() {
		return this.arid;
	}

	public void setArid(Integer arid) {
		this.arid = arid;
	}

	public String getAiname() {
		return this.ainame;
	}

	public void setAiname(String ainame) {
		this.ainame = ainame;
	}

}