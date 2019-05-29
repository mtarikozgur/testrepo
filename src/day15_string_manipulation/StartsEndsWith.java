package day15_string_manipulation;

public class StartsEndsWith {

	public static void main(String[] args) {

		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("eclipse"));
		
		System.out.println(word1.startsWith("Ec"));

		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("lipse"));
		System.out.println(word1.endsWith("SE"));
		
		System.out.println(word1.toUpperCase().endsWith("E"));
		
		
		String word2 = "Mr. Jackson";
		
		if(word2.startsWith("Mr.")){
			System.out.println("Man");
		} else if(word2.startsWith("Mrs.")){
			System.out.println("Married woman");
		} else if(word2.startsWith("Ms.")){
			System.out.println("Single woman");
		} else if(word2.startsWith("Dr.")){
			System.out.println("Doctor");
		} else {
			System.out.println("Unknown");
		}



		
		

		
		
	}

}
