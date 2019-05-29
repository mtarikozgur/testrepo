package replit_assignments;

import java.util.*;

public class Replit138Alt {

	public static void main(String[] args) {


	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    int sum = 0;
	    int counter = 0;
	    boolean [] check = new boolean[inhabitants.length+2];
	    
	    System.out.println("Day "+ (counter++)+" "+Arrays.toString(inhabitants));
	    
	    do {
	      sum=0;
	    for(int i = 0; i < inhabitants.length; i++) {
	      if(inhabitants[i]==0) {
	        check[i]=true;
	        check[i+2]=true;
	      }
	    }
	    
	    for(int j = 1; j <check.length-1; j++) {
	      if(check[j]) {
	        inhabitants[j-1]=inhabitants[j-1]/2;
	      }
	      
	      sum+=inhabitants[j-1];
	    }
	     System.out.println("Day "+ (counter++)+" "+Arrays.toString(inhabitants));
	    }while(sum!=0);
	    
	    System.out.println("---- EXTINCT ----");
		
	}

}
