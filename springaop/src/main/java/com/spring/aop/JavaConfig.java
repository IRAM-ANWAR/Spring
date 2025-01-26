package com.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.spring.aop.*")
public class JavaConfig {

//	@Bean
//	public AspectClass myAspect() {
//		return new AspectClass();
//	}

}
