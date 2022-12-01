package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jbk.config.HibernateUtility;
import com.jbk.entity.Product;

public class FirstLevelCache_Test {
	
public static void main(String[] args) {
	
	SessionFactory sf =HibernateUtility.getSessionFactory();
	
	Session session1 =sf.openSession();
	Product product1 =session1.get(Product.class, 1);
	System.out.println(product1);
	
	Session session2 =sf.openSession();
	Product product2=session2.get(Product.class, 1);
	System.out.println(product2);
	
}
}
