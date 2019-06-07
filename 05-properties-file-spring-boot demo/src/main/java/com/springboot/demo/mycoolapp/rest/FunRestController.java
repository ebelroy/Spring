package com.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	//injecting the properties
	@Value("${coach.name}")
	private String coach_name;
	@Value("${team.name}")
	private String team_name;
	
	
	@RequestMapping("/")
	public String getHello() {
		
		return "new Hello World "+LocalDateTime.now();
		
	}
	@RequestMapping("/workout")
	public String getWorkout() {
		return "run a 5k";
	}
	
	@RequestMapping("/teamInfo")
	public String teamInfo() {
		return coach_name+" "+team_name;
	}
}
