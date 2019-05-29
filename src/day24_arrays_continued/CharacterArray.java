package day24_arrays_continued;

public class CharacterArray {

	public static void main(String[] args) {


		String str = "Wooden Spoon";
		
		char[] chars = str.toCharArray();
		
		
		for(char c: chars) {
			
			if(c == 'o') System.out.print("*");
			else System.out.print(c);
			
		}

	}

}
