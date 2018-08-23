package com.blogcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	//test
	public static void main(String[] args) {
		System.out.print("java test----1");
		SpringApplication.run(Application.class, args);
        System.out.print("java test----2");
        System.out.print("java test----3");
	}
}
