package com.bank.msbootcoincustomerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsBootcoinCustomerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBootcoinCustomerBackendApplication.class, args);
	}

}
