package com.springboot.sathish.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyInfoController {

	@GetMapping(value="/health",produces=MediaType.TEXT_PLAIN_VALUE)
	public String isAppHealthy() {
		return "Yes, Im Healthy..";
	}
	
}
