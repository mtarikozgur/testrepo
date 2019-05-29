package day09_stringequals_conditionals;

public class StringEquals {

	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == "java");
		System.out.println(str1 == "Java");
		

		System.out.println(str1.contentEquals(str2)); // Using the equals method to test if str1 is equal to str2
		System.out.println(str1.contentEquals("java"));
		
		
		String month = new String("March");
		String month2 = new String("March");
		
		System.out.println(month == month2); // Returns false because the characters are not being tested, but rather if the strings are 
											 // pointing to the same memory location
		
		System.out.println(month.contentEquals(month2));
		
		
		
	}

}
