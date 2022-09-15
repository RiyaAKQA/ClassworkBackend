package com.training.springBootDemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.SpringDemoDatabase.Name;

@RestController
public class NamesController {

		@RequestMapping("/name")
		
		public List<Name> getAllTopic(){
			return Arrays.asList(new Name("Riya" , "22"),new Name("Sourav","22"),new Name("Shubham" , "22"));
			
		}
		
		

	}


