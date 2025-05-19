package com.product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

public class ProductDelete {

	public static void main(String[] args) {
		SessionFactory sessionFactory = ProductUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		// Method - 1
		/*
		Product prod = session.get(Product.class,101);
		session.remove(prod);
		*/
		
		//Method - 2
		/*
		Product prod = new Product();
		prod.setProdId(104);
		session.remove(prod);
		*/
		
		//Method - 3
		SelectionQuery<Product> query = session.createSelectionQuery("from Product where prodPrice>= : prodPrice",Product.class);
		query.setParameter("prodPrice",10000);
		List<Product> prodList = query.list();
		for(Product prod:prodList)
			session.remove(prod);
		tx.commit();
		session.close();
	}

}
