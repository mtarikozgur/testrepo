package day16_string_manipulation_cont;

public class Replace {

	public static void main(String[] args) {

		String words = "Eclipse is sad today, because we wrote many sad examples";
		
		System.out.println(words);
		System.out.println(words.replace("a", "y"));
		System.out.println(words.replace("sad", "happy"));
		System.out.println(words.replace(" ", "|"));
		
		System.out.println(words); // Replace does not actually change the value of "words"
		
		String newWords = words.replace("a", "aa");
		System.out.println(newWords);

		
	}

}
