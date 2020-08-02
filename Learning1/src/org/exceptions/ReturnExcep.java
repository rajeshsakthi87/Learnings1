package org.exceptions;

public class ReturnExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("method return ->" + m());
	}
	static String m()
	{
		try
		{
			int i = 10/0;
		}
		catch(Exception e)
		{
			try
			{
				meth();
			}
			catch(Exception e1) {
				System.out.println("null exception");
			}
			return "catch";
		}
		finally
		{
			meth();
			return "finally";
			
		}
	}
	static void meth()
	{
		throw new NullPointerException();
	}
}
