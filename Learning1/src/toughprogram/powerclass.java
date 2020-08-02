package toughprogram;

import java.util.regex.Pattern;

public class powerclass {
	public static final Calculator my_calculator = new Calculator();
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 
		 
		 try {
             System.out.println(my_calculator.power(0, 0));
         } catch (Exception e) {
             System.out.println(e);
         }
	 }
	 
 }

