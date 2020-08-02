package org.arraylearner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class arraylearners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[] {1,5,3,14,2,6,17,8};
		int[] ar2=ar1.clone();
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		Arrays.sort(ar2);
		
		System.out.println(Arrays.toString(ar2));
		int[] ar3= Arrays.copyOfRange(ar1, 2, 5);
		System.out.println(Arrays.toString(ar3));
		
		String name = "Rajesh12";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			//System.out.println(ch);
			if(Character.isAlphabetic(ch))
			{
				System.out.println("the given characters is alphabetic letter "+ch);
			}
			else
			{
				System.out.println("the given characters is non alphabetic letter "+ch);
			}
		}
		 char ch = 'A';
		 System.out.println(Character.isAlphabetic(ch));
		 System.out.println(Character.isDigit(ch));
		 System.out.println(Character.isLetter(ch));
		 System.out.println(Character.isLowerCase(ch));
		 System.out.println(Character.isUpperCase(ch));
		 System.out.println(Character.isWhitespace(ch));
		 
	}

}
