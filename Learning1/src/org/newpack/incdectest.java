package org.newpack;

public class incdectest {
	public static void main(String[] args) {
	int x =0;
	int y =0;
	for(int z=0;z<5;z++)
	{
		System.out.println(x);
		System.out.println(y);
		
		if((++x>2) && (++y>2))
		{
			x++;
			System.out.println(x);
			System.out.println(y);
		}
		System.out.println(z);
	}
	System.out.println(x + ""+y);
	
	
	}
}
