package com.springws.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springws")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

/*
 * RUN ::
 * 
 * 
 * mvn spring-boot:run
 * 
 * http://localhost:8080/ws/countries.wsdl
 */