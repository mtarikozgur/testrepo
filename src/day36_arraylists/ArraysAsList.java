package day36_arraylists;

import java.util.*;

public class ArraysAsList {

	public static void main(String[] args) {

		List<String> cars = Arrays.asList("Tesla", "Porche", "Lexus");

		List<Integer> nums = Arrays.asList(4,2,5,7,8); // Takes 4,2,5,7,8, converts them to an ArrayList, then assigns to nums
		
		System.out.println(nums.size());
		
		System.out.println();
		
		System.out.println(nums);
		
		nums.add(100); // If we make an ArrayList using .asList() we can no longer modify the size of the ArrayList
		
		System.out.println(nums);
		
	}

}
