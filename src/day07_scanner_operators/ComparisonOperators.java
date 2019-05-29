package day07_scanner_operators;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		// == < > <= >= !=
		
		System.out.println(5 == 5); // All comparison operators will generate a boolean variable
		
		System.out.println(50 == 5); 
		
		int searchCount = 5000;
		System.out.println(searchCount == 5000); 
		
		int expectedCount = 5010;
		System.out.println(searchCount == expectedCount);
		
		
		int speedLimit = 55;
		int currentSpeed = 75;
		
		System.out.println(currentSpeed == speedLimit);
		
		boolean atLimit = currentSpeed == speedLimit;
		
		boolean overLimit = currentSpeed > speedLimit;
		System.out.println("Over the speed limit? " + overLimit);
		
		boolean underLimit = currentSpeed < speedLimit;
		System.out.println("Under the speed limit? " + underLimit);
		
		
		double balance = 150.0;
		
		boolean broke = balance <= 0.0;
		
		System.out.println("Broke? " + broke);
		
		
		double transaction = 155.5;
		
		broke = transaction >= balance;
		
		
	}
	
}
