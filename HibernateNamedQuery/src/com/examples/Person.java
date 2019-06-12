package com.examples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="person")
@NamedNativeQueries(
		{
			@NamedNativeQuery(name="q1",query="select * from person"),
			@NamedNativeQuery(name="q2",query="select * from person where age<50"),
			@NamedNativeQuery(name="q3",query="select * from person where age <?"),
		}
	)



public class Person 
{
	@Id
	private int personId;
	
	@Column(name="first_name")
	private String firstname;
	private String lastname;
	private int age;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
