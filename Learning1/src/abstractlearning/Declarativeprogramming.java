package abstractlearning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.lang.Runnable;
public class Declarativeprogramming  {

	public static void main(String[] args) {
		
		//to find the sum of 0-100
		int sum = IntStream.rangeClosed(0, 100).sum();
		System.out.println("declartive approach of sum "+sum);
		//to get unique values from a list		
		List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,3,6,7,2,3);
		System.out.println(list);
		List<Integer> unique_list = list.stream().distinct().collect(Collectors.toList());
		System.out.println(unique_list);
		
		HashMap<String, Integer> hp = new HashMap<String, Integer>();
		hp.put("rajesh", 11);
		hp.put("ambika", 12);
		hp.put("am", 21);
		hp.put("ambik", 7);
	//	System.out.println(hp);
		//System.out.println(hp.values());
		Set<String> st = hp.keySet().stream().collect(Collectors.toSet());
		System.out.println(st);
		Set<Integer> st1 = hp.values().stream().sorted().collect(Collectors.toSet());
				System.out.println(st1);
				List<Integer> uni=hp.values().stream().sorted().collect(Collectors.toList());
				System.out.println(uni);
				
				Set<Integer> arrset = new HashSet<Integer>();
				arrset.addAll(Arrays.asList(new Integer[] {32,4,43,12,45,67}));
				arrset.stream().sorted().forEach(System.out::print);
				System.out.println(arrset);
				List<Integer> ls = Arrays.asList(new Integer[] {234,454,5,53,324,22});
				System.out.println(ls);
				long count = ls.stream().count();
				System.out.println(count);
			}
}
