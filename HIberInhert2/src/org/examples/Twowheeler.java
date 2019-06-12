package org.examples;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bike")
public class Twowheeler extends Vehicle{
	
	private String steeringHamdle;

	public String getSteeringHamdle() {
		return steeringHamdle;
	}

	public void setSteeringHamdle(String steeringHamdle) {
		this.steeringHamdle = steeringHamdle;
	}
	
}
