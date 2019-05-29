package day06_operators2;

import java.util.Scanner;

public class EnterNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Creates a new Scanner object and assigns it to variable scan
		
		// Scanner is a class, like a blueprint that contains useful code
		// In order to use that code we must create an object from that class
		
		// On line 7, Scanner is an object and scan is a variable that is holding an object of the Scanner class
		
		// When you create an object from a class you want to use it somewhere.
		
		System.out.println("Enter a number: ");
		int number = scan.nextInt(); // Sets the variable number equal to an integer input by the user
		
		System.out.println("You entered " + number);
		
		

	}

}
