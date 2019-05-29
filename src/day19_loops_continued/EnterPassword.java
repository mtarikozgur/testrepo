package day19_loops_continued;

import java.util.*;


public class EnterPassword {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String password = "abc123";
		String input;
		
		do {
			System.out.println("Enter password");
			input = s.next();
		} while(!input.contentEquals(password));
		
		
		
	}

}
