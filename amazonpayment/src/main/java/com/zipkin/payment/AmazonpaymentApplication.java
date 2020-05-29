package com.zipkin.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class AmazonpaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonpaymentApplication.class, args);
	}

}
