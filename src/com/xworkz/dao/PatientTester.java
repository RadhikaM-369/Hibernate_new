package com.xworkz.dao;

import com.xworkz.entity.PatientEntity;

public class PatientTester {
	public static void main(String args[]) {
	
		PatientEntity pe= new PatientEntity(101, "Ram", "Bangalore", 25);
		PatientEntity pe1= new PatientEntity(102, "Rakesh", "Bangalore", 27);
		PatientEntity pe2= new PatientEntity(103, "Vikram", "Bangalore", 23);
		
		PatientDao pinterface=new PatientImpl();
		pinterface.create(pe);
		pinterface.create(pe1);
		pinterface.create(pe2);
		
		PatientEntity pEntity=pinterface.getById(102);
		System.out.println(pEntity);
		
		pinterface.delete(103);
	}

}
