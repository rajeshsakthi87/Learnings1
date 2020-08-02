package org.generics;

public class genericclasstest {

	public static <T> void run(T obj)
	{
		System.out.println(obj.getClass().getName() + " = "+obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(12);
		run("helo");
		run(12.1f);
	}

}
