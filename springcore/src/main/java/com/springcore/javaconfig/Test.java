package com.springcore.javaconfig;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (AbstractApplicationContext context3 = new AnnotationConfigApplicationContext(JavaConfig.class)) {
			Student student = context3.getBean("student", Student.class);
			System.out.println(student);

			Teacher teacher = context3.getBean("getTeacher", Teacher.class);
			System.out.println(teacher);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
