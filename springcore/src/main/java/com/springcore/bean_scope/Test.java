package com.springcore.bean_scope;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		try (AbstractApplicationContext context3 = new ClassPathXmlApplicationContext(
				"com/springcore/bean_scope/config.xml")) {
			Student student = context3.getBean("student", Student.class);
			System.out.println(student);
			System.out.println(student.hashCode());

			Student student2 = context3.getBean("student", Student.class);
			System.out.println(student2);
			System.out.println(student2.hashCode());

			Teacher teacher = context3.getBean("teacher", Teacher.class);
			System.out.println(teacher);
			System.out.println(teacher.hashCode());

			Teacher teacher2 = context3.getBean("teacher", Teacher.class);
			System.out.println(teacher2);
			System.out.println(teacher2.hashCode());

		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
