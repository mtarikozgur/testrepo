package day25_arrays_three;

public class Shopping {

	public static void main(String[] args) {

		String[] products = {"Shoes", "Shirt", "Watch", "Bag", "Socks"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int itemIds[] = {12345, 12346, 12347, 12348, 12349};
		
		// Print count of products
		
		System.out.println("Product count: " + products.length);
		
		// Check if the three arrays have the same length
		
		if(products.length == prices.length && prices.length == itemIds.length) {
			
			System.out.println("Good list");
			
		} else {
			
			System.out.println("Bad list");
			return;
			
		}
		
		for(String product: products) {
			
			System.out.println(product);
			
		}
		
		for(double price: prices) {
			
			System.out.println(price);
			
		} 
		
		for(int itemId: itemIds) {
			
			System.out.println(itemId);
			
		}
		
		System.out.println();
		
		for(int i = itemIds.length-1; i >= 0; i--) {
			
			System.out.println(itemIds[i]);
			
		}
		
		System.out.println();
		
		double totalPrice = 0;
		double max = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < prices.length; i++) {
			
			System.out.println("Item " + (i+1) + ": " + itemIds[i] + " - " + products[i] + " - " + prices[i]);
			
			totalPrice = totalPrice + prices[i];
			
		}
		
		System.out.println(totalPrice);
		
		for(int i = 0; i < prices.length-1; i++) {
			
			if(i == 0) {
				
				max = prices[i];
				
			}
			
			if (prices[i] < prices[i+1]) {
				
				max = prices[i+1];
				maxIndex = i+1;
				
			}
			
		}
		
		System.out.println("Item that costs most is " + products[maxIndex]);
		
		
	}

}
