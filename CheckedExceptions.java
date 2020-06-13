package org.umar.learnExceptions;

import java.io.*;

class CheckedExceptions 
{
	public static void main(String args[]) throws IOException
	{
		
      FileInputStream fis = null;
      
      fis = new FileInputStream("C:/myfile.txt"); 
      
      int f; 

      while(( f = fis.read() ) != 0) 
      { 
	   System.out.print((char)f); 
      } 
      fis.close(); 	
   }
}
