package replit_assignments;
import java.util.*;
public class Replit195 {

	public static void main(String[] args) {
	 
		String word1 = "aaabaa";
		String word2 = "aaaabaa";
		
    word1 = word1.replace(" ","");
    word2 = word2.replace(" ","");
    
  //  System.out.println(word1);
  //  System.out.println(word2);
    
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();
    
    System.out.println(word1);
    System.out.println(word2);
    
    char[] letters1 = word1.toCharArray();
    char[] letters2 = word2.toCharArray();
    
  //  System.out.println(Arrays.toString(letters1));
  //  System.out.println(Arrays.toString(letters2));
    
    Arrays.sort(letters1);
    Arrays.sort(letters2);
    
    System.out.println(Arrays.toString(letters1));
    System.out.println(Arrays.toString(letters2));
    

	}
}
