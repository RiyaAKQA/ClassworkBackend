package com.database.SpringDemoDatabase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String toSayHello() {
		return "Welcome user";
	}

}
