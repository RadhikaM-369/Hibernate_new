package com.xworkz.dao;

import com.xworkz.entity.CityEntity;

public class CityTester {

	public static void main(String[] args) {
		
		CityEntity cityEntity = new CityEntity(10, "Belgaum", "India", 752185);
		CityEntity cityEntity1 = new CityEntity(11, "Texas City", "North America", 752185);
		CityEntity cityEntity2 = new CityEntity(12, "Ottawa", "Canada", 37742154);
		CityEntity cityEntity3 = new CityEntity(13, "Pune", "India", 752185);
		
		CityDAO cityInterface = new CityImpl();
	//cityInterface.save(cityEntity);
	cityInterface.save(cityEntity1);
	cityInterface.save(cityEntity2);
	cityInterface.save(cityEntity3);	
	
		CityEntity cEntity=cityInterface.getById(11);
		System.out.println(cEntity);
		cityInterface.updateCityName("mumbai", 13);
		//cityInterface.delete(10);
	}

}
