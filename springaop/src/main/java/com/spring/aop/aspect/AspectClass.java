package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
	@Before("execution(* com.spring.aop.service.PaymentServiceImpl.makePayment())")
	// * represent any return type
	public void printBefore() {
		System.out.println("Payment Started");
	}
}
