package day08_casting_conditionals;

public class ExplicitCasting {

	public static void main(String[] args) {

		System.out.println(10 / 2.0); // Java outputs data of the larger type in mixed data cases like this; in this case, double
		
		int result = (int)(10 / 2.0);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average = (rent1 + rent2 + rent3 + rent4) / 4; // Produces an int result which is then converted into a double
															  // This is why average becomes 1053.0
															  // If we convert one or more of these data types into double
															  // the result 1053.75 is a double data type before it is assigned to average.
		
		System.out.println(average);
		
		
		double d = 40.2;
		
		int i = (byte)d;

	}

}
