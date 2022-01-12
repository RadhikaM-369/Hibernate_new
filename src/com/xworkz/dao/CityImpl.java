package com.xworkz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.CityEntity;

public class CityImpl implements CityDAO {

	
	public void save(CityEntity entity) {
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(CityEntity.class);
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			System.out.println("invoked the create entity");
			Session session = factory.openSession();
			session.save(entity);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
			session.close();
		}
		factory.close();
	}

	
	public CityEntity getById(int Id) {
		CityEntity entity = null;
		System.out.println("invoked the getById");
		System.out.println("id passed as :" + Id);
		Configuration configuration = new Configuration().configure().addAnnotatedClass(CityEntity.class);//configuration is the 
		SessionFactory factory = configuration.buildSessionFactory();		//loaded file into hibernate 
		if (factory != null) {
			Session session = factory.openSession();
			entity = session.get(CityEntity.class, Id);
			if (entity != null) {
				System.out.println("entity found as id:" + Id);
			} else {
				System.out.println("entity is not found as id:" + Id);
			}
			session.close();
		}
		factory.close();
		return entity;
	}

	public void updateCity_name(String newCity, int id) {
		System.out.println("invoked update new capital city");
		System.out.println(newCity + " " + id);
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CityEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CityEntity entity = session.get(CityEntity.class, id);
			if (entity != null) {
				entity.setCityName(newCity);
				session.update(entity);
				transaction.commit();
				System.out.println("update capital city:" + id);
				session.close();
			}
			factory.close();
		}
	}

	@Override
	public void delete(int Id) {
		System.out.println("invoked the delete row");
		System.out.println(Id);
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CityEntity.class).buildSessionFactory();
		if(factory!=null) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			CityEntity entity=session.get(CityEntity.class, Id);
			if(entity!=null) {
				entity.setCityID(Id);
				session.delete(entity);
				transaction.commit();
				System.out.println("delete entity id:"+Id);
			}else {
				System.out.println("not delete");
			}
			session.close();
		}
		factory.close();
	}
	
}


