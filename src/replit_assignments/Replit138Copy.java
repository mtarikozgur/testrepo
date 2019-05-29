package replit_assignments;

import java.util.Scanner;

public class Replit138Copy {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();

		}
	
		// Declare a variable to keep track of the day
		
		// Display the default values of the cities and day number
		
		// Increment the day by 1
		
		// Create a duplicate array so we can update the values in the for loop correctly
		
		// We need a loop that will run as many times as needed
		
		// The first thing we do in the loop is to check if any survivors are left
		
		// If there are no survivors left, break out of the loop
		
		// Next we check if the first and last cities need to be cut in half
		
		// Assign a temporary variable to hold the value of the first city
		
		// Assign a temporary variable to hold the value of the last city
		
		// Check if the second city is zero, and if so cut the temporary variable for the first city in half
		
		// Check if the second to last city is zero, and if so cut the temporary variable for the last city in half
		
		// The following must be a 2-step process: 1) modify the temporary array 2) set the inhabitants array equal to the temporary array
		// This process will ensure that each city will be compared with the proper version of the city that came before it
		
		// Loop from the 2nd to the 2nd-last cities in the inhabitants array and cut its corresponding value in the temporary array in half if it is next to a 0 
		// We need to exclude the first and last cities in this loop so we can check adjacent cities without going out of bounds
		
		// Set the values in the inhabitants array to be equal to the temporary array we modified in the last step
		
		// Assign the first and last cities as equal to their corresponding temporary variables
		// This must be done so that the previous for-loop can check the proper version of the first and last cities
		
		// Display the cities and day number
		
		// Increment the day
		
		// Print out "---- EXTINCT ----" after the loop has finished running 
		
	}

}
