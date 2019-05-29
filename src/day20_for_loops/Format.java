package day20_for_loops;

import java.util.*;

public class Format {

	public static void main(String[] args) {

		// User inputs three word on one line, output is those three words with two spaces per word, no spaces elsewhere
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine().trim();
		
		
		
		for(int i = 0; i < str.length(); i++) {
		str = str.replace("  "," ");
		}
		
		str = str.replace(" ","  ");

		System.out.println(str);
		
	}

}
