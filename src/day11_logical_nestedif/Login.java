package day11_logical_nestedif;

import java.util.*;

public class Login {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		System.out.println("Enter username: ");
		
		String username = scan.next();
		
		System.out.println("Enter password: ");
		
		String password = scan.next();
		
		if(username.equalsIgnoreCase(validUsername) && password.contentEquals(validPassword)) {
			System.out.println("Login successful");
		} else if(!username.equalsIgnoreCase(validUsername) && !password.contentEquals(validPassword)) {
			System.out.println("Wrong username, wrong password");
		} else if(username.equalsIgnoreCase(validUsername) && !password.contentEquals(validPassword)) {
			System.out.println("Invalid Password");
		} else {
			System.out.println("Invalid Username");
		}
		
		
	}

}
