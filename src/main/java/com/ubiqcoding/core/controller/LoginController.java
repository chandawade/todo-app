package com.ubiqcoding.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping("/login")
	public String index() {
		return "Have a username and password? Enter it below to get started.";
	}

}
