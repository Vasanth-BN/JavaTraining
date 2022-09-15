package com.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont= SpringApplication.run(FirstProjectApplication.class, args);
		
		College col=(College) cont.getBean(College.class);
		
		col.display();
		

		
	}
}
