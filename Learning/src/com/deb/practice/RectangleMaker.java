package com.deb.practice;

public class RectangleMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 8;
		for (int i=1; i<=size; i++)
		{
			for(int j=1; j<=size; j++)
			{
				if ((i >=2 && i<size) && (j >=2 && j <size))
				{
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
