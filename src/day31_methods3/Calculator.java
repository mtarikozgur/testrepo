package day31_methods3;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Num 1: ");
		double number1 = s.nextDouble();
		System.out.println("Num 2: ");
		double number2 = s.nextDouble();

		System.out.println("Select operation: ");

		String operator = s.next();

		switch (operator) {

		case "+":
			add(number1, number2);
			break;
		case "-":
			subtract(number1, number2);
			break;
		case "*":
			multiply(number1, number2);
			break;
		case "/":
			divide(number1, number2);
			break;
		case "%":
			remainder(number1, number2);
			break;
		default:
			System.out.println("Invalid operator");

		}

	}

	public static void add(double num1, double num2) {

		System.out.println(num1 + num2);

	}

	public static void subtract(double num1, double num2) {

		System.out.println(num1 - num2);

	}

	public static void multiply(double num1, double num2) {

		System.out.println(num1 * num2);

	}

	public static void divide(double num1, double num2) {

		System.out.println(num1 / num2);

	}

	public static void remainder(double num1, double num2) {

		System.out.println(num1 % num2);

	}

}
