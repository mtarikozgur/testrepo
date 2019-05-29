package day16_string_manipulation_cont;

public class ReplaceThem {

	public static void main(String[] args) {

		String sentence = "Coding is fun, it is my hobby!!";
		String noSpaces = sentence.replace(" ","");
		
		
		System.out.println(sentence);
		System.out.println(noSpaces);
		
		sentence = sentence.replace(",", "!!!");
		
		System.out.println(sentence);
		
		String mixed = "&#$#$&jla-v4a$!#&*@";
		mixed = mixed.replace("&#$#$&", "");
		
		System.out.println(mixed);
		
		mixed = mixed.replace("$!#&*@", "");
		
		System.out.println(mixed);
		
		mixed = mixed.replace("l", "").replace("-", "").replace("4", "");
		
		System.out.println(mixed);

		
		String result = "About 115,000,000 results (0.59 seconds)";
		
		// result = result.replace("About ", "").replace(" results (0.59 seconds)", "");
		
		 result = result.replace("About ", "");
		 
		 result = result.substring(0,result.indexOf(" ")); // Gets 115,000,000 as a substring, stopping at the character " "
		
		System.out.println(result);
		
		System.out.println(result.replaceFirst(",", ""));
		
		
	}

}
