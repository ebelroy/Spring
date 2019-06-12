package com.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Customer;

public class CreateCustomerJPA {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		 try {
		EntityTransaction entr=em.getTransaction();
		entr.begin();
		Customer cust=new Customer();
		cust.setCustomerId(2001);
		cust.setCity("bangalore");
		cust.setFirstName("ebel");
		cust.setLastName("Roy");
		cust.setGender(1);
		cust.setCountry("India");
		
		em.persist(cust);
		entr.commit();
		System.out.println("added to database");
	}
	catch (Exception e) {
		System.out.println("Succces");
	}
		
		

	}

}
