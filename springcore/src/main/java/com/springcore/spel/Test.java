package com.springcore.spel;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (AbstractApplicationContext context3 = new ClassPathXmlApplicationContext(
				"com/springcore/spel/config.xml")) {
			Demo demo = context3.getBean("demo", Demo.class);
			System.out.println(demo);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
