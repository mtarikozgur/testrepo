package day45_constructors3;
import java.util.*;
public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;

	public EtsyAccount() {

		email = "";
		firstName = "";
		password = "";

	}
	
	public EtsyAccount(String email, String firstName, String password) { // This constructor uses setters to set the fields
		
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
		
	}
	
	public EtsyAccount(String email, String firstName) { // This constructor will call a method that will auto generate a password
		
		setEmail(email);
		setFirstName(firstName);
		this.password = autoGenerate();
		
	}
	
	public String autoGenerate() {
		
		Random r = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String randomPassword = "";
		for(int i = 1; i <= 6; i++) {
			randomPassword += letters.charAt(r.nextInt(letters.length())); // Gets a random letter from "letters" 
		}
		
		return randomPassword;
		
	}

	public String toString() {

		return ("Name: " + getFirstName() + ", email: " + getEmail() + ", password: " + getPassword());

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if(email.contains("@") && (email.indexOf("@") != 0 && email.indexOf("@") != email.length()-1)) this.email = email;
		else System.out.println("Invalid email");
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		
		if(isValidFirstName(firstName)) this.firstName = firstName;
		else System.out.println("Invalid first name");
	}
	
	private boolean isValidFirstName(String firstName) {
		
		char[] letters = firstName.toCharArray();
		
		for(char letter: letters) {
			
			if(!Character.isAlphabetic(letter) && letter != ' ') return false;
			
		}
		
		return true;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = "";
		if(password.length() < 6) System.out.println("Password must be at least 6 characters");
		else this.password = password;
		
	}

}
