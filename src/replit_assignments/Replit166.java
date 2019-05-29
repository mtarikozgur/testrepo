package replit_assignments;

import java.util.*;

public class Replit166 {

	public static void main(String[] args) {

		System.out.println(mergeStrings("selenium","java")); //jsaevlaenium

	}
	


	
	  public static String mergeStrings(String one, String two) {
	    
	    char[] arrayOne = one.toCharArray();
	    char[] arrayTwo = two.toCharArray();
	    
	   // char[] arrayOneCopy = Arrays.copyOf(arrayOne, arrayOne.length + 100);
	   // char[] arrayTwoCopy = Arrays.copyOf(arrayTwo, arrayTwo.length + 100);
	   
	    
	    String result = "";
	    
	    int timesToLoop = 0;
	    
	    if (arrayTwo.length < arrayOne.length) timesToLoop = arrayTwo.length;
	    else timesToLoop = arrayOne.length;
	    
	    for(int i = 0; i < timesToLoop; i++) {
	      
	      result = result + arrayOne[i];
	      result = result + arrayTwo[i];
	      
	    }
	    
	    //jsaevlaenium
	    
	    if(arrayTwo.length > arrayOne.length) {
	      
	      for(int i = (arrayOne.length); i < ((arrayTwo.length - arrayOne.length) + (arrayOne.length)); i++) {
	        
	        result = result + arrayTwo[i];
	        
	        System.out.println(i);
	        
	      }
	      
	    }
	    
	    if(arrayOne.length > arrayTwo.length) {
	      
	      for(int i = (arrayTwo.length); i < ((arrayOne.length - arrayTwo.length) + (arrayTwo.length)); i++) {
	        
	        result = result + arrayOne[i];
	        
	      }
	      
	    }
	    
	    return result;
	    
	  }
	}


