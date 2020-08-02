package org.overridelearning;

public class Stringtest {

	public static void main(String[] args) {
		String s = new String("this      is     me");
		s = s.trim();
		System.out.println(s);
		String s1 = new String("newspaper");
		String t = s1.substring(5,7);
		System.out.println(t);
		char a = t.charAt(1);
		t = t + a;
		System.out.println(t);

	}

}
