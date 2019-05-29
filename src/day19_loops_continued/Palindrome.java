package day19_loops_continued;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String word = s.next();
		String reverse = "";
		
		int i = word.length()-1;
		
		while(i >= 0) {
			reverse = reverse + word.charAt(i);
			i--;
		}
		
		System.out.println(reverse);
		
		if (word.equalsIgnoreCase(reverse)) System.out.println("It is a palindrome");
		else System.out.println("It is not a palindrome");
		
	}

}
