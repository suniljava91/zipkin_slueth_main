package com.zipkin.shopping.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

//import brave.sampler.Sampler;

//import brave.sampler.Sampler;

@Configuration
public class CloudConfig {
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	/*
	 * @Bean public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
	 * webServerFactoryCustomizer() { return factory ->
	 * factory.setContextPath("/AmazonShopping"); }
	 */

	/*
	 * public AlwaysSampler defaultSampler() { return new AlwaysSampler(); }
	 */
}
