package com.practice.junit.tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	
	@Test
	
	public void testMessageCheck()
	{
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);
	}
	
	@Test
	
	public void testAddition()
	
	{
		int a = 3;
		int b = 4;
		int c = a + b;
		assertEquals(7,c);
	}
	

}
