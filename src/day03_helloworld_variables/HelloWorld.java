package day03_helloworld_variables;
import java.util.*;
public class HelloWorld {

	public static void main(String[] arr) {
		System.out.println("Hello World!");
	
		

		double weight = 0;
	    double cal = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter weight in pounds:");
	    weight = scan.nextInt();
	    
	    double kilos = weight/2.2;
	    
	    cal = (0.0175 * (300 * 240 * 360) * kilos);
	    
	    System.out.println("Calories Burned: " + cal);
	    
		
		
	}
	
}
