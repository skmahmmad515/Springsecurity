package com.telusuko.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontoller {
	
	@GetMapping("/")
	public String greet() {
		
		return "Hello world";
		
	}

}
