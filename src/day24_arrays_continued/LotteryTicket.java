package day24_arrays_continued;

import java.util.Arrays;

public class LotteryTicket {

	public static void main(String[] args) {

		int[] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.parallelSort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));

		// Binary search works only with sorted arrays
		
		int index = Arrays.binarySearch(lotteryNumbers, 90); // Returns index of 90 and assigns it to "index"
		
		System.out.println("Position: " + index);
		
		
		index = Arrays.binarySearch(lotteryNumbers, 90); 
		
		System.out.println("Position: " + index);
		
	}

}
