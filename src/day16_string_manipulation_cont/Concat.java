package day16_string_manipulation_cont;

public class Concat {

	public static void main(String[] args) {

		String word = "java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		// The .concat method will only accept strings
		
		String word2 = "Hi";
		word2 = word2.concat("-hey").concat("-how are you");
		
		System.out.println(word2);
		
	}

}
