package day30_methods2;

public class MethodKeywords {

	public static void main(String[] args) { 

		print5Stars();
		
		for(int i = 0; i < 10; i++) {
			
			print5Stars();
			
		}
		
	}
	
	public static void print5Stars() { // The "public" keyword means that the method can be accessed by every class in the project.
									   // The "static" keyword means that the method does not need an object to be used/called. It can be called by its name if it is in the same class.
									   // It can also be called by classname.methodname.
									   // For example, Scanner scan = new Scanner(System.in) is not static because you use the "new" keyword.
									   // Arrays.sort(array) is static because you don't need the keyword.
									   // The "void" keyword indicates that the method does not return any value.
		
		System.out.println("*****");
		
	}

}
