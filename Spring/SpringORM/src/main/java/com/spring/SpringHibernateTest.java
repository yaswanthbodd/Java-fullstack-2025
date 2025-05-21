package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate.xml");
		ProductDao dao = context.getBean("product",ProductDao.class);
		Product prod=new Product();
		prod.setProductId(101);
		prod.setProductName("Monitor");
		prod.setProductPrice(5000);
		dao.insertProduct(prod);

	}

}
