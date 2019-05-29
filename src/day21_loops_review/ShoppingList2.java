package day21_loops_review;

import java.util.Scanner;

public class ShoppingList2 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		
		do {
		  
		  System.out.println("Enter Item" + count + " and its price:");
		  item = scan.next();
		  price = scan.nextDouble();
		  
		  shoppingListReport = shoppingListReport + "Item" + count + ": " +
		  item + " Price: " + price + ", ";
		  
		  totalPrice = totalPrice + price;
		  
		  System.out.println("Add one more item?");
		  countinue = scan.next();
		  
		  count++;
		  
		} while(countinue.equalsIgnoreCase("yes") && count <= 10);
		
		shoppingListReport = shoppingListReport.substring(0,shoppingListReport.length()-2);
		
		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalPrice);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
