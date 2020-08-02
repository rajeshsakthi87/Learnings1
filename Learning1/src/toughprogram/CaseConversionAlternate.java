package toughprogram;

import java.util.regex.Pattern;

public class CaseConversionAlternate {
	public static void main(String[] args) {
		String name = "RAJESH";
		boolean flag=false;
		StringBuilder sb = new StringBuilder();				
		for(int i =0 ; i<name.length();i++)		{
			String eachchar = String.valueOf(name.charAt(i));
			char ch = name.charAt(i);		
			if( Pattern.matches("[a-zA-Z]", eachchar))
			{	flag = true;
				boolean b = Character.isUpperCase(ch);
				if(b)
				{
				int ch1 = (int)ch;
				int ch2 = ch1+32;
				char newch = (char)ch2;
				sb.append(newch);
				}
				else
				{
					int ch1 = (int)ch;
					int ch2 = ch1-32;
					char newch = (char)ch2;
					sb.append(newch);
				}			}
			else
			{
				System.out.println("String contains special characters");
				flag = false;
				break;
			}		}
		if(flag)
		{
		System.out.print(sb.toString());
		}
		else
		{
			//
		}}	}


