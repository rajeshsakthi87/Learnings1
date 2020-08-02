package org.arraylearner;

import java.util.Arrays;

public class arayvalreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Monday is the first day of the week";
		String[] sep = text.split("\\s");
		System.out.println(sep.length);
		for(int i =0 ;i<sep.length;i++)
		{
			StringBuilder sb = new StringBuilder(sep[i]);
			if(!(i%2==0))
			{
				sb.reverse();
				//System.out.println(sb);
				sep[i]=sb.toString();
			}
			else
			{
				sep[i]=sb.toString();
			}
					
		}
		System.out.println(Arrays.toString(sep));
	}

}

