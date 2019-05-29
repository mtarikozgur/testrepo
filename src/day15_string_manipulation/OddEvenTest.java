package day15_string_manipulation;

import java.util.*;

public class OddEvenTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    int wordLength = word.length();
		    
		    if(wordLength % 2 != 0) { 
		    	if (wordLength >= 3) {
		    		char middleOne = word.charAt( word.length()/2);
		    		System.out.println(middleOne);		
		    	} else if(wordLength % 2 != 0) {
		    		if(wordLength == 1) {
		    			System.out.println(word.charAt(0)+""+word.charAt(0)+""+word.charAt(0));
		    		}
		    	}
		    }
		    
		    if (wordLength % 2 == 0 && wordLength >= 4) {
		    	char middleTwo = word.charAt(word.length()/2);
		    	char middleTwoL = word.charAt(word.length()/2-1);
		    	System.out.println(middleTwo+""+middleTwoL);
		    }else if (wordLength == 2) {
		    		System.out.println(word.charAt(0)+""+word.charAt(1));
		    		
		    	} 
		    
		
	}

}


