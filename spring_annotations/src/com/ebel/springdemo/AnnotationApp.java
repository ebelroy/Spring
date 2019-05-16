package com.ebel.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coc=context.getBean("tennisCoach",Coach.class);
		System.out.println(coc.getDailyWorkout());
		System.out.println(coc.getDailyFortune());
		context.close();
	}

}