package day06_operators2;

public class CentsToDollars {

	public static void main(String[] args) {
		
		int cents;
		int dollar;
		int remainingCents;
		
		cents = 256;
		dollar = cents / 100;
		remainingCents = cents % 100;
		
		
		System.out.println("There are " + dollar + " dollar(s) and " + remainingCents + " cents in " + cents + " cents.");

	}

}
