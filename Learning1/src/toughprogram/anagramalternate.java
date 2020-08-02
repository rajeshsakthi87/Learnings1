package toughprogram;

import java.util.HashMap;
import java.util.Map;

public class anagramalternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "bollywood";
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		
		for(int i=0;i<a.length();i++)
		{			
			String e = String.valueOf(a.charAt(i));
				if(!hmap.containsKey(e))
				{					
					hmap.put(e,1);
				}
				else
				{
					
					Integer temp = hmap.get(e);
					hmap.replace(e, ++temp);
			}
			
			}
			
		
		System.out.println(hmap);
	}
	}


