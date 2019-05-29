package day27_arrays_five;

import java.util.*;

public class CopyOf2 {

	public static void main(String[] args) {

		int[] nums1 = {34, 56, 23, 1, 55};
		
		int[] nums2 = Arrays.copyOf(nums1, nums1.length + 2); // Creates a copy of array nums1 and gives it two default slots (two zeros)
		
		System.out.println(Arrays.toString(nums2));
		
		
		int[] brandNew = {34, 23, 54, 23};
		brandNew = Arrays.copyOf(brandNew, brandNew.length + 5); // Modifies the array "brandNew" to have 5 extra default slots
		
		
		
	}

}
