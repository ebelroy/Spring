package com.ebel.springdemo;

import org.springframework.stereotype.Component;

@Component("thatsillycoach")//default bean id is tennisCoach
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "practise your backhand volley";
	}

}
