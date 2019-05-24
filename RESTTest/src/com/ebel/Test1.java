package com.ebel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown =true)//if any change happend in JSON file it will not result in an error
public class Test1 {

	public Test1() {
		System.out.println("entered the main constru");
	}

	private String fruit,size,color;
	private Windowc windowc;//names of the elements used should be same or else wont work

	public Windowc getWindowc() {
		return windowc;
	}

	public void setWindowc(Windowc windowc) {
		this.windowc = windowc;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	
	
	
	
}
