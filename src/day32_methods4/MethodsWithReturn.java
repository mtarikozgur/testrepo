package day32_methods4;

public class MethodsWithReturn {

	public static void main(String[] args) {

		System.out.println(giveMe$10());
		System.out.println(giveMeYourName());
		
	}
	
	public static int giveMe$10() {
		
		System.out.println("Give me $10");
		return 10;
		
	}

	public static String giveMeYourName() {
		
		String name = "Bob";
		return name;
		
	}
	
}
