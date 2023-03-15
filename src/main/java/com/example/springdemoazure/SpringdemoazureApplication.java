package com.example.springdemoazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringdemoazureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoazureApplication.class, args);
	}
	@GetMapping(path = "/message")
	public String retString()
	{
		return "String";
	}


}
