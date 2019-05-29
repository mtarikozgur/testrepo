package replit_assignments;

import java.util.*;

public class Replit122 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();

		}

		// TODO. Write you code below this line.
		int day = 0;

		System.out.println("Day " + day + Arrays.toString(inhabitants));
		day = 1;
		while (true) {

			int numOfPeopleAlive = 0;

			for (int i = 0; i < inhabitants.length; i++) {

				numOfPeopleAlive = numOfPeopleAlive + inhabitants[i];

			}
			
			if(numOfPeopleAlive == 0) break;

			for (int j = 0; j < inhabitants.length; j++) {

				inhabitants[j] = inhabitants[j] / 2;

			}

			System.out.println("Day " + day + "" + Arrays.toString(inhabitants));

			day++;

		}
		
		 System.out.println("---- EXTINCT ----");

	}

}
