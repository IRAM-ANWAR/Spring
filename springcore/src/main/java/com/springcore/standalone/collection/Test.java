/**
 *
 */
package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collection/config.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass());

	}

}
