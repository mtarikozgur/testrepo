package replit_assignments;

import java.util.*;

public class Replit138 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();

		}
		
		// TODO. Write you code below this line.
		int day = 0; // Declare a variable to keep track of the day

		System.out.println("Day " + day + " " + Arrays.toString(inhabitants)); // Print out the first report
		day = 1; // Increment the day by 1
		
		int[] temp = Arrays.copyOf(inhabitants, inhabitants.length); // Create a duplicate array so we can update values in the for loop correctly
		
		while (true) { // We need a loop that will run as many times as needed

			// The first thing we do in the loop is to check if any survivors are left
			
			int numOfPeopleAlive = 0;

			for (int i = 0; i < inhabitants.length; i++) {

				numOfPeopleAlive = numOfPeopleAlive + inhabitants[i];

			}
			
			if(numOfPeopleAlive == 0) break; // If there are no survivors left, break out of the loop
			
			// Next we check if the first and last cities need to be cut in half
			
			int tempFirst = inhabitants[0]; // Assign a temporary variable to hold the value of the first city
			int tempLast = inhabitants[inhabitants.length-1]; // Assign a temporary variable to hold the value of the last city
			
			if(inhabitants[1] == 0) { // Checks if the second city is zero, and if so cuts the temporary variable for the first city in half
				
				tempFirst = tempFirst/2;
				
			}
			
			if(inhabitants[inhabitants.length-2] == 0) { // Checks if the second to last city is zero, and if so cuts the temporary variable for the last city in half
				
				tempLast = tempLast/2;
				
			}
			
			// The following is a 2-step process: modify the temporary array, then set the inhabitants array equal to the temporary array
			
			// This process ensures that city will be compared with the proper version of the city that came before it
			
			for (int j = 1; j < inhabitants.length-1; j++) { // Now we loop from the 2nd to the 2nd-last cities in the inhabitants array and cut its corresponding value 
															 // in the temporary array in half if it is next to a 0 
				
				if(inhabitants[j-1] == 0 || inhabitants[j+1] == 0) {
					
					temp[j] = inhabitants[j]/2;
					
				}

			} // We need to exclude the first and last cities in this loop so we can check adjacent cities without going out of bounds
			
			for (int j = 1; j < inhabitants.length-1; j++) { // Sets the values in the inhabitants array to be equal to the temporary array we modified in the last step
				
				inhabitants[j] = temp[j];
				
			}
			
			inhabitants[0] = tempFirst; // We assign the first and last cities as equal to their corresponding temporary variables
			inhabitants[inhabitants.length-1] = tempLast; // This is done so that the previous for-loop can check the proper version of the first and last cities
			
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants)); // Displays the cities and day number

			day++; // Increments the day

		}
		
		 System.out.println("---- EXTINCT ----"); 

	}

}
