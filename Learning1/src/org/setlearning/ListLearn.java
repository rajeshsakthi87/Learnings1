package org.setlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.*;
public class ListLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> ls = new ArrayList<Integer>();
	        ls.add(12);
	        ls.add(0);
	        ls.add(21);
	        //ls.add(5,23);
	       //ls.remove(0);
	       ls.forEach(System.out::println);	   
	       List<Integer> ls1 = new ArrayList<Integer>();
	        ls1.add(12);
	        ls1.add(0);
	        ls1.add(21);
	        ls1.add(22);
	       ls.retainAll(ls1);
	       System.out.println(ls);
	  Object[] obj = ls.toArray();
	  for(Object obj1: obj)
	  {
		  System.out.println(obj1);
	  }	  
	  IntSummaryStatistics intsum = ls.stream().mapToInt(x->x).summaryStatistics();
	 // System.out.println(intsum.getAverage());
	 // System.out.println(intsum.getCount());
	 // System.out.println(intsum.getMax());
	 // System.out.println(intsum.getMin());
	  //System.out.println(intsum.getSum());
	  System.out.println(intsum.toString());
	  
	  List<String> actor = new ArrayList<String>();
	  actor.add("vijay");
	  actor.add("ajith");
	  System.out.println(actor);
	  List<String> copyactors = List.copyOf(actor);
	  System.out.println(copyactors);
	 // copyactors.add("vjs");
	  //System.out.println(copyactors);
	  actor.add("vjs");
	  System.out.println(actor);
	  List<String> unchange = actor.stream().collect(Collectors.toUnmodifiableList());
	  System.out.println(unchange);
	//  unchange.add("suriya");
	 List<String> unchanged = actor.parallelStream().collect(Collectors.toUnmodifiableList());  //System.out.println(unchange);
	  System.out.println(unchanged); 		    
	}

}
