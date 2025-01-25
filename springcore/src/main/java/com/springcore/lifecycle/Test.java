package com.springcore.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] arhs) {
		try (AbstractApplicationContext context3 = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycle_config.xml")) {
			Samosa samosa = (Samosa) context3.getBean("samosaObj");// xml based
			System.out.println(samosa);

			Pepsi pepsi = (Pepsi) context3.getBean("pepsiObj");// interface based init deSTROY
			System.out.println(pepsi);

			Coke coke = (Coke) context3.getBean("cokeObj");// annotation based
			System.out.println(coke);
			context3.registerShutdownHook();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
