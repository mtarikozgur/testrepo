package day08_casting_conditionals;

public class Relationals {

	public static void main(String[] args) {

		double d1 = 23.56;
		double d2 = 20.43;
		
		boolean check = d1 >= d2;
		
		System.out.println("Check: " + check);
		
		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		
		System.out.println(ch2 > ch1);
		System.out.println(ch1 > ch3); // The numeric value of character 'a' is greater than that of 'A'

		
		
	}

}
