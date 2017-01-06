package com.sam.entity;

/**
 * Assetstatus entity. @author MyEclipse Persistence Tools
 */

public class AssetStatus implements java.io.Serializable {

	// Fields

	private Integer asid;
	private String asname;

	// Constructors

	/** default constructor */
	public AssetStatus() {
	}

	/** full constructor */
	public AssetStatus(String asname) {
		this.asname = asname;
	}

	// Property accessors

	public Integer getAsid() {
		return this.asid;
	}

	public void setAsid(Integer asid) {
		this.asid = asid;
	}

	public String getAsname() {
		return this.asname;
	}

	public void setAsname(String asname) {
		this.asname = asname;
	}

}