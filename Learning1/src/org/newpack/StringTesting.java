package org.newpack;

public class StringTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="fred";
		String t=a;
		System.out.println(t.toUpperCase());
		System.out.println(t);
		boolean b = 100>99;
		System.out.println(b);
		float f = 23.44f;
		short m = (short)f;
		System.out.println(m);
		long l = 130L;
		byte b1 = (byte)l;
		System.out.println(b1);
		boolean b2=true&&false;
		System.out.println(b2);
		float e = 10.2f/0;
		System.out.println(e);
		float f1=10.2f%0;
		System.out.println(f1);
		/*
		 * int i1=10/0; System.out.println(i1); int i2=10/0; System.out.println(i2);
		 */
		
		int x =100;
		double y = 100.0;
		boolean b3=(x==y);
		System.out.println("b3 " +b3 );
		if(x==y)
		{
			System.out.println("true");
		}
		 int n = 10;
		    float f2 = 10.0f;
		    System.out.println(f2==n);
	}

}
