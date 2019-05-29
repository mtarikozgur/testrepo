package day37_arraylists3;
import java.util.*;
public class MethodsSummary {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("red");
		list.add("blue");
		list.add("green");
		list.add("yellow");
		list.add("purple");
		
		System.out.println(list); // Automatically calls toString() and then prints out list
		
		System.out.println("Number of elements: " + list.size()); // returns the number of elements in the list
		
		System.out.println("Element at index 3: " + list.get(3)); // gets element at index 3
		
		list.remove(0); // removes element at index 0
		
		System.out.println(list);
		
		list.remove("blue"); // removes object "blue"
		
		System.out.println(list);
		
		list.set(1, "black"); // replaces element at index 1 with "black"
		
		System.out.println(list);
		
		System.out.println("Index of purple: " + list.indexOf("purple")); // returns the index of "purple"
		
		System.out.println("Is list empty? " + list.isEmpty()); // returns if list is empty or not
		
		System.out.println("Black in list? " + list.contains("black")); // returns if "black" is contained in list
		
		List<String> list2 = new ArrayList<>();
		
		list2.addAll(list); // adds all elements of list to the end of list2
		
		System.out.println("Does list contain all of list2? " + list.containsAll(list2)); // returns if list contains all elements in list2
		
		System.out.println("Does list equal list2? " + list.equals(list2)); // returns if list is identical to list2
		
		list2.add("pink");
		
		list2.removeAll(list); // removes all elements of list from list2
		
		System.out.println("list2 after removing all elements from list: " + list2);
		
		list2.addAll(0, list); // adds all elements of list to list2 at index 0
		
		System.out.println("list2 after adding all elements from list at index 0: " + list2);
		
		list2.clear(); // completely clears list2
		
		
		
		
		
	}

}
