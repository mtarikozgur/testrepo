package day27_arrays_five;

import java.util.*;

public class ArraysEquals {

	public static void main(String[] args) {

		int[] nums1 = {4, 5, 6, 10, 100};
		int[] nums2 = {4, 5, 6, 10, 100};
		
		if(Arrays.equals(nums1, nums2)) {
			
			System.out.print("Arrays are equal");
			
		} else {
			
			System.out.print("Arrays are not equal");
			
		}
		
	}

}
