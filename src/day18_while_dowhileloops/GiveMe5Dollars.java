package day18_while_dowhileloops;

import java.util.*;

public class GiveMe5Dollars {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int dollars = 0;
		
		System.out.println("Give me 5 dollars: ");
		dollars = s.nextInt();
		
		while(dollars != 5) {
			System.out.println("This is not 5 dollars, give me 5 dollars: ");
			dollars = s.nextInt();
		}
		
		System.out.println("Thanks for the 5 dollars");
		
	}

}
