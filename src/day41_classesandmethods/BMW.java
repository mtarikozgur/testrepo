package day41_classesandmethods;

public class BMW {

	String make = "BMW";
	String model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
		
		case"330i":
			price = 40250;
			break;
		case"740i":
			price = 86450;
			break;
		case"m3":
			price = 25259;
			break;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
