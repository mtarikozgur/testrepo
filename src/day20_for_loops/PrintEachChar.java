package day20_for_loops;

public class PrintEachChar {

	public static void main(String[] args) {

		String word = "Wooden spoon";
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		System.out.println();
		
		for (int i = 0; i < 12; i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') System.out.print(word.charAt(i));
		}
		
		System.out.println();
		
		for (int i = 0; i < 12; i++) {
			if(!(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')) System.out.print(word.charAt(i));
		}
		
	}

}
