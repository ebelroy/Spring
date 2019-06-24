package com.springboot.Thymleafdemo.model;

public class Employee {
	
	private String firstname;
	private String email;
	private int id;
	private String lastname;
	
	
	Employee(){
		
	}


	public Employee(String firstname, String email, int id, String lastname) {
		this.firstname = firstname;
		this.email = email;
		this.id = id;
		this.lastname = lastname;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", email=" + email + ", id=" + id + ", lastname=" + lastname + "]";
	}

	
}
