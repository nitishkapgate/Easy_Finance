package com.cjc.ef.enquiry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EasyFinanceEnquiryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyFinanceEnquiryApplication.class, args);
	}

}
