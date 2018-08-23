package com.blogcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	//test
	public static void main(String[] args) {
		System.out.print("java test");
		SpringApplication.run(Application.class, args);
	}
}
