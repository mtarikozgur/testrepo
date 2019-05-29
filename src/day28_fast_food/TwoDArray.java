package day28_fast_food;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] nums = {{100,500,1234,5434},{54544,85,167,994},{954,353,77,2}};
		
		System.out.print(Arrays.deepToString(nums));
		
		int[][] values = new int[4][]; // Creates new 2D array "values" with four empty arrays inside
		
		values[0] = new int[] {32,23,5};
		values[1] = new int[] {32,23,5,4,7,3,8,44,7,2,66};
		values[2] = new int[2];
		values[2][0] = 55;
		values[2][1] = 88;
		
		

		
	}

}
