package day33_methods5;

public class AgeCalculator {

	public static void main(String[] args) {

		int age = calculateAge(1981);
		
		System.out.println(age);
		
	}

	public static int calculateAge(int year) {

		int age = 2019 - year;

		if (age < 0) {

			System.out.println("Invalid age");
			return -1;

		}

		if (age >= 1 && age < 15) {

			System.out.println("Child");

		}

		if (age >= 15 && age < 26) {

			System.out.println("Youngster");

		}

		if (age >= 26 && age < 65) {

			System.out.println("Adult");

		}

		if (age >= 65) {

			System.out.println("Senior");

		}

		return age;

	}

}
