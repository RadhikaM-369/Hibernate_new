package com.xworkz.dao;

import com.xworkz.entity.CompanyEntity;

public class CompanyTester {

	public static void main(String[] args) {
		CompanyEntity companyE=new CompanyEntity(101, "Nestle", "Food", 9999888111L, "www.nestle.com");

		CompanyDAO dao=new CompanyImpl();
		dao.create(companyE);

	}

}
