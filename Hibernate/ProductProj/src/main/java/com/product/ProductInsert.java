package com.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductInsert {

	public static void main(String[] args) {
		SessionFactory sessionFactory = ProductUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Product prod=new Product();
		prod.setProdId(101);
		prod.setProdName("Samsung");
		prod.setProdPrice(9000.0);
		session.persist(prod);
		tx.commit();
		session.close();
	}

}
