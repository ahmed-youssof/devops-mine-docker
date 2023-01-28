package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("api")
public class DevopsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDockerApplication.class, args);
	}
	
	@GetMapping
	public String hello(){
		
		return "hello";
		
	}
	
	@GetMapping("/welcom")
	public String weclom(){
		
		return "welcom";
		
	}

}
