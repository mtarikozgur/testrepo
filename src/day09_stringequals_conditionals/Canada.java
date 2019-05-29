package day09_stringequals_conditionals;

import java.util.*;

public class Canada {

	public static void main(String[] args) {

		System.out.println("What is the capital of Canada?");
		
		Scanner input = new Scanner(System.in);
		
		String answer = input.next();
		
		
		if(answer.equalsIgnoreCase("Ottowa")) { // Makes the comparison not case-sensitive
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		
		
		
	}

}
