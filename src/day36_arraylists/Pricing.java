package day36_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pricing {

	public static void main(String[] args) {

		List<Double> prices = Arrays.asList(4.46, 2.35, 50.21, 771.66, 8.78, 900.35, 10.66, 4.78, 657.00, 7.99);

		System.out.println(prices);

		double sum = 0;

		for (double price : prices) { // We can use the primitive "double" here because of unboxing, where Double is
										// converted to double automatically

			sum += price;

		}

		System.out.println("Sum: " + sum);

		System.out.println();

		double sum2 = 0;

		for (int i = 0; i < prices.size(); i++) {

			sum2 += prices.get(i);

		}

		System.out.println("Sum2: " + sum);

		System.out.println();

		List<Double> expensive = new ArrayList<>();
		
		for (double price : prices) {

			if(price > 100) expensive.add(price);

		}

		System.out.println(expensive);
		
		System.out.println();
		
		prices.removeAll(expensive); // Go to prices List, and remove all values in expensive from prices
		
		System.out.println("prices" + prices);

	}

}
