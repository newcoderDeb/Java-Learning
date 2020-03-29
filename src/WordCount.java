import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class WordCount {
	
	public static void main(String args[]) throws IOException
	{
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  System.out.print("Enter a sentence : ");
	  String name = reader.readLine();
	  String input[] = name.split(" ");
	  System.out.println("Number of words : "+input.length);
	  
	} 

}
