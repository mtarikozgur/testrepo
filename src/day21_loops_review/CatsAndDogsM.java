package day21_loops_review;

import java.util.*;

public class CatsAndDogsM {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    
		String catList = "cat";
		String dogList = "dog";

		
	    System.out.println("Enter a word");
	    String word = scan.next();
	  
	    for(int i=0; i < word.length()-2; i++) {
	    	String list = (""+word.charAt(i)) +(""+word.charAt(i+1)) + (""+ word.charAt(i+2));
	    	//System.out.println(list + i);    	
	    	if(list.equalsIgnoreCase("cat")) {
	    		countOfCats += 1;
	    	}else if(list.equalsIgnoreCase("dog")){
	    		countOfDogs +=1;
	    	}
	    	   	
	    	
	    }System.out.println(countOfCats == countOfDogs);
	    
		
	}

}
