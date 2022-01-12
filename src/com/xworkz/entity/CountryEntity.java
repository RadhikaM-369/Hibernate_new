package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countryDetailss")
public class CountryEntity {
	@Id
	@Column(name="countryID")
	private int countryId;
	
	@Column(name="countryname")
	private String countryName;
	
	@Column(name="countrycode")
	private int countryCode;
	
	@Column(name="FamousFor")
	private String famousFor;
	
	@Column(name="countrypopulation")
	private int countryPopulation;
	
	public CountryEntity() {
		
	}

	public CountryEntity(int countryId, String countryName, int countryCode, String famousFor,
			int countryPopulation) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.famousFor = famousFor;
		this.countryPopulation = countryPopulation;
	}

	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getFamousFor() {
		return famousFor;
	}
	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	public int getCountryPopulation() {
		return countryPopulation;
	}
	public void setCountryPopulation(int countryPopulation) {
		this.countryPopulation = countryPopulation;
	}

	@Override
	public String toString() {
		return "CountryEntity [countryId=" + countryId + ", countryName=" + countryName + ", countryCode=" + countryCode
				+ ", famousFor=" + famousFor + ", countryPopulation=" + countryPopulation + "]";
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
