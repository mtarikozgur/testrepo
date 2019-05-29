package day23_arrays_and_loops;

import java.util.*;

public class CalculateSum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 1; i <= 6; i++) {
			
			System.out.println("Enter number " + i + ": ");
			int num = s.nextInt();
			
			if (num < 0) continue;
			
			sum = sum + num;
			
		}
		
		System.out.println(sum);
		
	}

}
