package com.example.BikeStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Bike Database",
				version="1.1.2",
				description="Bike details",
				contact=@Contact(
						name="Thahrin",
						email="thahrin199@gmail.com"
						)
				)	
		)
public class BikeStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeStoreApplication.class, args);
	}

}
