package com.examples;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int vehicleid;
	private String vehiclename;
	
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	
}
