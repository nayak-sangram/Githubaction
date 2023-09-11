package com.example.spring.octdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	
	@GetMapping
	public ResponseEntity<String> getMapping() {
		
		return  new ResponseEntity<String>("Conratulations",HttpStatus.OK);
		
		
	}

}
