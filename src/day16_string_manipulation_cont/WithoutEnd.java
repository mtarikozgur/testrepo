package day16_string_manipulation_cont;

public class WithoutEnd {

	public static void main(String[] args) {

		// Write a method that removes the first and last char in a string
		
		String str = "jafqfqfqfrwrra";
		str = str.substring(1, str.length()-1);
		
		System.out.println(str);
		
	}

}
