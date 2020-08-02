package toughprogram;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String a = "bollywood";
		int l = a.length();
		String[] d = new String[l];
		String b = "margana";
		String b1="";
		Map<String, String> hmap = new HashMap<String, String>();
		
		for(int i=0;i<=a.length();)
		{			
			String e = String.valueOf(a.charAt(0));
			System.out.println(e);
			if(a.length()!=1)
			{
				String[] details = getlenstring(e,a).split("~");
				a = details[1];
				b1=details[0];
				if(!hmap.containsKey(e))
				{
					
					hmap.put(e,b1);
				}
			}
			else
			{
				if(!hmap.containsKey(e))
				{
					hmap.put(e,b1);
					break;
				}
			}
			
		}
		
		System.out.println(hmap);
	}
	
	public static String getlenstring(String d, String s1)
	{
		int a = s1.length();
		if(a==0)
		{
			System.exit(0);
		}
			String f = s1.replace(d,"");
			String g = f.trim();
			System.out.println(g);
			int h = s1.length() - g.length();
			return  String.valueOf(h) + "~" + g;
				
	}

}

