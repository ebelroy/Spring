package com.examples;

import java.util.Collection;
import java.util.Iterator;

import org.hibernate.Session;

public class HibernateDetails {

	public static void main(String[] args) {
		
		Session s1=util.getSession();
		
		UserDetails user=new UserDetails();
		user.setUsername("First user");
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehiclename("Car");
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehiclename("Bike");
		
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		
		
		s1.beginTransaction();
		//s1.save(vehicle1);cascade in the userdetails for vehicle will take care of the saving 
		//s1.save(vehicle2);
		s1.save(user);
		s1.getTransaction().commit();
		s1.clear();
		
		System.out.println("Completed");

	}

}
