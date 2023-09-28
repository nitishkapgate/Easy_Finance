package com.cjc.ef.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EasyFinanceApplication {

	public static void main(String[] args) 
	{
		System.out.println("\n Successfull");
		SpringApplication.run(EasyFinanceApplication.class, args);
	}

}
