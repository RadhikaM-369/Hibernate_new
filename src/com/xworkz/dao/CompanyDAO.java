package com.xworkz.dao;

import com.xworkz.entity.CompanyEntity;

public interface CompanyDAO {
	void create(CompanyEntity entity);
	default CompanyEntity getById(int id) {
		return null;
	}
	default void updateById(String name,int id) {
		
	}
	default void deleteById(int id) {
		
	}
}
