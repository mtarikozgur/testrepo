package day23_arrays_and_loops;

import java.util.*;

class CheckNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		for(int i = 1; i <= 20; i++) {
			
			if(i == 15) break; // Will break out of the loop when i reaches 15
			
		}
		
		for(int i = 1; i <= 20; i++) {
			
			if(i >= 5 && i <= 10) continue; // Will jump to next loop iteration if i is between 5 and 10 inclusive
			
			System.out.println(i);
			
		}
		
	}

}
