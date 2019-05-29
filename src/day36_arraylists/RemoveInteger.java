package day36_arraylists;

import java.util.*;

public class RemoveInteger {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>(10); // Creates array with 10 empty slots

		System.out.println(nums.size()); // However, size is still 0
		System.out.println(nums.isEmpty());

		nums.add(4);
		nums.add(5);
		nums.add(75);
		nums.add(11);
		nums.add(83);
		nums.add(77);

		System.out.println(nums);

		System.out.println();

		nums.remove(5); // Removes number at index 5, NOT the number 5

		System.out.println(nums);

		System.out.println();
		
		Integer n1 = Integer.valueOf(5);
		
		nums.remove(n1); // Removes the number 5 from the ArrayList
		
		System.out.println(nums);

		System.out.println();
		
		
		
		nums.remove(Integer.valueOf(4)); // Removes the number 4 from the ArrayList
		
		System.out.println(nums);

		System.out.println();

	}

}
