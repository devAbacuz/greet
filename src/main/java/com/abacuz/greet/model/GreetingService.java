package com.abacuz.greet.model;

import org.springframework.stereotype.Service;

import com.abacuz.greet.view.GreetingView;

@Service
public class GreetingService {

	public GreetingView greet() {
		GreetingView view = new GreetingView();
		view.setGreet("Hiii");
		view.setName("Jomy");
		return view;
	}

}
