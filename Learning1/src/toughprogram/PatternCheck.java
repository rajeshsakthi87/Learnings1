package toughprogram;

import java.util.regex.Pattern;

public class PatternCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("((?=.*[a-zA-Z_]).{5,30})", "Julia01"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
	}

}
