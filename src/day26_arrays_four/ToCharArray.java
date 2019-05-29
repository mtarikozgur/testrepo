package day26_arrays_four;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {

		String word = "java";
		
		char[] charsArray = word.toCharArray(); // Assigns each letter in String "word" as a char in the array "charsArray"
		
		for(char ch: charsArray) {
			
			System.out.println(ch);
			
		}
		
		String[] chars = new String[5];
		
		System.out.println(Arrays.toString(chars));
		
	}

}
