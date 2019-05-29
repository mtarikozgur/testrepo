package day20_for_loops;

import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter your number from 1-10: ");
		n = s.nextInt();
		
		if(n <= 0 || n > 10) {
			System.out.println("Invalid");
		} else {
			
			for(int i = 1; i <=10; i++) {
				
				System.out.println(n + " * " + i + " = " + (n*i));
				
			}
			
		}
		

	}

}
