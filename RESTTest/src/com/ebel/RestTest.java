package com.ebel;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ObjectMapper obj=new ObjectMapper();
			Test1 te=obj.readValue(new File("data/new3.json"), Test1.class);
			
			System.out.println(te.getColor()+" "+te.getFruit()+" "+te.getSize());
			Windowc win=te.getWindowc();
			System.out.println(te.getWindowc().getHeight());
			System.out.println(win.getTitle());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
