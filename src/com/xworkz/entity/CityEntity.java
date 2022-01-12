package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cityyDetails")
public class CityEntity {
	@Id
	@Column(name="cityId")
	private int cityID;
	
	@Column(name="cityname")
	private String cityName;
	
	@Column(name="cityCountry")
	private String citycountry;
	
	@Column(name="citypopulation")
	private int cityPopulation;
	
	public CityEntity() {
		
	}

	public CityEntity(int cityID, String cityName, String citycountry, int cityPopulation) {
		super();
		this.cityID = cityID;
		this.cityName = cityName;
		this.citycountry = citycountry;
		this.cityPopulation = cityPopulation;
	}

	public int getCityID() {
		return cityID;
	}
	public void setCityID(int cityID) {
		this.cityID = cityID;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCitycountry() {
		return citycountry;
	}
	public void setCitycountry(String citycountry) {
		this.citycountry = citycountry;
	}
	public int getCityPopulation() {
		return cityPopulation;
	}
	public void setCityPopulation(int cityPopulation) {
		this.cityPopulation = cityPopulation;
	}

	@Override
	public String toString() {
		return "CityEntity [cityID=" + cityID + ", cityName=" + cityName + ", citycountry=" + citycountry
				+ ", cityPopulation=" + cityPopulation + "]";
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
