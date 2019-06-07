package com.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@RequestMapping("/")
	public String getHello() {
		
		return "Hello World "+LocalDateTime.now();
		
	}
}
