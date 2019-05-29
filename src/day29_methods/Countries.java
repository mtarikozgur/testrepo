package day29_methods;

import java.util.*;

public class Countries {

	public static void main(String[] args) {

		String[][] countries = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstann", "Nursultan" }

		};

		System.out.println(Arrays.deepToString(countries));

		System.out.println();

		System.out.println(countries[0][0] + "|" + countries[0][1]);

		System.out.println();

		for (int i = 0; i < countries.length; i++) {

			System.out.print(countries[i][0] + "|");

		}

		String[] cities = new String[countries.length];

		for (int i = 0; i < countries.length; i++) {

			cities[i] = countries[i][1];

		}

		System.out.println();
		
		System.out.println();
		
		System.out.println(Arrays.toString(cities));
		
		System.out.println();
		
		for(int row = 0; row < countries.length; row++) {
			
			if(countries[row][0].equals("Bolivia")) {
				
				System.out.println("Has Bolivia");
				
			} else {
				
				System.out.println("Does not have Bolivia");
				
			}
			
		}

	}

}
