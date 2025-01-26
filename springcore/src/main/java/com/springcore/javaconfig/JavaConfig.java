package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

	@Bean
	public Teacher getTeacher() {
		System.out.println("Teacher Bean");
		Teacher teacher = new Teacher();
		return teacher;
	}

}
