package day36_arraylists;

import java.util.*;

public class Shopping {

	public static void main(String[] args) {

		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("Eggs");
		shoppingList.add("Milk");
		shoppingList.add("Bread");
		shoppingList.add("Butter");
		shoppingList.add("OJ");
		shoppingList.add("Peanuts");
		
		int count = shoppingList.size();
		System.out.println("Total count: " + count);
		
		System.out.println(shoppingList); // How to print out an ArrayList
		
		System.out.println();
		
		System.out.println(shoppingList.get(0)); // Gets the first value of shoppingList and prints it out
		
		System.out.println(shoppingList.get(shoppingList.size()-1)); // Gets the last value of shoppingList and prints it out
		
		System.out.println();
		
		for(String item: shoppingList) { // Using a for-each loop to print each item one-by-one
			
			System.out.println(item);
			
		}
		
		System.out.println();
		
		shoppingList.clear(); // Clears the entire ArrayList
		
		System.out.println(shoppingList);

	}

}
