package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companyDetails")
public class CompanyEntity {
	@Id
	@Column(name="cId")
	private int compId;
	
	@Column(name="Cname")
	private String compName;
	
	@Column(name="cType")
	private String compType;
	
	@Column(name="contact")
	private long contactno;
	
	@Column(name="cwebsite")
	private String website;
	
	
	public CompanyEntity() {
		
	}

	public CompanyEntity(int compId, String compName, String compType, long contactno, String website) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.compType = compType;
		this.contactno = contactno;
		this.website = website;
	}

	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompType() {
		return compType;
	}
	public void setCompType(String compType) {
		this.compType = compType;
	}
	public double getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "CompanyEntity [compId=" + compId + ", compName=" + compName + ", compType=" + compType + ", contactno="
				+ contactno + ", website=" + website + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	
	
	

}
