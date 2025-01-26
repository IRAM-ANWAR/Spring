package com.springcore.stereotype;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		try (AbstractApplicationContext context3 = new ClassPathXmlApplicationContext(
				"com/springcore/stereotype/config.xml")) {
			Student student = context3.getBean("student", Student.class);
			System.out.println(student);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
