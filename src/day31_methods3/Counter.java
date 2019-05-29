package day31_methods3;

import java.util.*;

public class Counter {

	public static void main(String[] args) {

		countUp(7);
		countDown(9);
		
	}

	public static void countUp(int num) {

		if (num < 1) {

			System.out.println("Invalid input");
			return;

		}

		for (int i = 1; i <= num; i++) {

			System.out.print(i + " ");

		}

	}

	public static void countDown(int num) {

		if (num < 1) {

			System.out.println("Invalid input");
			return;

		}

		for (int i = num; i >= 1; i--) {

			System.out.print(i + " ");

		}

	}

}
