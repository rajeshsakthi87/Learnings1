package org.setlearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setlearning {
	public static void main(String[] args) {
		
		Set<String> st = new HashSet<String>();
		st.add("ambika");
		st.add("rakesh");
		st.add("aarthi");
		st.add("peter");
		st.add("peter");
		System.out.println(st);
		//System.out.println(st.getClass());
		//System.out.println(st.size());
		List<String> lt = new ArrayList<String>();
		lt.addAll(st);
		System.out.println(lt);
		Set<String> tst = new TreeSet<String>(st);
		System.out.println(tst);		
		Collections.swap(lt, 0,1);
		System.out.println(lt);
	}
}
