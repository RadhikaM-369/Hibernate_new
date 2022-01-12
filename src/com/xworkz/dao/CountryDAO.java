package com.xworkz.dao;

import com.xworkz.entity.CountryEntity;

public interface CountryDAO {
	public void save(CountryEntity countryEntity);
	public CountryEntity getById(int Id);
	default void updateCity_name(String newCity, int id) {
		return;
	}
	default void delete(int Id) {
	}
}
