package org.umar.learnExceptions;
import java.io.*;

class ThrowsException 
{
	public static void findFile() throws IOException
	{
		throw new IOException("File not found");
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			findFile();
			
	    } 
		
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	      
	    finally
	    {
			System.out.println("finally Error found");
		}
	   
	 }
}
	
