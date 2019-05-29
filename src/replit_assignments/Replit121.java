package replit_assignments;

import java.util.*;

public class Replit121 {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		    String[] words = str.split(", ");
		    
		    int minLength = 100000;
		      
		    for(int i = 0; i < words.length; i++) {
		        
		        if(words[i].length() < minLength) {
		          
		          minLength = words[i].length();
		          
		        }
		        
		    }
		      
		    int count = 0; 
		      
		    for(String word: words) {
		        
		        if(word.length() == minLength) count++;
		        
		    }
		      
		    String[] newWords = new String[count];
		    
		    count = 0;
		      
		    for(int i = 0; i < words.length; i++) {
		      
		      if(words[i].length() == minLength) {
		        
		        newWords[count] = words[i];
		        count++;
		        
		      }
		      
		    }
		    
		    Arrays.sort(newWords);
		    
		    System.out.println(Arrays.toString(newWords));
		    
		
	}

}
