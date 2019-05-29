package day35_wrapperclasses_arraylistintro;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>(); // Creates a new ArrayList
		ArrayList<Integer> nums = new ArrayList<>(); // The starting size of an ArrayList is 0
		
		names.add("Roman"); // Adding values to the ArrayList
		names.add("Orhan");
		names.add("Vlad");
		
		// You can add/remove as many items to an ArrayList as you want, because it has a flexable size
		
		nums.add(1);
		nums.add(12);
		nums.add(44);
		
		nums.add(new Integer("242"));
		
		
		System.out.println(names.get(0)); // Reading values from the ArrayList using .get()
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Numbers count: " + nums.size());
		
	}

}
