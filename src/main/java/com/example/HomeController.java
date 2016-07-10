package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String index(){
		return "Hello World";
	}
	
	public int sum(int a, int b){
		return a+b;
	}

}
