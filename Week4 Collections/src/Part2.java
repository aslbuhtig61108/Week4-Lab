import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
		List<String> finalList = convertSetToList(set); // Note: no longer need to declare the list from the method
		// System.out.println(finalList); // this eliminates extra lines of code
		
		for (String listString : finalList) {
			System.out.println(listString);
		}
		
		// write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the original set
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(3);
		integerSet.add(4);
		integerSet.add(8);
		integerSet.add(33);
		
		Set<Integer> extractedEvens = extractEvens(integerSet);
		for (Integer number : extractedEvens) {
			System.out.println(number);
		}
		
		// create a map of string and string and add 3 items to it where the key of each is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("jurisdiction", "the official power to make legal decisions and judgments.");
		dictionary.put("instantiate", "represent as or by an instance.");
		dictionary.put("explicitly", "in a clear and detailed manner, leaving no room for confusion or doubt.");
		
		// write and test a method that takes a Map<String, String> and a string and returns the value for a key in the map that matches the 
		// string parameter (i.e., like a language dictionary lookup)
		String value = lookupValue(dictionary, "instantiate");
		System.out.println(value);
				
		// write and test a method that takes a List<String> and returns a MapCharacter, Integer> containing a count of all the strings that start
		// with a given character
		Map<Character, Integer> counts = countStartingLetters(finalList);
		for (Character character : counts.keySet()) {
			System.out.println(character + " - " + counts.get(character));
		}
		
		
	}
	
	// LIST OF METHODS
	
	public static Map<Character, Integer> countStartingLetters(List<String> xlist) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		// int counter = 0;
		for (String string : xlist) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c,  results.get(c) + 1);
			}
		}
			
		return results;
		}
		
		 
	
	
	public static String lookupValue (Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return "";
	}
	
	
	public static Set<Integer> extractEvens(Set<Integer> set) {
		Set<Integer> results = new HashSet<Integer>();
			for (Integer number : set) {
				if (number % 2 == 0) {
					results.add(number);
				}
			}
		return results;
	}
	
	
	public static List<String> convertSetToList(Set<String> set) {
		List<String> results = new ArrayList<String>();
			for (String string : set) {
				results.add(string);
			}
		return results;
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
