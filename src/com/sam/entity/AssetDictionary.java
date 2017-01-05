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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AssetDictionary))
			return false;
		AssetDictionary castOther = (AssetDictionary) other;

		return ((this.getAdtype() == castOther.getAdtype()) || (this
				.getAdtype() != null && castOther.getAdtype() != null && this
				.getAdtype().equals(castOther.getAdtype())))
				&& ((this.getAsname() == castOther.getAsname()) || (this
						.getAsname() != null && castOther.getAsname() != null && this
						.getAsname().equals(castOther.getAsname())))
				&& ((this.getArname() == castOther.getArname()) || (this
						.getArname() != null && castOther.getArname() != null && this
						.getArname().equals(castOther.getArname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAdtype() == null ? 0 : this.getAdtype().hashCode());
		result = 37 * result
				+ (getAsname() == null ? 0 : this.getAsname().hashCode());
		result = 37 * result
				+ (getArname() == null ? 0 : this.getArname().hashCode());
		return result;
	}

}