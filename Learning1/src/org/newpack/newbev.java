package org.newpack;

import org.learnings.Beverage;

public class newbev extends Beverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new newbev().callstuff();
		System.out.println(new newbev().doStuff());  
	}
	
	void callstuff()
	{
		System.out.println("this "+ this.doStuff());
		Beverage bv = new Beverage();
		//System.out.println("parent "+bv.doStuff());
	}

}
