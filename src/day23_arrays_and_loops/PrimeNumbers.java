package day23_arrays_and_loops;

import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		boolean isPrime = true;
		int num = s.nextInt();
		
		for(int i = 2; i < num; i++) {
			
			System.out.print("Factor " + i + ": ");
			System.out.println(num % i);
			
			if(num % i == 0) isPrime = false;
			
		}
		
		System.out.println(isPrime);
		
	}

}
