package day46_statickeyword;

public class Vehicle {

	String type; 
	static int numberOfVehicles;
	
	public static void vehicleInfo() {
		
		// System.out.println(type); will not compile because a static method is referencing a non static field
		System.out.println("Number of vehicles: " + numberOfVehicles);
		
	}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
