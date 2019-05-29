package day36_arraylists;

import java.util.*;

public class MyCities {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("New York");
		cities.add("Moscow");
		cities.add("London");
		cities.add("Arlington");
		cities.add("Brisbane");
		
		for(String city: cities) { // Prints each city on the same line separated by spaces with a for-each loop
			
			System.out.print(city + " ");
			
		}
		
		System.out.println();
		
		for(int i = 0; i < cities.size(); i++) { // Prints each city on the same line separated by spaces with a for loop
			
			System.out.print(cities.get(i) + " ");
			
		}

		System.out.println();
		
		System.out.println("Is list empty? " + cities.isEmpty());
		
		System.out.println();
		
		cities.set(2, "Seoul"); // Replaces the element at index 2 with "Seoul"
		
		System.out.println(cities);
		
		// What if you want to replace a certain string but you don't know its index? Use indexOf()
		
		cities.set((cities.indexOf("Moscow")), "Sterling");
		
		System.out.println(cities);
		
	}

}
