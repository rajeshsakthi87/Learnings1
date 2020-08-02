package toughprogram;

import java.util.Scanner;

public class primeprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val = 17;
		int count=0;
		if(val%2==0)
		{
			++count;
		}
		if(val%val==0)
		{
			++count;
		}
		if(count>1)
		{
			System.out.println(val + "is not a prime");
		}
		else
		{
			System.out.println(val + "is a prime");
		}
		
	}

}
