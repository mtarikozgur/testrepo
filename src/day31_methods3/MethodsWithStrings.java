package day31_methods3;

import java.util.*;

public class MethodsWithStrings {

	public static void main(String[] args) {

		countWords("This is a sentence");
		
	}
	
	public static void countWords(String sentence) {

		String[] words = sentence.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		System.out.println("Number of words: " + words.length);
		
	}

}
