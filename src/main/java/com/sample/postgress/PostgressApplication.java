package com.sample.postgress;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages="com.sample")
@RestController
public class PostgressApplication {

	@Value("${databasepassword}")
	private String databasepassword;

	@GetMapping("/message")
	public String message(){
		return "Test message>>>>"+databasepassword;
	}

	public static void main(String[] args) {
		SpringApplication.run(PostgressApplication.class, args);
	}

}

