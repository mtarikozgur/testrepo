package replit_assignments;

import java.util.*;

public class Replit130 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    float[] score = new float[7];
	    //WRITE YOUR CODE HERE
	    int num = 0;
	    float total = 0;
	    
	    for(int i = 0; i < score.length; i++) {
	      num++;
	      System.out.println("Enter score for judge "+num+":");
	      score[i] = input.nextFloat();
	      total += score[i];
	    }
	    
	    Arrays.sort(score);
	    
	    int smallest = Math.round(score[0]);
	    int largest = Math.round(score[score.length-1]);
	    
	    total = total - (smallest+largest);
	    
	    System.out.println("Enter difficulty:");
	    float difficulty = input.nextFloat();
	    
	    total = total * difficulty;
	    
	    // FINAL OUTPUT
	   System.out.println("Total: "+total);
		
	}

}
