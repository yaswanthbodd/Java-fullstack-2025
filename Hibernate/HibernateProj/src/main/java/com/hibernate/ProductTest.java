package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Product prod = new Product();
		
		//prod.setProductId(111);
		prod.setProductName("Mouse");
		prod.setPrice(3000);
		session.persist(prod);
		tx.commit();
		session.close();

	}

}
