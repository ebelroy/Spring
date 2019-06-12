package com.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class util {

	private static SessionFactory sf;
	static {
		Configuration c1=new Configuration();
		c1.configure();
		sf=c1.buildSessionFactory();
	}
	public static Session getSession() {
		return sf.openSession();
	}
}
