package com.example.springbootredistodoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/")
	public String index() 
	{
		return "Use /cache route";
	}
}
