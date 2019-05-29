package day31_methods3;

public class CallingMethodsFromDifferentClasses {

	public static void main(String[] args) {

		Calculator.add(1,2); // In order to call a method from a different class you need the class name
		Calculator.multiply(4, 5);
		
		// If you call a class from a different package, you will need to import the package first.
		// Use "import package.*" to import every class in that package, or "import package.class" to import a specific class
		
	}

}
