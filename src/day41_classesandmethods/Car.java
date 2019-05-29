package day41_classesandmethods;

public class Car {

	String make;
	String model;
	String color;
	int currentSpeed;
	
	public void printCarInfo() {
		
		System.out.println(make);
		System.out.println(model);
		System.out.println(color);
		
	}
	
	public void showCurrentSpeed(int speedLimit) {
		
		if(currentSpeed > speedLimit) System.out.println("Speed is " + currentSpeed + ", too fast");
		else System.out.println("Speed is " + currentSpeed + ", legal speed");
		
	}
	
	public void drive() {
		
		System.out.println(make + " " + model + " is driving");
		
	}
	
	public void accelerate(int mph) {
		
		currentSpeed += mph;
		
	}
	
}
