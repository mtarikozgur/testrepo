package day34_methods6;

import java.util.*;

public class RandomArray {

	public static void main(String[] args) {

		int[] randomArray = getRandomArray(10);
		
		System.out.println(Arrays.toString(randomArray));

	}
	
	public static int[] getRandomArray(int size) {
		
		int[] randomNums = new int[size];
		
		Random r = new Random();
		
		for(int i = 0; i < size; i++) {
			
			randomNums[i] = r.nextInt(101);
			
		}
		
		
		return randomNums;
		
	}

}
