package day32_methods4;

public class Cooking {

	public static void main(String[] args) {

		makePancake();
		makePasta();
		cook("Broccoli", "Broccoli, butter");
		
	}
	
	public static void cook(String dish, String ingredients) {
		
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ingredients);
		System.out.println("Cook until done");
		System.out.println("~~" + dish.toUpperCase() + " IS READY!~~");
		
	}
	
	public static void makePasta() {
		
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Cheese, Marinara");
		
	}
	
	public static void makePancake() {
		
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		
	}
	
	public static void add(String item) {
		
		System.out.println("Add " + item);
		
	}
	
	public static void mix(int seconds) {
		
		System.out.println("Mix for " + seconds + " seconds");
		
	}
	
	public static void fry(int minutes) {
		
		System.out.println("Fry for " + minutes + " minutes");
		
	}
	
	public static void boil(int minutes) {
		
		System.out.println("Boil for " + minutes + " minutes");
		
	}
	
}
