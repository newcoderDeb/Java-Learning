package com.deb.practice;

import java.math.BigDecimal;
public class Test {

	public static void main(String[] args) {
		
		//System.out.println("Test");
		//@SuppressWarnings("unchecked")
		//Car cc = new Car();
		//cc.setPrice(100);
		//Cars car;
		/*for(Cars car:Cars.values())
		{
			System.out.println(car+" costs "+car.getPrice());
		}*/
		// TODO Auto-generated method stub
		
		Loan loan = new Loan(new BigDecimal("5000"),1.73);
		
		System.out.println(loan.getTotalValue());
		
		String A = "debmalya";
		String B = "mon";
		System.out.println(A.substring(0,3));

	}

}
