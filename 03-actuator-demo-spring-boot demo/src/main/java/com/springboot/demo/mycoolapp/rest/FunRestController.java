package com.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@RequestMapping("/")
	public String getHello() {
		
		return "new Hello World "+LocalDateTime.now();
		
	}
	@RequestMapping("/workout")
	public String getWorkout() {
		return "run a 5k";
	}
}
