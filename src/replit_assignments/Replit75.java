package replit_assignments;

import java.util.*;

public class Replit75 {

	public static void main(String[] args) {
			// Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged. 

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    if(word.startsWith("x") || word.startsWith("X")) { 
	    	
	    	word = word.replaceFirst("x", "");
	    	word = word.replaceFirst("X", "");
	    	
	    }
	    
	    if(word.endsWith("x") || word.endsWith("X")) {
	    	
	    	word = word.substring(0,word.length()-1);
	    	
	    }
	    
	    System.out.println(word);
		
	}

}
