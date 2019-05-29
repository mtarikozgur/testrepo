package day14_string_methods;

import java.util.*;

public class Words {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word1 = scan.next();
		String word2 = scan.next();
		
		if(word1.length() > word2.length()) {
			System.out.println(word1 + " is longer");
		} else if(word1.length() < word2.length()) {
			System.out.println(word2 + " is longer");
		} else {
			System.out.println(word1 + " and " + word2 + " are the same length");
		}
	}

}
