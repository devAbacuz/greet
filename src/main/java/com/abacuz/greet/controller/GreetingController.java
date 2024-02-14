package com.abacuz.greet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abacuz.greet.model.GreetingService;
import com.abacuz.greet.view.GreetingView;

@RestController
public class GreetingController {
	
	@Autowired
	private GreetingService service;
	
	@RequestMapping("/greet")
	public GreetingView  greet() {
		return service.greet();
	}

}
