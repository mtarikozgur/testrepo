package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("What's your age?");
		
		int votingAge = 18;
		int yourAge = input.nextInt();
		
		if(yourAge >= votingAge) {
			System.out.println("You can vote.");
			System.out.println("You have been eligible for " + (yourAge - votingAge) + " years now.");
		} else {
			System.out.println("You cannot vote.");
			System.out.println("You must wait " + (votingAge - yourAge) + " years to vote");
		}
		
		
	}

}
