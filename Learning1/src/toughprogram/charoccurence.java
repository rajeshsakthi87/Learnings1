package toughprogram;

import java.util.HashMap;

public class charoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check = "programming";
		//char[] ch = check.toCharArray();
		int len = check.length();
		HashMap<String, Integer> hp = new HashMap<String, Integer>();
		for(int i = 0; i<=len-1;i++)
		{
			String val = String.valueOf(check.charAt(i));
			char ch = check.charAt(i);
			if(!hp.containsKey(val))
			{
				hp.put(val, 1);
			}
			else
			{
				Integer tmp = hp.get(val);
				hp.replace(val, ++tmp);
			}
		}
		System.out.println(hp);
	}

}
