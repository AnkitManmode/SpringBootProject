package com.jbk;

import java.util.List;
import java.util.Scanner;

import com.jbk.entity.Product;
import com.jbk.operation.Projectionex;

public class Test1 {
	public static void main(String[] args) {
		
		Projectionex op=new Projectionex();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {

	case 1:

		List sum1= op.sumofproduct();
		System.out.println("sum of the product is==>" +sum1);

		break;
	case 2 :

		double sum2= op.maxpriceproduct();
		System.out.println("maximum price of the product is==>"+sum2);

		break;
	
	case 3 :

		double sum3= op.minpriceproduct();
		System.out.println("minimum price of the product is==>"+sum3);

		break;	
	
	case 4:

		double sum4= op.Avgpriceproduct();
		System.out.println("Average price of the product is==>"+sum4);

		break;
	case 5:

		long sum5= op.countpriceproduct();
		System.out.println("product count is==>"+sum5);

		break;
	case 6 :
		List<Product>list=op.ProjectionEx();
		System.out.println(list);

		break;
	}
	}
}