package org.staticlearning;

public class childstatic extends staticlearnings{
	int count=0;
	static void run()
	{
		System.out.println("child hello");
		//this.count=0;
				//super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticlearnings sc = new childstatic();
		staticlearnings.run();
		childstatic.run();
	}
	
}
