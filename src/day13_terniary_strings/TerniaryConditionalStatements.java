package day13_terniary_strings;

public class TerniaryConditionalStatements {

	public static void main(String[] args) {

		int max;
		int num1 = 1000;
		int num2 = 500;
		
		if(num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		
		max = num1 > num2 ? num1 : num2; // Is num1 > num2? If yes then max = num1, else max = num2		
		
	}

}
