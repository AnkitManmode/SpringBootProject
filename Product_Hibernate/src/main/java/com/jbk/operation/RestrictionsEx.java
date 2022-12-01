package com.jbk.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.jbk.config.HibernateUtility;
import com.jbk.entity.Product;

public class RestrictionsEx {

	SessionFactory sessionFactory = HibernateUtility.getSessionFactory();

	public List<Product> RestrictionEqual(){
		Session session = sessionFactory.openSession();
		List<Product>list = null;

		try {
			Criteria criteria = session.createCriteria(Product.class);

			criteria.add(Restrictions.eq("productName", "pen"));
			list = criteria.list();
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			session.close();
		}


		return list;
	}

	public List<Product> Restrictionlike(){
		Session session = sessionFactory.openSession();
		List<Product>list = null;

		try {
			Criteria criteria = session.createCriteria(Product.class);

			criteria.add(Restrictions.like("productName", "book"));
			list=criteria.list();
	
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			session.close();
		}
		return list;
	}
		
	
	public List<Product> RestrictionBetween(){
			Session session = sessionFactory.openSession();
			List<Product>list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
			//	criteria.add(Restrictions.between(" ", , );
				list = criteria.list();
			}catch(Exception e) {
				e.printStackTrace();
				
			}finally{
				session.close();
			}
			return list;
			
		}

}
