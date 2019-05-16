package com.ebel.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.email}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "Swim for 1 km as a warmup";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
