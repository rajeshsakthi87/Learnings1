package org.innerclasslearning;
import org.innerclasslearning.innerclasslearnings.inclass;
public class innerclasslearnings {
	public String name = "rajesh";
	public static String name1 = "ambika";
	//normal innerclass
	public class inclass {
		public int a= 1;
		public int b= 1;
		public int sum()
		{
			if(innerclasslearnings.this.name.equalsIgnoreCase("rajesh"))
			{
				System.out.println("hi "+innerclasslearnings.this.name);
				System.out.println("hi "+innerclasslearnings.this.name1);
			}
			return a+b;			
		}	}
	//static innerclass
	public static class inclass1 {
		public int a= 1;
		public int b= 1;
		public int sum()
		{
			//non static variable of the outer class cannot be accessed from the static inner class
			if(innerclasslearnings.name1.equalsIgnoreCase("ambika"))
			{
				System.out.println("hi "+innerclasslearnings.name1);
			}
			return a+b;			
		}	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerclasslearnings icl = new innerclasslearnings();
		innerclasslearnings.inclass ic = icl.new inclass();
		System.out.println(ic.sum());
		System.out.println(icl.name);
		innerclasslearnings.inclass1 ic1 = new innerclasslearnings.inclass1();
		System.out.println(ic1.sum());
						}	
	
}
