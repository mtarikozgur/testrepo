package day21_loops_review;

import java.util.*;

public class ShoppingListK {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "Yes";
		double price = 0;
		int count = 1;
		double totalProce = 0;
		do {	System.out.println("Enter Item"+count+" and its price:");
			item = scan.next();
			price = scan.nextDouble();
			
			shoppingListReport = shoppingListReport + "Item" + count + ": " + item + " Price: " + price + ", ";
			
			totalProce = totalProce + price;
			
			count+=1;
			
			
		    System.out.println("Add one more item?");
			countinue = scan.next();
			
			
		} while (count<10 && countinue.contentEquals("yes")); 			  
		     
		  
		shoppingListReport = shoppingListReport.substring(0,shoppingListReport.length()-2);
		
		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalProce);
		
		/*  
		shoppingListReport ="Item"+count+": "+item+" Price: "+price+", Item"+count+": "+item+" Price: "+price;
		totalProce =totalProce+price;
		System.out.println(shoppingListReport );
		System.out.println("Total price: " + totalProce);  */

		
		}
		
		
	}


