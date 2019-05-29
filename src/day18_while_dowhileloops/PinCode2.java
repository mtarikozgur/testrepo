package day18_while_dowhileloops;

import java.util.Scanner;

public class PinCode2 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		int pin = 2983;
		int entry = 0;
		int count = 3;
		
		System.out.println("Enter pin code: ");
		entry = s.nextInt();
		
		while(entry != pin && count > 0) {
			System.out.println("Incorrect, " + count + " tries remaining: ");
			entry = s.nextInt();
			count--;
		}
		
		
		if(entry == pin) System.out.println("Code is correct, access granted.");
		else System.out.println("Card is blocked, too many failed attempts.");
		
		
	}

}
