package day40_customclasses_methods;

public class CellPhone {

	String brand = "Samsung"; // If we were to try to use this variable in our main method it would not work
	String color = "Red"; // For fields we need to create objects to use them.
	int screenSize = 17;
	double price = 199.99;
	
	public void call() { // These are not static methods, they are attached to objects. You must create an object in order to call these methods.
		
		System.out.println("Calling...");
		
	}
	
	public void message() { // Static methods do NOT need an object in order to be called.
		
		System.out.println("Sending sms...");
		
	}
	
}
