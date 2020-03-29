package com.practice.junit.tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit2 {
	
	@ Test
	
	public void checkName()
	{
		String name = "Debmalya";
		assertEquals("Debmalya",name);
	}
	

}
