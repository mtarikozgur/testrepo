package day19_loops_continued;

import java.util.*;


public class GuessANumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int secret = r.nextInt(101);
		int guess = 0;
		int guessCount = 0;
		
		do {
			System.out.println("Enter a guess: ");
			guess = s.nextInt();
			
			if(guess > secret) {
				System.out.println("Too large");
				guessCount++;
			} else if(guess < secret) {
				System.out.println("Too small");
				guessCount++;
			} else {
				guessCount++;
				System.out.println("Correct! You took " + guessCount + " guesses.");
			}
		} while(guess != secret && guessCount < 5);
		
		if(guess != secret) System.out.println("Correct answer was " + secret);
		
	}

}
