package day27_arrays_five;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = {4, 6, 7, 10, 55};
		
		int indexOfSeven = Arrays.binarySearch(nums, 7);
		
		System.out.println(indexOfSeven);
		
	}

}
