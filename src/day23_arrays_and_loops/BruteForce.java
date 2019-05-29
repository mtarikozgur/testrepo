package day23_arrays_and_loops;

import java.util.*;

public class BruteForce {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String expectedUsername = "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		
		int attempts = 5;
		
		do {
			
			if(attempts-- == 0) {
				System.out.println("Out of tries"); 
				break;
			}
			
			if(!username.contentEquals(expectedUsername)) { 
				System.out.println("Wrong username"); 
				continue;
			}
			
			if(!password.contentEquals(expectedPassword)) { 
				System.out.println("Wrong password"); 
				continue;
			}	
			
		} while(!username.contentEquals(expectedUsername) || !password.contentEquals(expectedPassword));
		
				
				
	}

}
