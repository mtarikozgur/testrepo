package day30_methods2;

import java.util.*;

public class MyNumbers {

	public static void main(String[] args) {

		showMe5Numbers();

	}

	public static void showMe5Numbers() {

		Random r = new Random();

		for (int i = 0; i < 4; i++) {

			System.out.print(r.nextInt(1001) + ", ");

		}
		
		System.out.print(r.nextInt(1001));

	}

}
