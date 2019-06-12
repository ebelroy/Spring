package com.examples;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vehicle2")
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int vehicleid;
	private String vehiclename;
	@ManyToMany
	private Collection<UserDetails> userlist=new ArrayList<UserDetails>();
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
	public Collection<UserDetails> getUserlist() {
		return userlist;
	}
	public void setUserlist(Collection<UserDetails> userlist) {
		this.userlist = userlist;
	}
	
}
