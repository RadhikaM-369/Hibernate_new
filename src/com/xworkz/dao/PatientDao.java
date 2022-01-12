package com.xworkz.dao;

import com.xworkz.entity.PatientEntity;

public interface PatientDao {
	public void create(PatientEntity entity);
	public PatientEntity getById(int id);
	default void updatePatientEntity(String newbirth,int id) {
		return;
	}
	default void delete(int id) {
		
	}
}
