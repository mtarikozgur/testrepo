package day41_classesandmethods;

public class MyCars {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 70;
		
		car1.printCarInfo();
		
		car1.showCurrentSpeed(20);
		
		car1.drive();
		
		car1.accelerate(20);
		
		System.out.println(car1.currentSpeed);
		
		BMW bmw1 = new BMW();
		
		System.out.println(bmw1.make);
		
		bmw1.model = "m3";
		
		bmw1.showPrice();
		
		System.out.println("Car price: $" + bmw1.price);
		
	}

}
