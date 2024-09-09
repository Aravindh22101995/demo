package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Message")
public class demoController {
	@GetMapping(value = "/getMessage")
	public String getMessgae() {
		return "Hi";
		
		
	}

}
