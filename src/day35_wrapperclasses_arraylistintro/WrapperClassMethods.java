package day35_wrapperclasses_arraylistintro;

public class WrapperClassMethods {

	public static void main(String[] args) {

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		int count = Integer.parseInt("345353"); // Converts string to primitive, returns int primitive
		
		int count2 = Integer.valueOf("56565"); // Returns Integer object, then unboxes into count2 primitive
		
		System.out.println(Character.isAlphabetic('a')); // Returns true since 'a' is in the alphabet
		System.out.println(Character.isAlphabetic('1')); // Returns false since '1' is not in the alphabet
		
		String word = "ab123c5dfer1";
		for(int i = 0; i < word.length(); i++) {
			if(Character.isDigit( word.charAt(i) )) {
				System.out.print(word.charAt(i)); // Only prints out the char if it is a digit
			}
		}
		
	}

}
