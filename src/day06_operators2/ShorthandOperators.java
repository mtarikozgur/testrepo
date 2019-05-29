package day06_operators2;

public class ShorthandOperators {

	public static void main(String[] args) {
		
		// Long way
		
		int students = 100;
		System.out.println(students);
		
		students = students + 5;
		System.out.println(students);
		
		
		students = 100;
		students = students - 2;
		System.out.println(students);
		
		// Short way

		students = 100;
		students += 5;
		System.out.println(students);
		
		students = 100;
		students -= 2;
		System.out.println(students);
		
		students = 100;
		students *= 2;
		System.out.println(students);
		
		students = 100;
		students /= 25;
		System.out.println(students);
		
		double price = 45.50;
		int amount = 5;
		
		price += amount;
		System.out.println(price);
		
		int pennies = 550;
		pennies %= 100;
		System.out.println("Pennies left: " + pennies);
		
		
		
		

	}

}
