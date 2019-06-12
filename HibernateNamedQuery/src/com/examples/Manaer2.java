package com.examples;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manaer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s2=util.getSession();
		Query qry=s2.getNamedQuery("q2");
		//Query qry=s2.getNamedQuery("q3");
		//qry.setInteger(0, 50);
		List<Object[]> lust=qry.list();
		for(Object[] row:lust) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("Completed");
	}

}
