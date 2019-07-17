package com.ahsan.repositories;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.ahsan.entities.BookEntity;
import com.ahsan.utils.HibernateUtil;

public class BooksRepository {

	public void save(BookEntity bookEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(bookEntity);
		session.getTransaction().commit();

		session.close();

	}
	
	public void update(BookEntity bookEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.update(bookEntity);
		session.getTransaction().commit();

		session.close();

	}

	public BookEntity getByID(Long id) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		BookEntity book1 = session.get(BookEntity.class, id);
		session.getTransaction().commit();
		session.close();
         return book1;
	}
	

}
