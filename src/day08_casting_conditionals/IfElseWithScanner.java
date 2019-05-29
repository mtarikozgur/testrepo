package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your score percentage: ");
		
		int passingPercentage = 65;
		int yourScorePercentage = scan.nextInt();
		
		if(yourScorePercentage >= passingPercentage) {
			System.out.println("You passed!");
		} else {
			System.out.println("Better luck next time.");
		}
		
	}

}
