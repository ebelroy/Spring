package com.examples;

import java.util.Collection;
import java.util.Iterator;

import org.hibernate.Session;

public class HibernateDetails {

	public static void main(String[] args) {
		
		Session s1=util.getSession();
		
		UserDetails user=new UserDetails();
		user.setUsername("First user");
		
		UserDetails user2=new UserDetails();
		user2.setUsername("Secind user");
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehiclename("Car");
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehiclename("Bike");
		
		Vehicle vehicle3=new Vehicle();
		vehicle3.setVehiclename("Truck");
		
		Vehicle vehicle4=new Vehicle();
		vehicle4.setVehiclename("Plane");
		
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		user2.getVehicle().add(vehicle3);
		user2.getVehicle().add(vehicle4);
		
		s1.beginTransaction();
		s1.save(vehicle1);
		s1.save(vehicle2);
		s1.save(user);
		s1.save(vehicle3);
		s1.save(vehicle4);
		s1.save(user2);
		s1.getTransaction().commit();
		s1.clear();
		
		System.out.println("Completed");

	}

}
