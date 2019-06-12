package org.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager {//tABLE FOR EACH CLASS

	public static void main(String[] args) {
		//
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("car");
		
		Twowheeler bike=new Twowheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHamdle("Bike Handle");
		
		FourWheeler car= new FourWheeler();
		car.setVehicleName("Hyundai");
		car.setSteeringWheel("Car wheel");
		
		Configuration c1=new Configuration();
		c1.configure();
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		
		s1.beginTransaction();
		s1.save(car);
		s1.save(bike);
		s1.save(vehicle);
		s1.getTransaction().commit();
		s1.close();
		

	}

}
