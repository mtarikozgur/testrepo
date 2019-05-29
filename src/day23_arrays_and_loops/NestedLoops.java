package day23_arrays_and_loops;

public class NestedLoops {

	public static void main(String[] args) {

		char letter = 'a';
		
		for(int i =0; i < 5; i++) {
			
			for(int j = 0; j < 26; j++) {
				
				System.out.print(letter);
				letter++;
				
			}
			
			System.out.println();
			
			for(int j = 0; j < 26; j++) {
				
				System.out.print("*");
				
			}
			
			letter = 'a';
			
			System.out.println();
			
		}
		
	}

}
