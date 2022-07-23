import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part1 {

	public static void main(String[] args) {
		/*
		 * Strings are immmutable meaning strings can't change -when concatenating two
		 * strings together, a new unique string is created in memory -n times a string
		 * is changed equates to increased of instances in memory leading to a
		 * "memory leak", which decreases resources A StringBuilder, on the other
		 * hand,allows the dynamic manipulation of a string until the final result is
		 * turned into a string without the expense of a string's limitations
		 * 
		 */

		
		// instantiate a new StringBuilder and append the characters 0 through 9 to it
		// separated by dashes making sure no dashes appear at the end of the
		// StringBuilder
		StringBuilder result = new StringBuilder();
	
		for (int m = 0; m < 10; m++) {
			result.append(m);
			if (m != 9) {
				result.append("-");
			}
		}	
		System.out.println(result.toString());	
			
		// Create a list of Strings and add 5 Strings to it, each with a different length
		List<String> strings = new ArrayList<String>();
		strings.add("Tali");
		strings.add("Sammy");
		strings.add("Paul");
		strings.add("III");
		strings.add("Me");
		
		// Arrays.asList("Tom", "Sammy", "Paul"); May need to import java.utils.Arrays package
		// write and test a method that takes a list of strings and returns the shortest string
		System.out.println(findShortestString(strings));
		
		// write and test a method that takes a list of strings and returns the list with the first and last element switched
		// switchedFirstAndLastElements(List<Strings> strings);
		List<String> swapped = switchedFirstAndLast(strings);
		for (String string : swapped) {
			System.out.println(string);
		}
		
		// write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each other, separated by a comma
		System.out.println(combineStrings(swapped));
		
		
		// write and test a method that takes a list of strings and a string and returns a new new list with all strings from the original list 
		// containing the second string parameter (i.e., like a search method)
		
		
		// write and test a method that takes a list of integers and returns a List<List<Integer>> where the first list in returned value
		// contains any number from the input list that is divisible by 2, the second list contains values from the input list that are divisible
		// by 3, the third divisible by 5, and the fourth all numbers from the input list not divisible by 2, 3, or 5
		
		
		}
	
		// METHODS USED IN THIS LAB
		
		public static String findShortestString(List<String> xlist) {
			String shortest = xlist.get(0);
			for (String string : xlist) {
				if (string.length() < shortest.length()) {
					shortest = string;
				}
			}
			return shortest;
		}

		public static List<String> switchedFirstAndLast (List<String> alist) {
			String temp = alist.get(0);
			alist.set(0, alist.get(alist.size()-1));
			alist.set(alist.size()-1, temp);
			return alist;
		}
		
		public static String combineStrings (List<String> strings) {
			StringBuilder result = new StringBuilder();
			for (String string : strings) {
				result.append(string + " ,");
			}
			return result.toString();
		}

	}


