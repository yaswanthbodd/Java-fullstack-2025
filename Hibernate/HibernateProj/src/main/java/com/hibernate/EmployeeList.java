package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

public class EmployeeList {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		SelectionQuery<Employee> query = session.createSelectionQuery("from Employee",Employee.class);
		List<Employee> empList = query.list();
		for(Employee emp: empList)
			System.out.println(emp);
		session.close();
	}

}
