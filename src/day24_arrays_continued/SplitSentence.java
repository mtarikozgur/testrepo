package day24_arrays_continued;

public class SplitSentence {

	public static void main(String[] args) {

		
		
		String sentence = "This is a long sentence that can be broken up and stored in an array.";
		
		String[] words = sentence.split(" "); // Splits up the string "sentence" around spaces into smaller strings and stores them in array "words"
		
		for(String str: words) {
			
			System.out.println(str);
			
		}
		
		// How can we find the first appearance of a word in a string?
		
		int counter = 0;
		
		for(String str: words) {
			
			if(str.contentEquals("sentence")) break;
			
			counter++;
			
		}
		
		System.out.println();
		System.out.println("Index: " + counter);
		System.out.println(words[counter]);

		
		
	}

}
