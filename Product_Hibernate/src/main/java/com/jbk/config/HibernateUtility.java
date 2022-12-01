package com.jbk.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.entity.Product;

public class HibernateUtility {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
	Configuration cfg = new Configuration();
	
	//Configuration configure = cfg.configure();
	//configure.addAnnotatedClass(Product.class);
	
	cfg.configure().addAnnotatedClass(Product.class);
	
	sessionFactory= cfg.buildSessionFactory();
	
	return sessionFactory;
}
}
