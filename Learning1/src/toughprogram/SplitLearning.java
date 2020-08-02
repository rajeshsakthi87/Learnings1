package toughprogram;

import java.util.Arrays;

public class SplitLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to EXPLAINJAVA.COM!";
        String[] parts = s.split("\\s",2);
        String part1 = parts[0];
        String part2 = parts[1];
        System.out.println("First part: " +parts.length);
        System.out.println("First part: " + part1);
        System.out.println("Second part: " + part2);
        
        String[] split = "1,2|3.4$5".split("[,|.]");
        System.out.println(Arrays.toString(split));
	}

}
