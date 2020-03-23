package com.deb.practice;
import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		
		int i;
		try
		{
			FileInputStream fin =new FileInputStream("C:\\Users\\Debmalya\\eclipse-workspace\\Java Learning\\Learning\\src\\com\\deb\\practice\\test.txt");
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Debmalya\\eclipse-workspace\\Java Learning\\Learning\\src\\com\\deb\\practice\\copied.txt");
			do
			{
				i=fin.read();
				if(i!=-1)
					fout.write(i);
			}while(i!=-1);
			fin.close();
			fout.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found "+e);
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		finally
		{
						
		}
		
		// TODO Auto-generated method stub

	}

}
