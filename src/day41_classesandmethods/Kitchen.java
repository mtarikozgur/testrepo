package day41_classesandmethods;

public class Kitchen {

	public static void main(String[] args) {

		Microwave m1 = new Microwave();
		
		m1.brand = "LG";
		m1.turnOn();
		m1.heat("Pizza");

	}

}
