package org.learnings;

public class Tea extends Beverage {
	public static int x =10;
	public void print()
	{
		System.out.println(1);
	}
	protected int doStuff()
	{
		System.out.println(2);
		return 0;
	}
	public static void main(String[] args) {
	
		System.out.println("value of " +x);

		System.out.println("value1 of "+Tea.x);
		new Tea().print();
		new Tea().doStuff();
		Beverage bv = new Beverage();
		System.out.println(bv.x);
		System.out.println(bv.doStuff());
	}

}
