package day30_methods2;

import java.util.*;

public class MethodPractice {

	public static void main(String[] args) {

		introduce();

	}

	public static void introduce() {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter name:");
		String name = s.nextLine();

		System.out.println("Nice to meet you, " + name);

	}

}
