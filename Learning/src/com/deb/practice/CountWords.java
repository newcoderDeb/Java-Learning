package com.deb.practice;

public class CountWords {
	
	public static int countWords(String source, String searchedString)
	{
		int occurence = 0;
		int count = 0 ;
		source = source.toLowerCase();
		while (occurence !=-1)
		{
			occurence = source.indexOf(searchedString, occurence);
			if (occurence !=-1)
				count ++ ;
			if (occurence == -1)
				break;
			if (occurence < source.length()-1)
				occurence ++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		String sourceString = "Now let’s go to do something. Let me explain it first. let";
		String search = "let";
		System.out.println("The given string has "+CountWords.countWords(sourceString, search)+" occurences of searched String --> "+search);
		

	}

}
