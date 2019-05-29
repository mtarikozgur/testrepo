package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Creates new Scanner object, assigns it to variable "input"
		
		System.out.println("Hi, what is your name? ");
		
		String name = input.next(); // Accepts a String input
		
		System.out.println("Nice to meet you, " + name);

	}

}
