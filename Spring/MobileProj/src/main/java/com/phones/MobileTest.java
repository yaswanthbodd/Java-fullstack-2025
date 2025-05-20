package com.phones;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mob = (Mobile)context.getBean("mobile");
		List<IPhone> iphones = mob.getIphones();
		for(IPhone m: iphones)
			System.out.println(m);
		System.out.println("For Each Java - 8");
		iphones.forEach(System.out::println);
	}

}
