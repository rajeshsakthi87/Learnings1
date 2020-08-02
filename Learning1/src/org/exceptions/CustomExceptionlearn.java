package org.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CustomExceptionlearn {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
try {
			int a =10;
			if(a>5)
				throw new MyException("hello");
			//System.out.println("hello");
				
				
			//throw new ArithmeticException("hello");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
