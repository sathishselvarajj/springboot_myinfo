package com.springboot.sathish.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationStarter {

private final static Logger logger = LogManager.getLogger(SpringBootApplicationStarter.class);
	
	public static void main(String[] args) {
		logger.info("Starting the spring boot application....");
		SpringApplication.run(SpringBootApplicationStarter.class, args);
	}
}
