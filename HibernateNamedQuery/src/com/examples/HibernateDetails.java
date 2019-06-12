package com.examples;

import org.hibernate.Session;

public class HibernateDetails {

	public static void main(String[] args) {
		
		
		Session s1=util.getSession();
		Person p1=new Person();
		p1.setPersonId(101);
		p1.setFirstname("Ebel");
		p1.setLastname("Roy");
		p1.setAge(22);
		
		
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.clear();
		
		System.out.println("Completed");

	}

}
