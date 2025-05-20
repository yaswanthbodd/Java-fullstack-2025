package com.product;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ProductTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");

		ProductDao dao = (ProductDao) context.getBean("product");
		//dao.productInsert(2, "mobile", 3);
		List<Map<String,Object>> prodList = dao.productLists();
		for(Map prod:prodList) {
			System.out.println(prod.get("prodId")+" "+prod.get("prodName")+" "+prod.get("pieces"));
		}
	}

}
