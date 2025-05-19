package com.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

public class StudentList {

	public static void main(String[] args) {
		SessionFactory sessionFactory = StudentUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		SelectionQuery<Student> query=session.createSelectionQuery("from Student",Student.class);
		List<Student> studList = query.list();
		for(Student stud: studList)
			System.out.println(stud);
		tx.commit();
		session.close();
	}

}
