package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class EmployeeUpdate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		//Method - 1
		/*
		Employee emp = session.get(Employee.class,101);
		emp.setSalary(2000.0);
		session.merge(emp); // Session.update(emp) - deprecated in Hibernate 6
		tx.commit();
		session.close();
		*/
		
		//Method - 2 Using HQL ( Hibernate Query Language ) - applied on Model (class) not on table
		MutationQuery query = session.createMutationQuery("update Employee set salary=:salary where empName=:empName");
		query.setParameter("salary", 1000.0);
		query.setParameter("empName", "srinu");
		query.executeUpdate();
		tx.commit();
		session.close();

	}

}
