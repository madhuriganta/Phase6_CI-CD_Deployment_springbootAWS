package com.cicd.springboot.java.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdSpringBootJavaAppApplication {
	
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to AWS Spring boot application";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdSpringBootJavaAppApplication.class, args);
	}

}
