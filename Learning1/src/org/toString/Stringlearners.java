package org.toString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringlearners {

	public static void main(String[] args) {
		// Java 11 features
		String bigvalue = "rajesh is a good boy\n"
				+ "deepak is a good boy\n"
				+ "ramesh is a nice man";
		System.out.println(bigvalue);
		System.out.println(bigvalue.lines().collect(Collectors.toList()));
		String str = "  rajesh  ";
		System.out.print("Hi");
		System.out.print(str.strip());
		System.out.println("!!");
		System.out.print("Hi");
		System.out.print(str.stripLeading());
		System.out.println("!!");
		System.out.print("Hi");
		System.out.print(str.stripTrailing());
		System.out.println("!!");
		String str1 = "rajesh"+"!".repeat(3);
		System.out.println(str1);
		//Java 12 features
		String str2 = "Hi this is rajesh";
		List ls = str2.transform(s1->{return Arrays.asList(s1.split("//s"));});
		System.out.println(ls);
		
				
		}
		
	}

