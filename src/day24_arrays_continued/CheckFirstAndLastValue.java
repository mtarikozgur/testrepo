package day24_arrays_continued;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {

		// Checks if the first and last elements of the array are equal
		
		int[] nums = {2,3,4,5,6,2};
		
		System.out.println(nums[0] == nums[nums.length-1]); // .length is a field of the nums array, not a method
		
		
	}

}
