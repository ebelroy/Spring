package com.examples;

import org.hibernate.Session;

public class HibernateDetails {

	public static void main(String[] args) {
		
		UserDetails  user=new UserDetails();
		user.setUsername("First user");
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehiclename("Car");
		
		user.setVehicle(vehicle);
		
		Session s1=util.getSession();
		s1.beginTransaction();
		s1.save(vehicle);
		s1.save(user);
		s1.getTransaction().commit();
		s1.clear();
		
		System.out.println("Completed");

	}

}
