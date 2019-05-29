package day34_methods6;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {

		printWords("red","blue");
		printWords("grey");
		printWords();
		
		System.out.println(sum(5,10,10));
		
		int budget = 200;
		
		if(sum(5,160,190, 40) > budget) System.out.println("Broke");
		else System.out.println("Within budget");
		
		cook("Pasta", "Noodles", "Cheese", "Sauce");
		shoppingList(200, "Bread", "Milk");

		String[] myPets = {"cat", "horse", "dog"}; // We can pass an array into a var args parameter
		myPets(myPets);
		
	}
	
	public static void printWords(String... words) { // Var Args can only be used as method parameters
		
		// The parameter "words" is treated like an array here
		
		for(String word: words) {
			
			System.out.println(word);
			
		}
		
	}
	
	public static int sum(int... nums) { // Because of var args this method can handle any number of parameters
		
		int sum = 0;
		
		for(int num: nums) {
			
			sum += num;
			
		}
		
		return sum;
		
	}
	
	public static void cook(String name, String... ings ) { // Var Args must be the last parameter in the method
		
	System.out.println("Food: " + name);
	System.out.println(Arrays.toString(ings));
		
	}
	
	public static void shoppingList(int totalPrice, String... items) { // There cannot be more than on var args in a method
		
		System.out.println("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
		
	}
	
	public static void myPets(String... pets) {
		
		for(String pet: pets) {
			
			System.out.println(pet);
			
		}
		
	}

}
