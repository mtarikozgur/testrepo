package day18_while_dowhileloops;

import java.util.*;

public class EnterPinCode {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int pin = 2983;
		int entry = 0;
		
		System.out.println("Enter pin code: ");
		entry = s.nextInt();
		
		while(entry != pin) {
			System.out.println("Incorrect, try again: ");
			entry = s.nextInt();
		}
		
		System.out.println("Code is correct, access granted.");
		

	}

}
