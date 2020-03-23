package com.deb.practice;

public class Customer {
	
	private int custId;
	private String firstName;
	private String lastName;
	private String designation;
	
	Customer(int custId , String firstname, String lastName, String designation)
	{
		this.custId = custId;
		this.firstName = firstname;
		this.lastName = lastName;
		this.designation = designation;
	}
	private int getCustId() {
		return custId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	private String getLastname() {
		return lastName;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	@Override
	public String toString() {
		
		return "First Name : "+firstName+" "+"Last Name : "+lastName+" "+"Id : "+custId;
		//return "Customer [toString()=" + super.toString() + "]";
	}
	
	
}
