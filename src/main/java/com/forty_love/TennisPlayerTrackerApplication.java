package com.forty_love;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TennisPlayerTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerTrackerApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello Chayanne here starting point of the tennis tracker project";
	}
}
