package com.jbk;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jbk.entity.Product;
import com.jbk.operation.Operation;
import com.jbk.operation.RestrictionsEx;

public class Test {
	public static void main(String[] args) {

		Operation operation = new Operation();

		Product product1 = new Product(2, "pencil", 10, 2, "Stationary");
		//operation.saveProduct(product1);

		Product product2 = new Product(3, "Erasor", 5, 3, "Stationary");
		//operation.updateProduct(product2);

	/*	List<Product>list = operation.getProductList();

		for (Product product3 : list) {
			System.out.println(product3);

		}*/
		
	//	Product product3=new Product(3, "Erasor", 5, 3, "Stationary");
	//	operation.deleteProductById(3);

		List<Product>list = operation.getProductList();

		for (Product product4 : list) {
			System.out.println(product4);
		}
	}
}
