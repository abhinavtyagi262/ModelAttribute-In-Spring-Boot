package com.abhinav.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FrontController extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(FrontController.class, args);
	}

}
