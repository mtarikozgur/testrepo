package day24_arrays_continued;

public class WoodenSpoon {

	public static void main(String[] args) {

		char[] values = {'a','b','c'};
		String str = "Wooden Spoon";
		
		char[] chars = str.toCharArray(); // Converts this string into an array of chars
		
		for(char c: chars) { // For every char "c" in "chars"
			
			System.out.print(c);
			
		} // For each loops like these always go from beginning to end
		
		System.out.println();
		
		for(int i = chars.length - 1; i >= 0; i--) { // Prints array "chars" in reverse order
			
			System.out.print(chars[i]);
			
		}
		
		System.out.println();
		
		str = "";
		
		for(int i = chars.length - 1; i >= 0; i--) { // Builds string "str" with the contents of "chars" array in reverse order
			
			str += chars[i];
			
		}
		
		System.out.println(str);
		
	}

}
