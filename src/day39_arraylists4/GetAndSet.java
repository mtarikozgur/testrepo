package day39_arraylists4;

import java.util.*;

public class GetAndSet {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		cities.add("Lima");

		for (String city : cities) {

			System.out.print(city + " ");

		}
		System.out.println();

		for (int i = 0; i < cities.size(); i++) {

			System.out.print(cities.get(i) + " ");

		}

		System.out.println();

		System.out.println(cities.toString().toUpperCase()); // Converts ArrayList to string, then to uppercase, then
																// prints

		System.out.println();

		for (int i = 0; i < cities.size(); i++) {

			cities.set(i, cities.get(i).toUpperCase()); // Sets each city equal to its converted uppercase version
			System.out.print(cities.get(i) + " ");

		}

		System.out.println();

		System.out.println(Collections.max(cities)); // Prints city that comes last in alphabetical order
		System.out.println(Collections.min(cities)); // Prints city that comes first in alphabetical order
		
		String longestCity = "";
		String shortestCity = cities.get(0);
		
		for (String city : cities) {

			if(city.length() > longestCity.length()) longestCity = city;
			
			if(city.length() < shortestCity.length()) shortestCity = city;

		}
		
		System.out.println(longestCity);
		System.out.println(shortestCity);
		
		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		
		for (String city : cities) {

			if(city.length() > 6) citiesMoreThan6.add(city);

		}
		
		System.out.println(citiesMoreThan6);

	}

}
