package com.ahsan.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.ahsan.entities.BookEntity;
import com.ahsan.entities.DepartmentsEntity;
import com.ahsan.entities.StudentsEntity;
import com.ahsan.utils.HibernateUtil;

public class StudentsRepository {

	public void save(StudentsEntity studentsEntity ) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(studentsEntity);
		session.getTransaction().commit();
		session.close();

	}
	
public StudentsEntity getStudentByName(String name) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		
		Query query = session.createQuery("From StudentsEntity c where c.name = :name");
		query.setParameter("name", name);
		
		List <StudentsEntity> student = (List<StudentsEntity>) query.getResultList();
		

		session.getTransaction().commit();
		session.close();
		
		if (student.size() > 0) {
			return student.get(0);
		}
		return null;
		
	}
public StudentsEntity getByID(Long id) {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

	session.beginTransaction();
	StudentsEntity student = session.get(StudentsEntity.class, id);
	session.getTransaction().commit();
	session.close();
     return student;
}

}
