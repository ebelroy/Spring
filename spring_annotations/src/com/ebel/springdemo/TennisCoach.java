package com.ebel.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	/*@Autowired //all so work when commented
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	public TennisCoach() {
		System.out.println("inside default Constructor");
	}

	@Autowired
	@Qualifier("randomFortuneService")/*to select a specific implentation of fortune Service.if only one impelentation is there then no problem 
	you can run with out qualifier*/
	
	private FortuneService fortuneService;
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	public void doSomething(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartup() {
		System.out.println("domystartup");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMycleanup(){
		System.out.println("destroy method");
	}
}
