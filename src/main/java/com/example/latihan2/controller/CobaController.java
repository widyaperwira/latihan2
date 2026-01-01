package com.example.latihan2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.latihan2.service.CobaService;

@RestController
public class CobaController {
	
	@Autowired
	CobaService cobaService;
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "username", defaultValue = "World!")String username) {
		return String.format("Hello World, username %s found in database", username, cobaService.changeNameToThisUsername(username));
	}

}
