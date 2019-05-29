package replit_assignments;
import java.util.*;
public class Replit212 {

	public static void main(String[] args) {

		// Input:   str = "----qwe--r--tyf...gd.---" 
		// Output:  str = "----dgf--y--tre...wq.---" 
		
		// 				  "----dg.--f----r...wq.---"
		
		// $$$$$$:  str = "----$$$--$--$$$...$$.---"

		String word = "----qwe--r--tyf...gd.---";
		
		String result = "";
		int count = word.length() - 1;
		
		for(int i = 0; i < word.length(); i++) {
			
			if(!Character.isAlphabetic(word.charAt(i))) {
				
				result += word.charAt(i);
				
			} else {
				
				while(true) {
					
					if(Character.isAlphabetic(word.charAt(count))) {
						
						result += word.charAt(count);
						count--;
						break;
						
					} else {
						
						count--;
						
					}
					
				}
				
			}
	
		}
		
		System.out.println(result);
		
	}

}
