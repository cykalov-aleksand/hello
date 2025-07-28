package com.example.helo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition
@SpringBootApplication
public class HeloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeloApplication.class, args);
	}

}
