package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPropertiesApplication.class, args);
		
		System.out.println("test Colors isntance : " + ConfigurationMetadataMapStudy.getColor());

	}

}
