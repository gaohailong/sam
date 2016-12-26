package com.sam.entity;

/**
 * AssetdictionaryId entity. @author MyEclipse Persistence Tools
 */

public class AssetDictionary implements java.io.Serializable {

	// Fields

	private Integer adtype;
	private String asname;
	private String arname;

	// Constructors

	/** default constructor */
	public AssetDictionary() {
	}

	/** full constructor */
	public AssetDictionary(Integer adtype, String asname, String arname) {
		this.adtype = adtype;
		this.asname = asname;
		this.arname = arname;
	}

	// Property accessors

	public Integer getAdtype() {
		return this.adtype;
	}

	public void setAdtype(Integer adtype) {
		this.adtype = adtype;
	}

	public String getAsname() {
		return this.asname;
	}

	public void setAsname(String asname) {
		this.asname = asname;
	}

	public String getArname() {
		return this.arname;
	}

	public void setArname(String arname) {
		this.arname = arname;
	}

}