package day34_methods6;

public class MethodOverloading {

	public static void main(String[] args) {

		add(2,3);
		add(6.7,3.6);
		add("gegesg", "wfagoaw");
		
		

	}

	public static void add(int num1, int num2) {

		System.out.println(num1 + num2);

	}

	public static void add(double num1, double num2) { // Both methods have the same name, but different parameters

		System.out.println(num1 + num2);

	}
	
	public static void add(String str1, String str2) {

		System.out.println(str1 + str2);

	}

}
