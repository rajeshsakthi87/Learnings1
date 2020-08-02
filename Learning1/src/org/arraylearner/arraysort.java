package org.arraylearner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,4,3,2,7,6,11,15,10,12};
	Arrays.sort(arr);	
	System.out.println(Arrays.toString(arr));
	List<Integer> ls = new ArrayList<Integer>();
	ls.add(1);
	ls.add(10);
	ls.add(2);
	ls.add(19);
	ls.add(10);	
	ls.add(7);
	System.out.println(ls);
	Collections.sort(ls);
	System.out.println(ls);
	Collections.reverse(ls);
	System.out.println(ls);
	//System.out.println(ls.toArray().toString());
	System.out.println(Arrays.asList(ls));
	int[] zip = new int[5];
	zip[0] = 7;
	zip[1] = 3;
	zip[2] = 4;
	zip[3] = 1;
	zip[4] = 9;
	System.out.println( zip[ 2 + 1 ] );	
	int[] z = new int[9];
	z[0] = 7;
	z[1] = 3;
	z[2] = 4;
	System.out.println( z[0] + z[1] + " " + z[5] );	

	}
}
