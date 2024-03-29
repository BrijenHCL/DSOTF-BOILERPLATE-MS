/*
 * Copyright (C) 2019 ULTA
 * http://www.ulta.com
 * 9008570@ulta.com
 * All rights reserved
 */
package com.ulta.boilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class BoilerplateApplication {

	/**
	 * Main application class for start-up
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BoilerplateApplication.class, args);
	}

}
