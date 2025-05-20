package com.spring;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryTest {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("library.xml");
		Library lib = (Library)context.getBean("lib");
		List<Book> books = lib.getBooks();
		for(Book b: books) {
			System.out.println(b);
		}
		books.forEach(System.out::println); //java 8 version
	}

}
