package day08_casting_conditionals;

import java.util.*;

public class Patient {

	public static void main(String[] args) {

		   int itemPrice, itemDifference;
		   int quarters, dimes, nickels;
		   Scanner input = new Scanner(System.in);
		   
		   System.out.println("Enter price in cents:");
		   itemPrice = input.nextInt();
		   
		   if(itemPrice < 25 || itemPrice > 100 || (itemPrice % 5 != 0)){
		     System.out.println("Invalid price!");
		   } else {
		     
		   itemDifference =  100 - itemPrice;
		   
		   quarters = itemDifference / 25;
		   itemDifference = itemDifference % 25;
		   
		   dimes = itemDifference / 10;
		   itemDifference = itemDifference % 10;
		   
		   nickels = itemDifference / 5;
		   
		   System.out.println("Your change is " + quarters + " quarters, "
		   + dimes + " dimes, and " + nickels + " nickels.");
		   
		   }
		    

	}

}
