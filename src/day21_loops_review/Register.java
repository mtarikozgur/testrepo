package day21_loops_review;

import java.util.*;

public class Register {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int itemCount;
		double price, totalPrice;
		String item, itemList;
		
		itemList = "";
		totalPrice = 0;
		
		System.out.println("How many items are you buying? ");
		itemCount = s.nextInt();
		
		for(int i = 0; i < itemCount; i++) {
			
			System.out.println("What is item number " + (i+1) + "?");
			item = s.next();
			
			itemList = itemList + item + ", ";
			
			System.out.println("What is the price of your " + item + "?");
			price = s.nextDouble();
			
			totalPrice = totalPrice + price;
			
		}
		
		itemList = itemList.substring(0,itemList.length()-2);
		
		System.out.println("List of items: " + itemList);
		System.out.println("Total price: " + totalPrice);

		
	}

}
