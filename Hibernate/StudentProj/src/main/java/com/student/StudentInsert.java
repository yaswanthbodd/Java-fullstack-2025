package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentInsert {

	public static void main(String[] args) {
		SessionFactory sessionFactory = StudentUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student stud = new Student();
		stud.setStudentId(591);
		stud.setStudentName("Navven");
		stud.setCollege("LBRCE");
		stud.setAge(24);
		session.persist(stud);
		tx.commit();
		session.close();
	}

}
