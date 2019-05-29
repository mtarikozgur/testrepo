package day41_classesandmethods;

public class Microwave {

	String brand;
	boolean isOn;
	
	public void turnOn() {
		
		if(isOn) System.out.println("Already on!");
		else {
			
			isOn = true;
			System.out.println("Microwave is on now");
			
		}
		
	}
	
	public void turnOff() {
		
		if(!isOn) System.out.println("Already off!");
		else {
			
			isOn = false;
			System.out.println("Microwave is off now");
			
		}
		
	}
	
	public void heat(String food) {
		
		if(isOn) System.out.println("Heating up: " + food);
		else System.out.println("Microwave not on!");
		
	}
	
	

}
