package org.generics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Test<Integer> obj = new Test<Integer>(15);
		System.out.println(obj.getObject());
		Test<String> obj1 = new Test<String>("hello");
		System.out.println(obj1.getObject());
		Class cls = obj.getClass();
		System.out.println("class name : "+cls.getName());
//		Constructor cons;		
//			cons = cls.getConstructor();
//			System.out.println("constructor name : "+cons.getName());
//			Method[] meth = cls.getMethods();
//			for(Method meth1 : meth)
//				System.out.println("method name : "+meth1.getName());
			Sample sm = new Sample();
			Class cl1 = sm.getClass();
			System.out.println(cl1.getName());
			Constructor cs1 = cl1.getConstructor();
			System.out.println(cs1.getName());
			Method[] meth1 = cls.getMethods();
			for(Method meth2 : meth1)
				System.out.println("method name : "+meth2.getName());
	}

}
