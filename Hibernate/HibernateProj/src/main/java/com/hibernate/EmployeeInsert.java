package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeInsert {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("yaswanth");
		emp.setSalary(5000.0);
		session.persist(emp); //insert into Employee values ( ?, ?,?);
		tx.commit();
		session.close();
	}

}
