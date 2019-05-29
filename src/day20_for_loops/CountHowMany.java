package day20_for_loops;

public class CountHowMany {

	public static void main(String[] args) {

		String word = "computer programming";
		char myChar = 'c';
		int count = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == myChar) count++;
		}
		
		System.out.println("Number of " + myChar + ": " + count);
		
		
		
	}

}
