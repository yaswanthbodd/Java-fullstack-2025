package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class StudentUpdate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = StudentUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
//		Method - 1
		/*
		Student stud = session.get(Student.class, 577);
		stud.setAge(25);
		session.merge(stud);
		*/
		
		//Method - 2 
		MutationQuery query = session.createMutationQuery("update Student set age=:age where studentName=:studentName");
		query.setParameter("age",22);
		query.setParameter("studentName","Yaswanth");
		query.executeUpdate();
		tx.commit();
		session.close();
	}

}
