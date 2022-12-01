package com.jbk.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.jbk.config.HibernateUtility;
import com.jbk.entity.Product;

public class Operation {
	
	SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
	
	public void saveProduct(Product product) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
		
			session.save(product);
			transaction.commit();
			System.out.println("Product is saved");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(session !=null) {
				session.close();
			}
		}
	}
		
	public Product getProductById(int productId) {
		Session session = sessionFactory.openSession();
		Product product = session.get(Product.class, productId);
		return product;
	}
	
	public void deleteProductById(int productId) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Product product = session.get(Product.class, productId);
		session.delete(product);
		transaction.commit();
		System.out.println("Product deleted");
	}
	
	public void updateProduct(Product product) {
		
		 Session session = sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 
		Product pro= session.get(Product.class, product.getProductId());
		 if(pro !=null) {
			 
		 session.update(product); // works on primary key
		 transaction.commit();
		 System.out.println("Product updated");
		 }else {
			 System.out.println("product not found for update");
		 }
		 }

	public List<Product> getProductList(){
		Session session = sessionFactory.openSession();
		List<Product>list = null;
		try {
			Criteria criteria = session.createCriteria(Product.class);// FROM Product
			criteria.setFirstResult(1); // pass index of column, starts from index 1
			criteria.setMaxResults(3);// maximum 3 records, pagination
			
			list = criteria.list();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return list;
	
	}	
}