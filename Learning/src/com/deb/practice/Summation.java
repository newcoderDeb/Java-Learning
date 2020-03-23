package com.deb.practice;

public class Summation {
    
	   static int [] valueArray = {2,3,4,5,6};
	   
	   public static void main(String args[]) {
	       
	       
	      // calculate sum here.
	       //int len = valueArray.length;
	       int sum = 0;
	       for (int val : valueArray)
	       {
	           if(val%2 == 0)
	           sum +=val;
	       }
	       // access the length of array :  valueArray.length
	       // access an element of array : valueArray[i]
	      
	       
	       System.out.print(sum);   // this will print the value of sum to screen.
	   }
	   
}