package day14_string_methods;

public class CharAt {

	public static void main(String[] args) {
		
		String word = "Computer";
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));

		String word2 = "Java";
		
		if(word2.charAt(0) == 'J') {
			System.out.println("First char is J");
		}
		
		String word3 = "Apple";
		
		if(word3.charAt(0) == word3.charAt(4)) System.out.println("First and last match");
		else System.out.println("First and last do not match");
		
		String word4 = "abcdefg12423141";
		
		char lastChar = word4.charAt(word.length() - 1); // This gets the last char in a string, regardless of its length

	}

}
