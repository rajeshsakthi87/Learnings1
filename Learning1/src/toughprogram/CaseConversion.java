package toughprogram;

import java.util.regex.Pattern;

public class CaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "RAJESH";
		StringBuilder sb = new StringBuilder();
		
		
		for(int i =0 ; i<name.length();i++)
		{
			char eachchar = name.charAt(i);
			int ch = (int)eachchar;	
			//System.out.println(ch);
			if(ch <= (int)('Z') || ch <= (int)('A'))
			{
				int ch1 = ch+32;
				char newch = (char)ch1;
				sb.append(newch);
			}
			
			
			//System.out.println(newch);
			
			//System.out.println((int)('A'));
			//System.out.println((int)('a'));			
		}
		System.out.print(sb.toString());
	}

}
