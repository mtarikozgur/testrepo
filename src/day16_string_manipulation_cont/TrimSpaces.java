package day16_string_manipulation_cont;

public class TrimSpaces {

	public static void main(String[] args) {

		String word1 = " String methods ";
		System.out.println(word1.trim()); // Removes all leftmost and rightmost spaces from the string
		
		String word2 = "                      More string methods                    .";
		System.out.println(word2.trim());
		
	}

}
