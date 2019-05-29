package day52_finalkeyword;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {

		final int[] TEAMS = {11, 11};
		System.out.println("Team1: " + TEAMS[0]);
		System.out.println("Team2: " + TEAMS[1]);

		int[] nums = new int[] {23, 55, 35543};
		System.out.println(Arrays.toString(nums));
		
		final int[] finalNums = {23, 66, 44, 11};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 34567;
		System.out.println(Arrays.toString(finalNums));
		
		// finalNums = new int[] {22, 44, 56, 2244, 242}; does not work due to "final" keyword
		
		
		

	}

}
