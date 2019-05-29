package day23_arrays_and_loops;

import java.util.*;

public class ConcatSixWords {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String result = "";
		
		for(int i = 1; i <= 6; i++) {
			
			System.out.println("Enter word " + i + ": ");
			String word = s.next();
			
			if (word.contentEquals("java")) continue;
			
			result = result + word;
			
		}
		
		System.out.println(result);
		
		
	}

}
