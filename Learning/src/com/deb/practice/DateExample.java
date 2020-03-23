package com.deb.practice;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dateTime = "10 3 1998";
		try {
			Date date = new SimpleDateFormat("MM dd YYYY").parse(dateTime);
			SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
			String dt = sdf.format(date);
			System.out.println(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
