package com.jbk.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.CreateKeySecondPass;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.jbk.config.HibernateUtility;
import com.jbk.entity.Product;

public class Projectionex {
	SessionFactory sessionFactory = HibernateUtility.getSessionFactory();

	public List sumofproduct() {
		Session session =sessionFactory.openSession();
		List list=null;
		try {
			Criteria criteria =session.createCriteria(Product.class);
			criteria.setProjection(Projections.sum("productPrice"));
			list=criteria.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session !=null) {
				session.close();
			}
		}
		return list;	
	}

	public double maxpriceproduct() {
		Session session =sessionFactory.openSession();
		List list=null;
		double sum=0;
		try {
			Criteria criteria =session.createCriteria(Product.class);
			criteria.setProjection(Projections.max("productPrice"));
			list=criteria.list();
			sum = (Double) list.get(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session !=null) {
				session.close();
			}
		}
		return sum;	
	}
	
	public double minpriceproduct() {
		Session session =sessionFactory.openSession();
		List list=null;
		double sum=0;
		try {
			Criteria criteria =session.createCriteria(Product.class);
			criteria.setProjection(Projections.min("productPrice"));
			list=criteria.list();
			sum = (Double) list.get(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session !=null) {
				session.close();
			}
		}
		return sum;	
	}
	public double Avgpriceproduct() {
		Session session =sessionFactory.openSession();
		List list=null;
		double sum=0;
		try {
			Criteria criteria =session.createCriteria(Product.class);
			criteria.setProjection(Projections.avg("productPrice"));
			list=criteria.list();
			sum = (Double) list.get(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session !=null) {
				session.close();
			}
		}
		return sum;	
	}
	public long countpriceproduct() {
		Session session =sessionFactory.openSession();
		List list=null;
		long sum=0;
		try {
			Criteria criteria =session.createCriteria(Product.class);
			criteria.setProjection(Projections.count("productPrice"));
			list=criteria.list();
			sum = (Long) list.get(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session !=null) {
				session.close();
			}
		}
		return sum;	
	}
	public List<Product>ProjectionEx(){
		Session session=sessionFactory.openSession();
		List<Product>list=null;
		double max=0;
		try {
			Criteria criteria1 = session.createCriteria(Product.class);
			criteria1.setProjection(Projections.max("productPrice"));
			max=(double) criteria1.list().get(0);

			Criteria criteria2 = session.createCriteria(Product.class);
			criteria2.add(Restrictions.eq("productPrice", max));
			list = criteria2.list();		

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();
			}

			return list;	
		}
	}

}
