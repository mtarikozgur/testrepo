package day46_statickeyword;

public class CalcTests {

	public static void main(String[] args) {

		double result = Calculator.plus(55, 7); // Static way of calling methods
		
		System.out.println("Result: " + result);
		
		
		Calculator c = new Calculator();
		
		System.out.println(c.minus(66, 5));

	}

}
