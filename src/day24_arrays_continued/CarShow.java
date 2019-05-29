package day24_arrays_continued;

import java.util.Arrays;

public class CarShow {

	public static void main(String[] args) {

		String[] cars = {"BMW", "Audi", "Mercury", "Tesla", "Ford"};
		
		for(String car: cars) {
			
			if(car.charAt(0) == 'M') System.out.println(car);
			
		}
		
		for(String car: cars) {
			
			if(car.contains("r")) System.out.println(car);
			
		}
		
	      System.out.println(Arrays.deepToString(cars)); // Assigns an array to a string, also prints it  
	      Arrays.parallelSort(cars); // Sorts in alphabetical order
	      System.out.println(Arrays.deepToString(cars)); 
		
	}

}
