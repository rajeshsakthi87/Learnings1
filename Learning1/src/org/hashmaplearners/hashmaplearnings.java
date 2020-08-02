package org.hashmaplearners;

import java.util.HashMap;
import java.util.Map;

public class hashmaplearnings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hp = new HashMap<>();
		hp.put(1,"rj");
		hp.put(5,"fj");
		hp.put(3,"hj");
		hp.put(4,"kj");
		
		hp.forEach((k,v)->System.out.println("key : "+k+" value : "+v));
		
	}

}
