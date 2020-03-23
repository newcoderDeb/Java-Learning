package com.deb.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust1 = new Customer(1,"Debmalya","Mondal","QA Lead");
		Customer cust2 = new Customer(2,"Basundhara","Sharan","QA Lead");
		Customer cust3 = new Customer(3, "Abhijeet", "Dogra", "QA Analyst");
		Customer cust4 = new Customer(4, "Solanki", "Biswas", "My Love");
		
		List<Customer> al = new ArrayList<Customer>();
		List<String> al2 = new ArrayList<String>();
		
		al.add(cust1);
		al.add(cust2);
		al.add(cust3);
		al.add(cust4);
		al2.add("Debmalya");
		al2.add("Abhijet");
		Object obj [] = al2.toArray();
		for (Object ob : obj)
		{
			System.out.println(ob.toString());
		}
		
		Iterator<Customer> it = al.listIterator();
		
		//System.out.print("Customers are : ");
		
		while(it.hasNext())
		{
			//System.out.print(it.next().getFirstName()+", ");
			System.out.println(it.next());
		}
	
	}

}
