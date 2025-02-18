package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) context.getBean("studentBean");
		System.out.println(student);
		System.out.println(student.getCollection().getList().getClass());

		ApplicationContext context2 = new ClassPathXmlApplicationContext("config_constructor.xml");
		Student student2 = (Student) context2.getBean("studentObj");
		System.out.println(student2);
	}
}
