package com.toxicprogrammer.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot  REST API documentation",
				description = "Spring Boot  REST API documentation",
				version = "v1.0.0",
				contact = @Contact(
						name = "Prateek",
						email = "prateek.chhibber@gmail.com",
						url = "https://prateek-chhibber.netlify.app/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://prateek-chhibber.netlify.app/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot User Management documentation",
				url = "https://prateek-chhibber.netlify.app/"

		)
)
public class SpringbootRestfulWebservicesApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
	}

}
