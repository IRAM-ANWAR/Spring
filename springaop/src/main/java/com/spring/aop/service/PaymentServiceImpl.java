package com.spring.aop.service;

import org.springframework.stereotype.Service;

@Service("payment")
public class PaymentServiceImpl implements PaymentService {

	@Override
	public void makePayment() {
		System.out.println("Amount Debited");
	}

}
