package day30_methods2;

import java.util.*;

public class RangePrint {

	public static void main(String[] args) {

		rangePrint();
		
	}

	public static void rangePrint() {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = s.nextInt();

		System.out.println("Enter second number: ");
		int num2 = s.nextInt();

		if (num1 > num2) {

			for (int i = num1; i >= num2; i--) {
				System.out.print(i + " ");
			}

		} else if (num1 < num2) {

			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println(num1);
		}

	}

}
