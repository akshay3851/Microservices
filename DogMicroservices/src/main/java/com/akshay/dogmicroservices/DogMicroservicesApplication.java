package com.akshay.dogmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DogMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogMicroservicesApplication.class, args);
	}

}
