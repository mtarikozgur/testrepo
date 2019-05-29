package day46_statickeyword;

public class Campus {

	String city;
	static String country;
	
	static { // This block runs only once, in the beginning when the first object of this class is created, and before everything else.
		
		System.out.println("Static block"); 
		country = "USA";
		
	}
	
	static {
		
		System.out.println("Static block 2"); 
		country = "Canada";
		
	}
	
	public Campus(String city) {
		
		System.out.println("Constructor");
		this.city = city;
		
	}
	
	public static void campusInfo() {
		
		System.out.println("Welcome to campus!");
		
	}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
