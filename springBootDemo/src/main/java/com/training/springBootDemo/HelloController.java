package com.training.springBootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String toSayHello() {
		return "Welcome user";
	}

}
