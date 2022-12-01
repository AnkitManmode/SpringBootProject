package com.jbk.operation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jbk.config.HibernateUtility;
import com.jbk.entity.Product;

public class QueryEx {
	SessionFactory sessionFactory = HibernateUtility.getSessionFactory();

	public List<Product> getListOfProduct_Query(){

		Session session = sessionFactory.openSession();
		List<Product>list = null;
		try {
			String hql = "FROM Product";
			Query query = session.createQuery(hql);
			list = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return list;
	}
	public List<Product> getListOfProductByName_Query(String ProdName){

		Session session = sessionFactory.openSession();
		List<Product> list = null;
		try {
			String hql ="FROM Product WHERE productName= :parName";
			Query query = session.createQuery(hql);
			query.setParameter("parName", ProdName);
			list = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();

			}
		}

		return list;	
	}
}
