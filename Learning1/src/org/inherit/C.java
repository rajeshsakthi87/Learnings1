package org.inherit;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static methods cannot be overridden
		A a = new B();
		System.out.println(a.i);
		a.message();
		A a1 = new A();
		a1.message();
		B b =new B();
		b.message();
	}

}
