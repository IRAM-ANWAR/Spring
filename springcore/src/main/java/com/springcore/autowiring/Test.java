package com.springcore.autowiring;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] arhs) {
		try (AbstractApplicationContext context3 = new ClassPathXmlApplicationContext(
				"com/springcore/autowiring/config.xml")) {
			Employee emp = context3.getBean("emp", Employee.class);
			System.out.println(emp);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
