package com.jbk;

import java.util.List;
import java.util.Scanner;

import com.jbk.entity.Product;
import com.jbk.operation.QueryEx;

public class QueryTest {
	public static void main(String[] args) {
		QueryEx qu=new QueryEx();
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {

		case 1:
			List<Product>list1=qu.getListOfProduct_Query();

			for (Product product : list1) {
				System.out.println(product);
			}
			break;
		case 2:

			List<Product>list=qu.getListOfProductByName_Query("pen");
			for (Product product : list) {
				System.out.println(product);
			}
			break;
		}
	}
}