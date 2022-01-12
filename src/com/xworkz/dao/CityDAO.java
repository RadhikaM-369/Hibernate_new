package com.xworkz.dao;

import com.xworkz.entity.CityEntity;

public interface CityDAO {
	public void save(CityEntity entity);
	
	public CityEntity getById(int Id);
	
	default void updateCityName(String newcity,int id) {
		return;
	}
	default void delete(int Id) {
	}
	

}
