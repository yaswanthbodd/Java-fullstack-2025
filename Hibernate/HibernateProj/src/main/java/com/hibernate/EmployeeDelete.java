package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;


public class EmployeeDelete {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		//Method 1
		/*
		Employee emp = new Employee();
		emp.setEmpId(101);
		session.remove(emp); // session.delete(emp) - deprecated in Hibernate 6
		tx.commit();
		session.close();
		*/
		
		//Method 2 - It is used when you have unique values in the table
		/*
		Employee emp = session.get(Employee.class,102);
		session.remove(emp);
		tx.commit();
		session.close();
		*/
		
		//Method 3 - Deleting Multiple Persistant objects
		SelectionQuery<Employee> query = session.createSelectionQuery("from Employee where salary >= :salary",Employee.class);
		query.setParameter("salary", 7000.0);
		List<Employee> empList = query.list();
		for(Employee emp: empList)
			session.remove(emp);
		tx.commit();
		session.close();
	}

}
