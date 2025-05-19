package com.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class ProductUpdate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = ProductUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		// Method - 1
		/*
		Product prod = session.get(Product.class,101);
		prod.setProdPrice(10000);
		session.merge(prod);
		*/
		
		// Method - 2
		MutationQuery query=session.createMutationQuery("update Product set prodPrice=:prodPrice where prodName=:prodName");
		query.setParameter("prodPrice", 12000);
		query.setParameter("prodName","Realme");
		query.executeUpdate();
		tx.commit();
		session.close();
	}

}
