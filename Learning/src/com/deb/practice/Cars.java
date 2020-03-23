package com.deb.practice;

enum Cars implements CarPrice{
	Benz(200000),Volkswagen(300000),BMW(500000);
	private long price;
	Cars(long price)
	{
		this.price=price;
	}
	
	public long getPrice()
	{
		return price;
	}

}
