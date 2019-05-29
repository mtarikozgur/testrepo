package day27_arrays_five;

import java.util.*;

public class SortAndToString {

	public static void main(String[] args) {

		int[] nums = {43, 12, 4, 1, 3, 5};
		
		String numList = Arrays.toString(nums);
		
		System.out.println(numList);
		
		Arrays.sort(nums); // Sorts array "nums" from lowest to highest
		
		// Since "sort" returns void we cannot write something like "num = Arrays.sort(num)"
		
		System.out.println(Arrays.toString(nums));
		
		String[] languages = {"Zulu", "Spanish", "Turkish"}; 
		
		Arrays.sort(languages); // Sorts array in alphabetical order
		
		System.out.println(Arrays.deepToString(languages));
		
		// When sorting a string, numbers come first, then uppercase, then lowercase, according to ASCII value
		
		int[] nums2 = {345, 665, 3333, 11, 3, 66}; // Print out the lowest and highest values without using loops
		
		Arrays.parallelSort(nums2);
		
		System.out.println(nums2[0]);
		System.out.println(nums2[nums2.length-1]);
		
		
		
	}

}
