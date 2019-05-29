package day22_loops_more_review;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    int result = 1;
		    
		    for(int i = 1; i <= n; i++){
		      
		      result = result*i;
		      System.out.println(result);
		      
		    }
		    
		   // System.out.println(result);
		
	}

}
