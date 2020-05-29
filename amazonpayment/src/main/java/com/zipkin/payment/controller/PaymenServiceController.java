package com.zipkin.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymenServiceController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/discounts")
	public String discount() {
		LOG.info("Inside payment service discount method start !!!");
		String response="payment successfully done!!";
		LOG.info("Inside payment service discount method end !!!");
		return response;
	}
	

}
