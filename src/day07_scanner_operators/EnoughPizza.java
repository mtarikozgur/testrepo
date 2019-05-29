package day07_scanner_operators;

public class EnoughPizza {

	public static void main(String[] args) {

		int pizzaSlices = 8;
		int slicesPerStudent = 2;
		int pizzas = 30;
		int students = 145;
		
		int totalSlices = pizzaSlices * pizzas;
		int slicesNeeded = slicesPerStudent * students;
		
		boolean enoughPizza = totalSlices >= slicesNeeded;
		
		System.out.println(enoughPizza);

	}

}
