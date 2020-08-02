package org.inherit;

public class B extends A {
	int i = 20;
	
	{
	        System.out.println(2);
	    }
	private void run()
	 {
		 System.out.println("child run");
	 }
	static void message()
	 {
		 System.out.println("child hello");
	 }
}
