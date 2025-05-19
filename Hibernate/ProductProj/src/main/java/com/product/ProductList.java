package com.product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

public class ProductList {

	public static void main(String[] args) {
		SessionFactory sessionFactory=ProductUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		SelectionQuery<Product> query=session.createSelectionQuery("from Product",Product.class);
		List<Product> prodList = query.list();
		for(Product prod: prodList)
			System.out.println(prod);
		tx.commit();
		session.close();
	}

}
