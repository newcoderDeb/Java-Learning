package com.deb.practice;

public class Tyres {
	
	private double tyrePrice;
	private String company;
	Tyres(TyresType tt,double price)
	{
		this.company=company;
		tyrePrice=price;
	}
	
	private void setTyrePrice(double tyrePrice)
	{
		if(company.equalsIgnoreCase("MRF"))
		{
			this.tyrePrice=tyrePrice;
		}
		else if(company.equalsIgnoreCase("BridgeStone"))
		{
			this.tyrePrice=tyrePrice;
		}
	}
	double getTyrePrice()
	{
		return tyrePrice;
	}

}
