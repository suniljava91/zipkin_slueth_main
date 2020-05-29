package com.zipkin.shopping.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shoppings")
public class ShoppingServiceController {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	private final String URL = "http://payment-service/Amazonpayment/api/v1/payments/discounts";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/shopping")
	public String shopping() {
		System.out.println("***************Inside Shopping Service ******************");
		LOG.info("Inside shopping service shopping method Start");
		String response=restTemplate.getForObject(URL, String.class);
		LOG.info("Inside shopping service discount method end");
		return response;
	}

}
