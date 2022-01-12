package com.xworkz.dao;

import com.xworkz.entity.CountryEntity;

public class CountryTester {

	public static void main(String[] args) {
		
		CountryEntity ce=new CountryEntity(11,"India", 91, "Food&Culture",140068035);
		CountryEntity ce1=new CountryEntity(12,"Greece", 87, "Greek islands ",78068035);
		CountryEntity ce2=new CountryEntity(13,"Mexico", 64, "spicy cuisine &festive",32068035);
			
		CountryDAO DaoInterface=new CountryImpl();
		DaoInterface.save(ce);
		DaoInterface.save(ce1);
		DaoInterface.save(ce2);
		
		

		CountryEntity C_entity= DaoInterface.getById(12);
		System.out.println(C_entity);
		DaoInterface.updateCity_name("switzerland", 13);
		//DaoInterface.delete(13);
	}

}
