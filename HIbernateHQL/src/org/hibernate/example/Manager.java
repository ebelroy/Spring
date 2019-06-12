package org.hibernate.example;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Manager {

	public static void main(String[] args) {

		Session s1=util.getSession();
		s1.beginTransaction();
		Order ord=new Order();
		ord.setOrderid("a101");
		ord.setCustomername("Ebel");
		ord.setQuantity(5);
		ord.setPrice(123);
	
		
		//s1.save(ord);
		s1.getTransaction().commit();
		
//		Query qry=s1.createQuery("from Order");//qUERYapi
//		List<Order> orders=qry.list();
//		for(Order ab:orders) {
//			System.out.println(ab.getCustomername());
//			System.out.println(ab.getOrderid());
//			System.out.println(ab.getPrice());
//			System.out.println(ab.getQuantity());
//			System.out.println("-------------------------------------");
//		}
		
		Criteria ctr=s1.createCriteria(Order.class);
		List<Order> orders=ctr.list();
		for(Order ab:orders) {
			System.out.println(ab.getCustomername());
			System.out.println(ab.getOrderid());
			System.out.println(ab.getPrice());
			System.out.println(ab.getQuantity());
			System.out.println("-------------------------------------");
		}
		System.out.println("done");
		
	}

}
