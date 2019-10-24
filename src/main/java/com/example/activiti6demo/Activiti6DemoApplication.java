package com.example.activiti6demo;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Component
public class Activiti6DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Activiti6DemoApplication.class, args);
	}

}
