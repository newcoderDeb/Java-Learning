package com.deb.practice;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		
		String us = nf.format(12324.123);
		String fr = nf2.format(12324.123);
		String ch = nf3.format(12324.123);
		String rs = nf4.format(12324.123);
		int len = rs.length();
		int len2 = ch.length();
		System.out.println(len+" "+len2);
		String fn = "Deb";
		String ln = "Mon";
		System.out.println(fn.substring(0,1));
		System.out.println(us);
		System.out.println(fr);
		System.out.println(ch);
		System.out.println(rs);
		
	}
}
		