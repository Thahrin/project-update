package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="HYPERMARKET",
				version="1.1.2",
				description="Customer Details",
				contact=@Contact(
						name="Thahrin",
						email="thahrin199@gmail.com"
						)
				)	
		)
public class HyperMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyperMarketApplication.class, args);
	}

}
