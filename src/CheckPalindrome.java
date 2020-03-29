import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome {
	
	public static void main(String args[]) throws IOException
	{
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  System.out.print("Enter a number : ");
	  try 
	  {
	   int num = Integer.parseInt(reader.readLine());
	   if(checkPalindrome(num))
	    {
		   System.out.println("This is a palindrome"); 
	    }
	   else
	   {
		   System.out.println("This is not a palindrome");
	   }
	  }
	  catch (NumberFormatException e)
	  {
		  System.out.println("This is not a number");
	  }
	  	  
	} 
	
	static boolean checkPalindrome(int checkPal)
	{
		int digits=0,rev=0;
		digits = Integer.toString(checkPal).length();
		rev = (checkPal%10)*(int)Math.pow(10, (digits-1));
		int val = checkPal;
		//rev = (int)Math.pow((checkPal%10), Math.pow(10,(digits-1)));
		for(int i=digits;i>=2;i--)
		{
			rev += ((val/10)%10)*(int)Math.pow(10, (i-2));
			val /= 10;
			//rev += Math.pow(((checkPal/10)%10),(i-1));
		}
		//rev = rev + rev1;
		//rev = ((checkPal%10)*10)+(checkPal/10);
		System.out.println(rev+" "+checkPal+" "+digits);
		if(checkPal == rev)
		return true;
		else
		{
			return false;
		}
	}

}