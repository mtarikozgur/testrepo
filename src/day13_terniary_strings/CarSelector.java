package day13_terniary_strings;

import java.util.*;

public class CarSelector {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type of car?");
		System.out.println("1) American \n2) Japanese \n3) German \n4) Italian \n5) Korean");
		
		int carType = scan.nextInt();
		
		double averagePrice = 0.0;
		
		String carOptions = "";
		String carOrigin = "";
		
		switch(carType) {
		
		case 1:
			averagePrice = 33000.0;
			carOptions = "Ford, Dodge";
			carOrigin = "American";
			break;
		case 2:
			averagePrice = 32000.0;
			carOptions = "Toyota, Mitsubishi";
			carOrigin = "Japanese";
			break;
		case 3:
			averagePrice = 55000.0;
			carOptions = "BMW, Mazda";
			carOrigin = "German";
			break;
		case 4:
			averagePrice = 85000.0;
			carOptions = "Ferrari, Lamborgini";
			carOrigin = "Italian";
			break;
		case 5:
			averagePrice = 25000.0;
			carOptions = "Kia, Hyundai";
			carOrigin = "Korean";
			break;
		default:
			System.out.println("Car type not available");
			return; // Ends the main method
		}
		
		System.out.println("You selected " + carOrigin + " with options " + carOptions);
		System.out.println("Averag price: " + averagePrice);
		
		
		

	}

}
