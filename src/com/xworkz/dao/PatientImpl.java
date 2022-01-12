package com.xworkz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.PatientEntity;

public class PatientImpl implements PatientDao {

	@Override
	public void create(PatientEntity entity) {
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(PatientEntity.class);
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			session.save(entity);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		}
		factory.close();		
	}

	@Override
	public PatientEntity getById(int id) {
		PatientEntity entity = null;
		System.out.println("invoked the get by id");
		System.out.println("get by id:" + id);
		SessionFactory factory = new Configuration().configure().
				addAnnotatedClass(PatientEntity.class).buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			entity = session.get(PatientEntity.class, id);
			if (entity != null) {
				System.out.println("entity found as id:" + id);
			} else {
				System.out.println("entity not found as id" + id);
			}
			session.close();
			}
		factory.close();
		return null;
	}
	
	@Override
	public void updatePatientEntity(String newbirth, int id) {
		System.out.println("invoked the update patient index");
		System.out.println("update patient :" + newbirth + " " + id);
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(PatientEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			PatientEntity entity = session.get(PatientEntity.class, id);
			if (entity != null) {
				entity.setP_place(newbirth);
				session.update(entity);
				transaction.commit();
				System.out.println("update patient id" + id);
				session.close();
			}
			factory.close();
		}
	}

@Override
public void delete(int id) {
	System.out.println("invoked the delete index");
	System.out.println("delete patient:" + id);
	SessionFactory factory = new Configuration().configure().addAnnotatedClass(PatientEntity.class)
			.buildSessionFactory();
	if (factory != null) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		PatientEntity entity = session.get(PatientEntity.class, id);
		if (entity != null) {
			entity.setP_id(id);
			session.delete(entity);
			transaction.commit();
			System.out.println("delete patient id" + id);
			session.close();
		}
		factory.close();
	}
}}