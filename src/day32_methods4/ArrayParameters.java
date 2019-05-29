package day32_methods4;

public class ArrayParameters {

	public static void main(String[] args) {

		int[] myArray = {44, 22, 66, 11};
		printArray(myArray);
		
		printArray(new int[] {33, 45, 5, 7}); // Initializes a new array and passes it to printArray()
		
		print2Arrays(new int[] {45, 77, 45, 7}, new int[] {90, 3, 85, 71, 65});
		
	}
	
	public static void printArray(int[] nums) { // Method accepts int array object
		
		for(int n : nums) {
			
			System.out.print(n + " ");
			
		}
		
		System.out.println();
		
	}
	
	public static void print2Arrays(int[] nums1, int[] nums2) {
		
		if(nums1.length > nums2.length) {
			
			printArray(nums1);
			printArray(nums2);

		} else {
			
			printArray(nums2);
			printArray(nums1);
			
		}
		
	}
	

}
