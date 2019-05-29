package day10_logicaloperators_conditionals;

import java.util.*;

public class CreditScoreRating {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your credit score:");
		
		int score = 800;
		
		if(score >= 750 && score <=800) {
			System.out.println("Excellent");
		} else if(score >=700 && score <=750) {
			System.out.println("Good");
		} else {
			System.out.println("Poor");
		}
			
		
	}

}
