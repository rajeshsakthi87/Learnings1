package toughprogram;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
        String A="hello";
        String D= new String("hello");
        String F= new String("HELLO");
        String B="java";
        String c = A.substring(0,1).toUpperCase() + A.substring(1);
        String d = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(c + " " +d);
        String C="java";
        String E="HELLO";          
        int a = A.length();
        int b = B.length();
        System.out.println(a + b );
        int comp = A.compareTo(B);
        if(A==B)
        {
        	System.out.println("A==B equal");
        }
        if(B==C)
        {
        	System.out.println("B==C equal");
        }
        if(A==D)
        {
        	System.out.println("A==D ");
        }
        if(A.equals(D))
        {
        	System.out.println("A==D equals");
        }
        if(A==E)
        {
        	System.out.println("A==E equal");
        }
        if(F==E)
        {
        	System.out.println("F==E equal");
        }
        if(comp<0)
        {
           System.out.println("No"); 
        }
        else
        {
           System.out.println("Yes"); 
        }
        
        System.out.println("abc".length());
	}

}
