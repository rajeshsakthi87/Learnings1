package org.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptionlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		//throw new IOException();
		int a = 10;
		int b = 0;
		int c = a/b;
		try
		{
			int d = 10;
			int e = 0;
			int f = d/e;
		}		
		catch(ArithmeticException e)
		{
			System.out.println(e + " is handled ");
		}
		finally
		{
			System.out.println(" inner block finally ");
		}
	}
	catch(ArithmeticException e)
	{
		System.out.println(e + " is handled outer block");
	}
	
		/*
		 * catch(NullPointerException e) { System.out.println(e + " handled "); }
		 */
	finally
	{
		System.out.println(" outer block finally ");
	}
	}
	}


