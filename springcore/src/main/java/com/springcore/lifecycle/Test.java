package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] arhs) {
		AbstractApplicationContext context3 = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycle_config.xml");
		Samosa samosa = (Samosa) context3.getBean("samosaObj");
		System.out.println(samosa);
		context3.registerShutdownHook();
	}

}
