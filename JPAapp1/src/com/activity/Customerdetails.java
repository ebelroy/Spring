package com.activity;

import java.util.ArrayList;
import java.util.List;

import com.entity.Customer;

public class Customerdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerNameImpl cuss=new CustomerNameImpl();
		Customer cas=(Customer) cuss.findByFirstNAme("Ebel");
		
		System.out.println("Country "+cas.getCustomerId()+" "+cas.getFirstName());
		List<Customer> cuslist=new ArrayList<Customer>();
		cuslist=cuss.findByCountry("India");
		
		for(Customer cus1:cuslist) {
			System.out.println(cus1.getCustomerId()+" "+cus1.getFirstName()+" "+cus1.getLastName());
		}
	}

}
