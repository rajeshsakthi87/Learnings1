package org.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class Exceptiontypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a = 10;
	if(a>5)
		throw new java.lang.ArithmeticException("issue");
}

catch(ArithmeticException e)
{
	System.out.println("handled "+e);
	
}
catch(Exception e)
{
	System.out.println("handled "+e);
}


	}

}
