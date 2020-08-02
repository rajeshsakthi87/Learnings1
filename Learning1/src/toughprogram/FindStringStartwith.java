package toughprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class FindStringStartwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Rajesh", "rajesh","ramesh","sujith","ambika", "srileka","malar", "sakthi", "jeevanthika", "sashika"};
		
		for(String name : names )
		{
			Pattern p=Pattern.compile("^r",Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(name);
			if(m.find())
			{
				System.out.println(name);
			}
			
		}
		
		
		  for(String name1 : names) 
		  {
			  if((name1.startsWith("r")) || (name1.startsWith("R")))
		  {
		  System.out.println(name1); }
		  
		  }
		 
			
			
	}

}
