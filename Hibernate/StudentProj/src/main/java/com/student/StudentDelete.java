package com.student;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

import java.util.List;

import org.hibernate.Session;


public class StudentDelete {

	public static void main(String[] args) {
		SessionFactory sessionFactory = StudentUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
//		Method - 1
		/*
		Student stud = session.get(Student.class,585);
		session.remove(stud);
		*/
		
		// Method - 2
		/*
		Student stud = new Student();
		stud.setStudentId(591);
		session.remove(stud);
		*/
		
		// Method - 3
		SelectionQuery<Student> query = session.createSelectionQuery("from Student where age >=: age",Student.class);
		query.setParameter("age",24);
		List<Student> studList = query.list();
		for(Student stud: studList)
			session.remove(stud);
		tx.commit();
		session.close();
	}

}
