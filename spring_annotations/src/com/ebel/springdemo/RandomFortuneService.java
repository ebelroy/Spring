package com.ebel.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	private String data[]= {
			"have a bad","you are awesome","be a good Boy"
	};
	private Random myrandom=new Random();
	@Override
	public String getFortune() {
		int index=myrandom.nextInt(data.length);
		
		String dta=data[index];
		return dta;
	}

}
