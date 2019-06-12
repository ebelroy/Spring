package com.examples;

import javax.persistence.Entity;

@Entity
public class Twowheeler extends Vehicle{
	
	private String steeringHamdle;

	public String getSteeringHamdle() {
		return steeringHamdle;
	}

	public void setSteeringHamdle(String steeringHamdle) {
		this.steeringHamdle = steeringHamdle;
	}
	
}
