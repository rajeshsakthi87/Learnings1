package toughprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class charoccnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check = "programming";
		char[] ch1 = check.toCharArray();
		int len = check.length();
		for(int i =0;i<len;i++)
		{
			char val = ch1[i];
			long count = check.chars().filter(ch->ch==val).count();
			System.out.println(val +" " + count);
			long cnt = check.codePoints().filter(ch->ch==val).count();
			System.out.println(cnt);
		
		}
		
		List<String> ls = new ArrayList<String>();
		ls.add("raj");
		ls.add("hel");
		Object[] obj = ls.toArray();
				System.out.println(Arrays.toString(obj));
		
		ls.forEach(o->System.out.println(o));
	}

}
