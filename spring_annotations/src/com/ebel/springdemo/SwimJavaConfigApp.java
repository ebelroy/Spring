package com.ebel.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new 
				AnnotationConfigApplicationContext(SportConfig.class); 
		Coach coc=context.getBean("swimCoach",Coach.class);
		System.out.println(coc.getDailyWorkout());
		System.out.println(coc.getDailyFortune());
		context.close();
	}

}