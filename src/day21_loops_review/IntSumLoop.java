package day21_loops_review;

import java.util.*;

public class IntSumLoop {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num1, num2, sum;
		
		sum = 0;
		
		while (sum <= 100) {
			
			System.out.println("Enter value for number 1: ");
			num1 = s.nextInt();
			
			System.out.println("Enter value for number 2: ");
			num2 = s.nextInt();
			
			sum = num1 + num2;
			
			System.out.println("Sum is: " + sum);
			
		}
		
	}

}
