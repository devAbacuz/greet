package com.abacuz.greet.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abacuz.greet.service.NameServiceClient;
import com.abacuz.greet.view.GreetingView;

@Service
public class GreetingService {
	
	@Autowired
	//private NameServiceClient nameService;

	public GreetingView greet() {
		GreetingView view = new GreetingView();
		view.setGreet("Hiii my");
		view.setName("Gulmi Baby!!!!!");
		return view;
	}

}
