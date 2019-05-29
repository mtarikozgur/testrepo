package day31_methods3;

public class MethodWithMultipleParams {

	public static void main(String[] args) {

		drive("Audi", 70);
		drive("Mazda", 60);

	}

	public static void drive(String car, int speed) {

		System.out.println(car + " is driving at " + speed + " mph");

	}

}
