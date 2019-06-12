package com.activity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Customer;

public class FindCustomerbyIDJPA {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		Customer cus=new Customer();
		cus=em.find(Customer.class, 2001);
		System.out.println(cus.getAddress());
		System.out.println(cus.getCity());
		System.out.println(cus.getCountry());
		System.out.println(cus.getCustomerId());
		System.out.println(cus.getFirstName());
		System.out.println(cus.getGender());

	}

}
