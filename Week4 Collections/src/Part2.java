import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Part2 {

	public static void main(String[] args) {
		// write and test a method that takes a list of strings and a string and returns a new list with all 
		// strings from the original list containing the second string parameter (i.e., like a search method)
		List<String> strings = new ArrayList<String>();
		strings.add("Me");
		strings.add("Sammy");
		strings.add("Paul");
		strings.add("III");
		strings.add("Tali");
		
		
		List<String> searchResults = search(strings, "a");
		for (String result : searchResults) {
			System.out.println(result);
		}
				
		// write and test a method that takes a list of integers and returns a List<List<Intger>> where the first
		// list in the returned value contains any number from the input list that is divisible by 2, the second
		// list contains values from the input list that are divisible by 3, the third divisible by 5, and the fourth
		// all numbers from the input list not divisible by 2, 3, or 5
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 12, 15, 16, 20, 25, 30);
		
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("Next list ===============");
		}
		
		// write and test a method that takes a list of strings and returns a list of integers 
		// that contains the length of each string 
		List<Integer> stringLengths = calculateStringLengths(strings);
		for (Integer i : stringLengths) {
			System.out.println(i);
		}
		
		// create a set of strings and add 5 values
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("Fish");
		set.add("Welcome");
		set.add("Kumusta");
		set.add("Calasiao");
		
		// write and test a method that takes a set of strings and a character and returns a set of strings consisting
		// all of the strings in the input set that start with the character parameter
		Set<String> startsWithH = findAllThatStartWith(set, 'C');
		for (String word : startsWithH) {
			System.out.println(word);	
		}
		
		// write and test a method that takes a set of strings and returns a list of the same strings
		
		
		
	}
	
	// LIST OF METHODS
	
	public static List<String> returnList(Set<String> set1) {
		
	}
	
	public static Set<String> findAllThatStartWith(Set<String> set, char c) {
		Set<String> results = new HashSet<String>();
		
		for (String string : set) {
			if (string.charAt(0)== c) {
				results.add(string);
			}
		}
		return results;
	}
	
	public static List<Integer> calculateStringLengths(List<String> list) {
		List<Integer> lengths = new ArrayList<Integer>();
		for (String string : list) {
			lengths.add(string.length());
		}
		return lengths;
		
	}
	
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
		// Previous lists were individual data types
		// This exercise demonstrates using a list of a list of data types
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>()); 
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer  number : list) {
			if (number % 2 == 0) {
				results.get(0).add(number);
			} if (number % 3 == 0) {
				results.get(1).add(number);
			} if (number % 5 == 0) {
				results.get(2).add(number);
			} if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0){
				results.get(3).add(number);
			}
		}
		return results;
		
	}
	
	public static List<String> search(List<String> list, String query) {
		List<String> results = new ArrayList<String>();
		for (String string : list) {
			if (string.contains(query)) {
				results.add(string);
			}
		}
		return results;
		
	}
	
	
	
}
