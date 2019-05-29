package day22_loops_more_review;

import java.util.*;

public class ValidMonths {

	
	
	public static void main(String[] args) {

		int month;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter month: ");
			month = s.nextInt();
			
			if(month < 1 || month > 12) {
				
				System.out.println("Invalid month");
				break;
				
			}
			
		} 
		
		/* do {
			
			System.out.println("Enter month: ");
			month = s.nextInt();
			
		} while(month > 0 && month < 13);
		
		System.out.println("Invalid month"); */
		
		
		
	}

}
