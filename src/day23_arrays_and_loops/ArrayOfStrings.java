package day23_arrays_and_loops;

public class ArrayOfStrings {

	public static void main(String[] args) {

		String[] words = new String [5]; // Creates empty array with 5 slots in memory
		String[] words2 = {"Apples", "Pears", "Oranges"}; // Creates array with 3 slots with these corresponding strings
		String[] words3 = {}; // Creates empty array with 0 slots in memory
		String[] words4 = new String[] {"Apples", "Pears", "Oranges"};
		
		for(String word : words2) { // for each loop, works on collections only
			
			System.out.println(word);
			
		} // Prints out the data in array "words2"
		
		
		
		
		
	}

}
