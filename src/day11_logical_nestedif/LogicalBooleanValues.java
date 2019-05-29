package day11_logical_nestedif;

public class LogicalBooleanValues {

	public static void main(String[] args) {

		boolean b1 = 50 > 10 && 10 > 100; 
		boolean b2 = 'a' == 'a' && 123 > 120;
		boolean b3 = true && 10 >= 10 && 1000 <= 900;
		boolean b4 = false && true && 10 == 10;
		
		boolean b5 = false || true && 10 == 90;
		
		System.out.println(b5);
		
		boolean b6 = false && true || 10 == 10; // The && operator has higher precedence over ||
		
		System.out.println(b6);
		
		boolean b7 = false && false || 10 == 10;
		
		System.out.println(b7);
		
		boolean b8 = false && (false || 10 == 10);
		
		System.out.println(b8);
		

	}

}
