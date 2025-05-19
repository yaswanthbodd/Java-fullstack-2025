package com.student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StudentUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		MetadataSources sources = new MetadataSources(registry);
		Metadata metadata = sources.getMetadataBuilder().build();
		sessionFactory = metadata.getSessionFactoryBuilder().build();
		return sessionFactory;
	}
}
