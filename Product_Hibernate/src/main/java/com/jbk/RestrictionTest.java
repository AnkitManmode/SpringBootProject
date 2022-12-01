package com.jbk;

import java.util.List;
import java.util.Scanner;

import com.jbk.entity.Product;
import com.jbk.operation.QueryEx;
import com.jbk.operation.RestrictionsEx;

public class RestrictionTest {
	public static void main(String[] args) {

		RestrictionsEx rest = new RestrictionsEx();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		switch(choice) {

		case 1:

			List<Product> list1 = rest.RestrictionEqual();
			for (Product product : list1) {
				System.out.println(product);
			
			
			break;
			}
		case 2:

			List<Product>list2 = rest.Restrictionlike();
			for (Product product : list2) {
				System.out.println(product);
			
			break;
			}
		case 3:
			List<Product>list3 = rest.RestrictionBetween();
			for (Product product : list3) {
				System.out.println(product);

			
			break;
			}
		}
	}
}
