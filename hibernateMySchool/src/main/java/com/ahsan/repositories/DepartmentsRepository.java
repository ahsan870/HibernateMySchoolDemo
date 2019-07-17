package com.ahsan.repositories;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.ahsan.entities.DepartmentsEntity;
import com.ahsan.utils.HibernateUtil;

public class DepartmentsRepository {

	public void save(DepartmentsEntity departmentsEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(departmentsEntity);
		session.getTransaction().commit();
		session.close();

	}

	public DepartmentsEntity getDeptByName(String name) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		
		Query query = session.createQuery("from DepartmentsEntity c where c.name = :name");
		query.setParameter("name", name);
		
		List <DepartmentsEntity> departments = (List<DepartmentsEntity>) query.getResultList();
		

		session.getTransaction().commit();
		session.close();
		
		if (departments.size() > 0) {
			return departments.get(0);
		}
		return null;
		
	}
	
	
	
}
