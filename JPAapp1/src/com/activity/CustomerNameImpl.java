package com.activity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import com.entity.Customer;

public class CustomerNameImpl implements ICustomerDao {
	
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
	private EntityManager em=emf.createEntityManager();

	@Override
	public Customer findByFirstNAme(String firstname) {
		// TODO Auto-generated method stub
		javax.persistence.Query query=em.createQuery("select m from Customer m where firstname=:fname"); //JPQL query of JPA 
		query.setParameter("fname", firstname);
		return (Customer)query.getSingleResult();
	}

	@Override
	public List<Customer> findByCountry(String country) {
		javax.persistence.Query query=em.createQuery("from Customer where country=:country"); //HQL 
		query.setParameter("country", country);
		return query.getResultList();
	}

	
}
