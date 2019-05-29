package day11_logical_nestedif;

import java.util.*;

public class TollCalculator {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		boolean isRushHour = true;
		int carType;
		double price = 0.0;
		
		
		System.out.println("Enter car type: ");
		carType = keyboard.nextInt();
		
		System.out.println("Rush hour? Enter yes or no");
		String rushHour = keyboard.next();
		
		if(rushHour.equalsIgnoreCase("yes")) isRushHour = true;
		else if (rushHour.equalsIgnoreCase("no")) isRushHour = false;
		else System.out.println("Invalid input");
				
		
		if(carType == 1) {
			if(isRushHour) {
				price = 30.0;
			} else {
				price = 5.0;
			}
		} else if(carType == 2){
			if(isRushHour) {
				price = 55.30;
			} else {
				price = 15.99;
			}
		}
		
		System.out.println(price);
		
	}

}
