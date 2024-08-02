package com.example.first_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empployeews {


	@GetMapping("/employee")
	public String getemployee() {
		return "Hello Walaa" ;
	}
}
