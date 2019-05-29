package day21_loops_review;

// Interview Question

import java.util.*;

public class UniqueCharacters {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String word = s.nextLine();
		String unique = "";
		
		for(int i = 0; i < word.length(); i++) {
			
			if(!unique.contains("" + word.charAt(i))) unique = unique + word.charAt(i);
			
		}
		
		System.out.println(unique);
		
		
	}

}
