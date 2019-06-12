package com.activity;

import java.util.List;

import com.entity.Customer;

public interface ICustomerDao {

	 public Customer findByFirstNAme(String firstname);
	 public List<Customer> findByCountry(String India);
}
