package day20_for_loops;

import java.util.*;

public class Neighbors {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = s.next();
		
		for(int i = 1; i < word.length(); i++) {
			
			if(word.charAt(i) == word.charAt(i-1)) {
				System.out.println("Beeep - " + word.charAt(i));
			}
			
		}
		
	}

}
