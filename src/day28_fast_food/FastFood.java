package day28_fast_food;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFood {

	public static void main(String[] args) throws IOException {

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]); // Use the readAllLines method to get data from a csv file as a list, and then
																										 // converts that list to a String array. new String[0] ensures that the data is
																										 // converted into the right type of array
		
		System.out.println("Data size: " + data.length);
		
		 
		
		for(String element: data) {
			
			// System.out.println(element);
			
		}
		
		
		
		 int count = 0;
		
		for(String element: data) {
			
			if (element.contains("VA")) {
				// System.out.println(element);
				count++;
			}
			
		}
		
		// System.out.println(count);
		
		for(String element: data) {
			
			String[] parts = element.split(",");
			System.out.print(parts[2] + " - ");
			System.out.println(parts[1]);
			
		}
		
	}

}
